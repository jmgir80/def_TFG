package in2.liferay.crud.horari.portlet;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.PropertyFactoryUtil;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.servlet.SessionErrors;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.ParamUtil;
import com.liferay.portal.kernel.util.Validator;
import com.liferay.portal.kernel.util.WebKeys;
import in2.liferay.crud.horari.constants.HorariPortletKeys;
import in2.liferay.crud.horari.model.Horari;
import in2.liferay.crud.horari.model.*;



import in2.liferay.crud.horari.service.HorariLocalService;


import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.*;
import java.text.DateFormat;
import java.time.LocalDate;

import in2.liferay.crud.horari.service.HorariLocalServiceUtil;
import in2.liferay.crud.horari.service.persistence.HorariUtil;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.YearMonth;
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
				"javax.portlet.display-name=Horari",
				"javax.portlet.init-param.template-path=/",
				"javax.portlet.init-param.view-template=/view.jsp",
				"javax.portlet.name=" + HorariPortletKeys.HORARI,
				"javax.portlet.resource-bundle=content.Language",
				"javax.portlet.security-role-ref=power-user,user"
		},
		service = Portlet.class
)
public class HorariPortlet extends MVCPortlet{


	@Reference
	HorariLocalService horariLocalService;

	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {
		ThemeDisplay td = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);

		List<Horari> horariList = horariLocalService.findByUsernameAndYear(td.getUser().getFullName());
		List<Horari> horariAvui = new ArrayList<>();
		LinkedHashMap<Date, List<Horari>> hashMes = new LinkedHashMap<Date, List<Horari>>();

		int horasTotalesHoy = 0;
		int minTotalesHoy = 0;
		int horesTotalsDelMes = 0;
		int minTotalsDelMes = 0;

		Calendar hoy = Calendar.getInstance();
		Calendar calDesde = Calendar.getInstance();
		Calendar calHasta = Calendar.getInstance();

		for (int i = 0; i < horariList.size(); i++) {

			if (horariList.get(i).getDesde() != null) {

				calDesde.setTime(horariList.get(i).getDesde());

				if(horariList.get(i).getHasta() != null){
					if(calDesde.get(Calendar.MONTH) == hoy.get(Calendar.MONTH) && calDesde.get(Calendar.YEAR) == hoy.get(Calendar.YEAR))
					{
						horesTotalsDelMes += calHasta.get(Calendar.HOUR_OF_DAY) - calDesde.get(Calendar.HOUR_OF_DAY);
						minTotalsDelMes += calHasta.get(Calendar.MINUTE) - calDesde.get(Calendar.MINUTE);
					}

					calHasta.setTime(horariList.get(i).getHasta()); ////////////aqui esta el errorrrrrrr

					//para tener lista de horarios y las horas totales de hoy
					if(calDesde.get(Calendar.DAY_OF_YEAR) == hoy.get(Calendar.DAY_OF_YEAR) && calDesde.get(Calendar.YEAR) == hoy.get(Calendar.YEAR))
					{
						horasTotalesHoy += calHasta.get(Calendar.HOUR_OF_DAY) - calDesde.get(Calendar.HOUR_OF_DAY);
						minTotalesHoy += calHasta.get(Calendar.MINUTE) - calDesde.get(Calendar.MINUTE);
						horariAvui.add(horariList.get(i));
					}
				} else {

					if(calDesde.get(Calendar.MONTH) == hoy.get(Calendar.MONTH) && calDesde.get(Calendar.YEAR) == hoy.get(Calendar.YEAR))
					{
						horesTotalsDelMes += calHasta.get(Calendar.HOUR_OF_DAY) - calDesde.get(Calendar.HOUR_OF_DAY);
						minTotalsDelMes += calHasta.get(Calendar.MINUTE) - calDesde.get(Calendar.MINUTE);
						horariAvui.add(horariList.get(i));///////////////////////////////////////// va aqui?
					}
				}
			}
		}
		List<Horari> horariMes = null;

		Calendar mes = Calendar.getInstance();
		YearMonth yearMonthObject = YearMonth.of(hoy.get(Calendar.YEAR), hoy.get(Calendar.MONTH)+1);
		int diasMes = yearMonthObject.lengthOfMonth();
		for (int n = 0; n < diasMes; n++) {
			horariMes = new ArrayList<>();
			for (int y = 0; y < horariList.size(); y++) {
				Calendar cal = Calendar.getInstance();
				cal.setTime(horariList.get(y).getDesde());
				if (cal.get(Calendar.DAY_OF_MONTH) == n+1 && cal.get(Calendar.MONTH) == mes.get(Calendar.MONTH) && cal.get(Calendar.DAY_OF_YEAR) != mes.get(Calendar.DAY_OF_YEAR)) {
					System.out.println("dia:" + cal.get(Calendar.DAY_OF_MONTH));
					System.out.println("mes:" + cal.get(Calendar.MONTH));
					horariMes.add(horariList.get(y));
					}
				}
				System.out.println("hmes:" + horariMes);
				if(!horariMes.isEmpty()) {
					hashMes.put(horariMes.get(0).getDesde(),horariMes);
				}
			}
		System.out.println("hashmes" + hashMes.keySet());
		List<Horari> definitivaAvui = new ArrayList<>();
		long temp = 0;
		int index = 0;
		Horari ultimRegistre = null;
		while(!horariAvui.isEmpty())
		{
			System.out.println("entro");
			index= 0;
			temp = 0;
			for (int j = 0; j < horariAvui.size(); j++) {
				if(horariAvui.get(j).getDesde().getTime() > temp)
				{
					temp = horariAvui.get(j).getDesde().getTime();
					index = j;
				}
			}
			definitivaAvui.add(0,horariAvui.get(index));
			horariAvui.remove(index);
		}

