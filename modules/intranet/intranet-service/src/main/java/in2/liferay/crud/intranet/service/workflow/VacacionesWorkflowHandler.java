package in2.liferay.crud.intranet.service.workflow;

import java.io.Serializable;
import java.util.Locale;
import java.util.Map;

import in2.liferay.crud.intranet.model.Vacaciones;
import in2.liferay.crud.intranet.service.VacacionesLocalService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.security.permission.ResourceActionsUtil;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.workflow.BaseWorkflowHandler;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandler;


import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component(immediate = true, service = WorkflowHandler.class)
public class VacacionesWorkflowHandler extends BaseWorkflowHandler<Vacaciones> {

    @Override
    public String getClassName() {
        return Vacaciones.class.getName();
    }

    @Override
    public String getType(Locale locale) {
        return ResourceActionsUtil.getModelResource(locale, getClassName());
    }

    @Override
    public Vacaciones updateStatus(int status, Map<String, Serializable> workflowContext) throws PortalException {
        long userId = GetterUtil.getLong(
                (String)workflowContext.get(WorkflowConstants.CONTEXT_USER_ID));
        long classPK = GetterUtil.getLong(
                (String)workflowContext.get(
                        WorkflowConstants.CONTEXT_ENTRY_CLASS_PK));

        ServiceContext serviceContext = (ServiceContext)workflowContext.get(
                WorkflowConstants.CONTEXT_SERVICE_CONTEXT);

        return _vacacionesLocalService.updateStatus(
                userId, classPK, status, serviceContext);
    }

    @Reference(unbind = "-")
    protected void setVacacionesLocalService(
            VacacionesLocalService vacacionesLocalService) {

        _vacacionesLocalService = vacacionesLocalService;
    }

    private VacacionesLocalService _vacacionesLocalService;

}