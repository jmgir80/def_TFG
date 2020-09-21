package in2.liferay.crud.grupsTreball.portlet;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.Group;
import com.liferay.portal.kernel.model.Role;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.UserGroupRole;
import com.liferay.portal.kernel.service.*;
import com.liferay.portal.kernel.theme.ThemeDisplay;
import com.liferay.portal.kernel.util.WebKeys;
import in2.liferay.crud.grupsTreball.constants.GrupsTreballPortletKeys;

import com.liferay.portal.kernel.portlet.bridges.mvc.MVCPortlet;

import javax.portlet.Portlet;
import javax.portlet.PortletException;
import javax.portlet.RenderRequest;
import javax.portlet.RenderResponse;

import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

import java.io.IOException;
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
		"javax.portlet.display-name=GrupsTreball",
		"javax.portlet.init-param.template-path=/",
		"javax.portlet.init-param.view-template=/view.jsp",
		"javax.portlet.name=" + GrupsTreballPortletKeys.GRUPSTREBALL,
		"javax.portlet.resource-bundle=content.Language",
		"javax.portlet.security-role-ref=power-user,user"
	},
	service = Portlet.class
)
public class GrupsTreballPortlet extends MVCPortlet {

	@Reference
	GroupLocalService groupLocalService;

	@Reference
	UserLocalService userLocalService;

	@Reference
	RoleLocalService roleLocalService;

	@Reference
	UserGroupRoleLocalService userGroupRoleLocalService;


	@Override
	public void render(RenderRequest renderRequest, RenderResponse renderResponse) throws IOException, PortletException {

				ThemeDisplay td = (ThemeDisplay) renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
				List<User> grupNom = new ArrayList<>();
				List<User> grupUsers = new ArrayList<>();
				HashMap<String, List<User>> directori = new HashMap<String, List<User>>();
				List<Group> groupList = groupLocalService.getActiveGroups(td.getCompanyId(),true);
				List<User> userList = new ArrayList<>();
				List<UserGroupRole> userGroupRoleList = new ArrayList<>();
				List<User> userRoles = new ArrayList<>();
				Role role = null;
		for (Group group : groupList) {

			if(group.getSite() && !group.getGroupKey().equals("Guest") && !group.getGroupKey().equals("20095") && !group.getGroupKey().equals("Principal")){

				userList = userLocalService.getGroupUsers(group.getGroupId());

				System.out.println("role");

				User jefe = null;
				for (User user : userList) {
					userGroupRoleList = userGroupRoleLocalService.getUserGroupRoles(user.getUserId(),group.getGroupId());


					for (UserGroupRole userRole : userGroupRoleList) {
                        boolean eliminar = false;

						try {
							if(userRole.getRole().getRoleId() == 34473) // rol del Jefe
							{
								eliminar = true;
							}
						} catch (PortalException e) {
							e.printStackTrace();
						}
						if(eliminar){
						jefe = user;
						}
					}
				}
				if(jefe != null) {
					userList.remove(jefe);
					userList.add(0, jefe);
				}
				userList.removeIf(admin -> admin.getEmailAddress().equals("test@liferay.com"));
				directori.put(group.getName(),userList);
			}
		}
		System.out.println("ttttttttttttttttttttttt");
		System.out.println(directori);

		renderRequest.setAttribute("directori", directori);
		super.render(renderRequest, renderResponse);
	}

}





