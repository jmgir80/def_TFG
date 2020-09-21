/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package in2.liferay.crud.intranet.service.impl;

import com.liferay.portal.aop.AopService;
import in2.liferay.crud.intranet.service.base.VacacionesLocalServiceBaseImpl;
import org.osgi.service.component.annotations.Component;

import com.liferay.asset.kernel.model.AssetEntry;
import in2.liferay.crud.intranet.model.Vacaciones;
import in2.liferay.crud.intranet.model.impl.VacacionesImpl;
import in2.liferay.crud.intranet.service.base.VacacionesLocalServiceBaseImpl;
import com.liferay.portal.aop.AopService;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.search.*;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.ContentTypes;
import com.liferay.portal.kernel.workflow.WorkflowConstants;
import com.liferay.portal.kernel.workflow.WorkflowHandlerRegistryUtil;
import org.osgi.service.component.annotations.Component;
import java.util.Date;
import java.util.List;


/**
 * The implementation of the vacaciones local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>in2.liferay.crud.intranet.service.VacacionesLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VacacionesLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=in2.liferay.crud.intranet.model.Vacaciones",
	service = AopService.class
)
public class VacacionesLocalServiceImpl extends VacacionesLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>in2.liferay.crud.intranet.service.VacacionesLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>in2.liferay.crud.intranet.service.VacacionesLocalServiceUtil</code>.
	 */
	public void addVacaciones(long groupId, long companyId, long userId, String userName, Date desde, Date hasta,
							  String comentarios, long calendarBookingId) {
		Vacaciones vacaciones = new VacacionesImpl();
		User user = null;
		try {
			user = userLocalService.getUser(userId);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		vacaciones.setVacId(counterLocalService.increment());
		vacaciones.setGroupId(groupId);
		vacaciones.setCompanyId(companyId);
		vacaciones.setUserId(userId);
		vacaciones.setUserName(userName);
		vacaciones.setCalendarBookingId(calendarBookingId);
		vacaciones.setDesde(desde);
		vacaciones.setHasta(hasta);
		vacaciones.setComentarios(comentarios);

		ServiceContext serviceContext = new ServiceContext();
		serviceContext.setScopeGroupId(groupId);

		vacaciones.setStatus(WorkflowConstants.STATUS_DRAFT);
		System.out.print(WorkflowConstants.STATUS_DRAFT);
		vacaciones.setStatusByUserId(userId);
		vacaciones.setStatusByUserName(user.getFullName());
		vacaciones.setStatusDate(serviceContext.getModifiedDate(null));

		AssetEntry assetEntry = updateAsset(userId, vacaciones);
		vacaciones = vacacionesLocalService.addVacaciones(vacaciones);

		try {
			WorkflowHandlerRegistryUtil.startWorkflowInstance(vacaciones.getCompanyId(), vacaciones.getGroupId(),
					vacaciones.getUserId(), Vacaciones.class.getName(), vacaciones.getPrimaryKey(), vacaciones,
					serviceContext);
		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public AssetEntry updateAsset(long userId, Vacaciones page) {

		AssetEntry assetEntry = null;
		try {
			assetEntry = assetEntryLocalService.updateEntry(userId, page.getGroupId(), page.getCreateDate(),
					page.getModifiedDate(), Vacaciones.class.getName(), page.getPrimaryKey(), page.getUuid(), 0,
					null, null, true, true, null, null, null, null, ContentTypes.TEXT_HTML, null,
					null, null, null, null, 0, 0, null);
		} catch (PortalException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		Indexer<Vacaciones> indexer = IndexerRegistryUtil.nullSafeGetIndexer(Vacaciones.class);

		try {
			indexer.reindex(page);
		} catch (SearchException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return assetEntry;
	}

	public void deleteAsset(Vacaciones entry) throws SearchException {
		try {
			assetEntryLocalService.deleteEntry(Vacaciones.class.getName(), entry.getVacId());
			workflowInstanceLinkLocalService.deleteWorkflowInstanceLinks(
					entry.getCompanyId(), entry.getGroupId(),
					Vacaciones.class.getName(), entry.getVacId());

		} catch (PortalException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Indexer<Vacaciones> indexer = IndexerRegistryUtil.nullSafeGetIndexer(Vacaciones.class);
		indexer.delete(entry);
	}

	@Indexable(type = IndexableType.REINDEX)
	public Vacaciones updateStatus(long userId, long entryId, int status, ServiceContext serviceContext) throws PortalException {

		User user = userLocalService.getUser(userId);
		Vacaciones entry = getVacaciones(entryId);
		entry.setStatus(status);
		entry.setStatusByUserId(userId);
		entry.setStatusByUserName(user.getFullName());
		entry.setStatusDate(new Date());

		vacacionesPersistence.update(entry);

		if (status == WorkflowConstants.STATUS_APPROVED) {
			assetEntryLocalService.updateVisible(
					Vacaciones.class.getName(), entryId, true);
		} else {
			assetEntryLocalService.updateVisible(
					Vacaciones.class.getName(), entryId, false);
		}

		return entry;
	}

	public List<Vacaciones> findByIdGroup(long groupId){
		return this.vacacionesPersistence.findBygroupId(groupId);
	}
}