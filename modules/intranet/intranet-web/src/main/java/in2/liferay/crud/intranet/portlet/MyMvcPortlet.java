package in2.liferay.crud.intranet.portlet;

import com.liferay.calendar.model.CalendarResource;
import com.liferay.calendar.service.CalendarLocalService;
import com.liferay.calendar.service.CalendarResourceLocalServiceUtil;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQueryFactoryUtil;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.dao.orm.RestrictionsFactoryUtil;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.portlet.PortletClassLoaderUtil;
import com.liferay.portal.kernel.util.PortalClassLoaderUtil;
import in2.liferay.crud.intranet.constants.MyMvcPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;

import org.osgi.service.component.annotations.Component;

import com.liferay.calendar.model.Calendar;
import com.liferay.calendar.model.CalendarBooking;
import com.liferay.calendar.service.CalendarBookingLocalServiceUtil;
import com.liferay.calendar.service.CalendarLocalServiceUtil;
import com.liferay.counter.kernel.service.CounterLocalService;
import in2.liferay.crud.intranet.constants.MyMvcPortletKeys;
import in2.liferay.crud.intranet.model.Vacaciones;
import in2.liferay.crud.intranet.service.VacacionesLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.UserGroupRole;
import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;
import com.liferay.portal.kernel.service.*;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;
import javax.servlet.http.HttpServletRequest;

import javax.portlet.*;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.*;

/**
 * @author josepgs
 */