		Date date = new Date();
		String avui = new SimpleDateFormat("dd-MM-yyyy").format(date);

		renderRequest.setAttribute("horariList", horariList);
		renderRequest.setAttribute("horariAvui", definitivaAvui);
		renderRequest.setAttribute("hashMes", hashMes);
		renderRequest.setAttribute("avui", avui);
		renderRequest.setAttribute("horesTotalsDelMes", horesTotalsDelMes);
		renderRequest.setAttribute("minTotalsDelMes", minTotalsDelMes);
		renderRequest.setAttribute("horasTotalesHoy", horasTotalesHoy);
		renderRequest.setAttribute("minTotalesHoy", minTotalesHoy);
		super.render(renderRequest, renderResponse);

	}


	@ProcessAction(name = "addHorari")
	public void addHorari(final ActionRequest request, final ActionResponse response) throws ParseException, PortalException {
		final ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		String desde = ParamUtil.getString(request, "desde");
		String hasta = ParamUtil.getString(request, "hasta");
		String dia = ParamUtil.getString(request, "dia");
		String[] desdeSplit = desde.split(":");
		String[] hastaSplit = hasta.split(":");
		String[] diaSplit = dia.split("/");

		LocalDate currentdate = LocalDate.now();

		Calendar desdCal = Calendar.getInstance();
		Calendar hastCal = Calendar.getInstance();
		desdCal.set(Integer.parseInt(diaSplit[2]),Integer.parseInt(diaSplit[1])-1,Integer.parseInt(diaSplit[0]),Integer.parseInt(desdeSplit[0]),Integer.parseInt(desdeSplit[1]));
		Date desdeDate = new Date(desdCal.getTimeInMillis());
		hastCal.set(Integer.parseInt(diaSplit[2]),Integer.parseInt(diaSplit[1])-1,Integer.parseInt(diaSplit[0]),Integer.parseInt(hastaSplit[0]),Integer.parseInt(hastaSplit[1]));
		Date hastaDate = new Date(hastCal.getTimeInMillis());

		horariLocalService.addHorari(td.getScopeGroupId(), td.getCompanyId(),
				td.getUser().getUserId(), td.getUser().getFullName(),
				desdeDate, hastaDate);
	}

	@ProcessAction(name = "updateHorari")
	public void updateHorari(ActionRequest actionRequest, ActionResponse actionResponse) {

		long horariId = ParamUtil.getLong(actionRequest, "horariId");
		DateFormat df = DateFormat.getDateInstance();
		Date desdeMod = ParamUtil.getDate(actionRequest, "desdeMod",df);

		Horari horariMod = null;
		try {
			horariMod = horariLocalService.getHorari(horariId);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}

		assert horariMod != null;
		horariMod.setDesde(desdeMod);
		horariLocalService.updateHorari(horariMod);

	}

	@ProcessAction(name = "deleteHorari")
	public void deleteHorari(ActionRequest actionRequest, ActionResponse actionResponse) {
		long horariId = ParamUtil.getLong(actionRequest, "horariId");
		try {
			Horari vac = horariLocalService.deleteHorari(horariId);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}
	}

	@ProcessAction(name = "addDesde")
	public void addDesde(final ActionRequest request, final ActionResponse response) {

		final ThemeDisplay td = (ThemeDisplay) request.getAttribute(WebKeys.THEME_DISPLAY);

		horariLocalService.addHorari(td.getScopeGroupId(), td.getCompanyId(),
				td.getUser().getUserId(), td.getUser().getFullName(),
				new Date(), null);
	}

	@ProcessAction(name = "addHasta")
	public void addHasta(final ActionRequest request, final ActionResponse response) {

		String horariId = ParamUtil.getString(request, "horariId");

		long HorariIdLong = Long.valueOf(horariId).longValue();
		Horari horariMod = null;
		try {
			horariMod = horariLocalService.getHorari(HorariIdLong);
		} catch (Exception exception) {
			System.out.println(exception.getMessage());
		}

		horariMod.setHasta(new Date());
		horariLocalService.updateHorari(horariMod);

	}

}