@Component(
	immediate = true,
	property = {
		"com.liferay.portlet.display-category=category.sample",
		"com.liferay.portlet.header-portlet-css=/css/main.css",
		"com.liferay.portlet.instanceable=true",
		"javax.portlet.display-name=MyMvc",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + MyMvcPortletKeys.MYMVC,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class MyMvcPortlet extends MVCPortlet {

	//CREATE
	@Reference
	CounterLocalService counterLocalService;

	@Reference
	VacacionesLocalService vacacionesLocalService;

	@ProcessAction(name = "addVacaciones")
	public void addVacaciones(final ActionRequest request, final ActionResponse response) throws ParseException, PortalException {
		final ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);
		//long vacacionesId = counterLocalService.increment(Vacaciones.class.getName());
		String desde = ParamUtil.getString(request, "formDesde");
		String hasta = ParamUtil.getString(request, "formHasta");
		String comentarios = ParamUtil.getString(request, "formComments");

		Date date1 = new SimpleDateFormat("yyyy-MM-dd").parse(desde);
		Date date2 = new SimpleDateFormat("yyyy-MM-dd").parse(hasta);

		long miliDesde = date1.getTime();
		long miliHasta = date2.getTime();

		if(miliDesde > miliHasta){

			SessionErrors.add(request, "error");

		}else{

			vacacionesLocalService.addVacaciones(td.getScopeGroupId(), td.getCompanyId(),
					td.getUser().getUserId(), td.getUser().getFullName(),
					date1, date2, comentarios,0);
		}
	}

	@Override
	public void render(final RenderRequest renderRequest, final RenderResponse renderResponse) throws IOException, PortletException {

		ThemeDisplay td = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
		long groupIdActual = td.getLayout().getGroupId();
		long userIdActual = td.getUser().getUserId();
		boolean canValidate = false;
		List<UserGroupRole> userRoles = UserGroupRoleLocalServiceUtil.getUserGroupRoles(userIdActual);

		try {
			Role role = RoleLocalServiceUtil.getRole(td.getCompanyId(),"Site Content Reviewer");
		} catch (PortalException e) {
			e.printStackTrace();
		}


		for (UserGroupRole userRole : userRoles) {
			if (userRole.getRoleId() == userRole.getRoleId()) {

				canValidate = true;
			}
		}
		List<Vacaciones> vacacionesList = vacacionesLocalService.findByIdGroup(groupIdActual);


		long[] userList = UserLocalServiceUtil.getGroupUserIds(groupIdActual);
		boolean exists = false;
		for (long temp : userList) {
			if (temp == userIdActual) {
				exists = true;
			}
		}
		renderRequest.setAttribute("boolean", exists);
		renderRequest.setAttribute("vacacionesList", vacacionesList);
		renderRequest.setAttribute("canValidate", canValidate);
		super.render(renderRequest, renderResponse);

	}

	@ProcessAction(name = "updateVacaciones")
	public void updateVacaciones(ActionRequest actionRequest, ActionResponse actionResponse) {

		long vacacionesId = ParamUtil.getLong(actionRequest, "vacacionesId");

		Vacaciones vacaciones = null;
		try {
			vacaciones = vacacionesLocalService.getVacaciones(vacacionesId);

		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}

		if(Validator.isNotNull(vacaciones)) {
			vacaciones.setStatus(0);
			vacacionesLocalService.updateVacaciones(vacaciones);
		}
	}

	//DELETE
	@ProcessAction(name = "deleteVacaciones")
	public void deleteVacaciones(ActionRequest actionRequest, ActionResponse actionResponse) {
		long vacacionesId = ParamUtil.getLong(actionRequest, "vacacionesId");
		try {
			vacacionesLocalService.deleteAsset(vacacionesLocalService.getVacaciones(vacacionesId));
			Vacaciones vac = vacacionesLocalService.deleteVacaciones(vacacionesId);
			CalendarBookingLocalServiceUtil.deleteCalendarBooking(vac.getCalendarBookingId());
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}

	@ProcessAction(name = "validarVacaciones")
	public void validarVacaciones(ActionRequest actionRequest, ActionResponse actionResponse) throws PortalException {

		long vacacionesId = ParamUtil.getLong(actionRequest, "vacacionesId");
		final ThemeDisplay td = (ThemeDisplay) actionRequest.getAttribute(WebKeys.THEME_DISPLAY);

		Vacaciones vacaciones = null;
		try {
			vacaciones = vacacionesLocalService.getVacaciones(vacacionesId);
			vacaciones.setStatus(-1);
			Calendar actualCal = CalendarLocalServiceUtil.fetchGroupCalendar(td.getCompanyId(),td.getScopeGroupId(),td.getScopeGroupName());


			long[] childs = null;
			long recurringCalendarBookingId = 0;
			String location = null;
			long userId = td.getUser().getUserId();

			long calendarId = actualCal.getCalendarId();
			long[] childCalendarIds = new long[0];
			long parentCalendarBookingId = 0;
			Map<Locale, String> descriptionMap = new HashMap<>();
			Map<Locale, String> titleMap = new HashMap<>();
			titleMap.put(Locale.getDefault(),"Vacaciones de " + vacaciones.getUserName());
			Map<Locale, String> calTitleMap = new HashMap<>();
			calTitleMap.put(Locale.getDefault(),"Vacaciones de " + vacaciones.getUserName());
			long startTime = vacaciones.getDesde().getTime();
			long endTime =  vacaciones.getHasta().getTime();
			boolean allDay = true;
			String recurrence = null;
			long firstReminder = 0;
			String firstReminderType = "email";
			long secondReminder = 0;
			String secondReminderType = "email";
			ServiceContext serviceContext = ServiceContextThreadLocal.getServiceContext();
			Calendar vacCal = null;

			Map<Locale, String> calSearch = new HashMap<>();
			calSearch.put(Locale.getDefault(),"Vacaciones de " + td.getScopeGroupName());

			DynamicQuery calendarQuery =CalendarLocalServiceUtil.dynamicQuery().add(PropertyFactoryUtil.forName("name").like("%>Vacaciones de " + td.getScopeGroupName() + "<%"));
			List<Calendar> calList = CalendarLocalServiceUtil.dynamicQuery(calendarQuery);


			System.out.println(calList);

			if(!calList.isEmpty()) {
				System.out.println("no estoy vacia");
				vacCal = calList.get(0);
			}
			if(vacCal == null){
				System.out.println("estoy vacia");
				System.out.println("holiiii");
  				Map<Locale, String> nameMap = new HashMap<>();
				nameMap.put(Locale.getDefault(),"Vacaciones de " + td.getScopeGroupName());

				vacCal = CalendarLocalServiceUtil.addCalendar(userId,td.getScopeGroupId(),actualCal.getCalendarResourceId(),nameMap,descriptionMap,"UTC",6720729,true,false,false,serviceContext);
			}
			CalendarBooking event = CalendarBookingLocalServiceUtil.addCalendarBooking(userId, vacCal.getCalendarId(), childCalendarIds,parentCalendarBookingId , recurringCalendarBookingId, titleMap, descriptionMap, location, startTime, endTime, allDay, recurrence, firstReminder, firstReminderType, secondReminder, secondReminderType, serviceContext);
			vacaciones.setCalendarBookingId(event.getCalendarBookingId());
			vacacionesLocalService.updateVacaciones(vacaciones);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}

}
}


