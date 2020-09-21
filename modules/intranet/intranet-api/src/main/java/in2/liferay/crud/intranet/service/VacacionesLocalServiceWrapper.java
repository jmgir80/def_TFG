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

package in2.liferay.crud.intranet.service;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.search.SearchException;
import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VacacionesLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see VacacionesLocalService
 * @generated
 */
public class VacacionesLocalServiceWrapper
	implements ServiceWrapper<VacacionesLocalService>, VacacionesLocalService {

	public VacacionesLocalServiceWrapper(
		VacacionesLocalService vacacionesLocalService) {

		_vacacionesLocalService = vacacionesLocalService;
	}

	@Override
	public void addVacaciones(
		long groupId, long companyId, long userId, String userName,
		java.util.Date desde, java.util.Date hasta, String comentarios,
		long calendarBookingId) {

		_vacacionesLocalService.addVacaciones(
			groupId, companyId, userId, userName, desde, hasta, comentarios,
			calendarBookingId);
	}

	/**
	 * Adds the vacaciones to the database. Also notifies the appropriate model listeners.
	 *
	 * @param vacaciones the vacaciones
	 * @return the vacaciones that was added
	 */
	@Override
	public in2.liferay.crud.intranet.model.Vacaciones addVacaciones(
		in2.liferay.crud.intranet.model.Vacaciones vacaciones) {

		return _vacacionesLocalService.addVacaciones(vacaciones);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vacacionesLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Creates a new vacaciones with the primary key. Does not add the vacaciones to the database.
	 *
	 * @param vacId the primary key for the new vacaciones
	 * @return the new vacaciones
	 */
	@Override
	public in2.liferay.crud.intranet.model.Vacaciones createVacaciones(
		long vacId) {

		return _vacacionesLocalService.createVacaciones(vacId);
	}

	@Override
	public void deleteAsset(in2.liferay.crud.intranet.model.Vacaciones entry)
		throws SearchException {

		_vacacionesLocalService.deleteAsset(entry);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vacacionesLocalService.deletePersistedModel(persistedModel);
	}

	/**
	 * Deletes the vacaciones with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vacId the primary key of the vacaciones
	 * @return the vacaciones that was removed
	 * @throws PortalException if a vacaciones with the primary key could not be found
	 */
	@Override
	public in2.liferay.crud.intranet.model.Vacaciones deleteVacaciones(
			long vacId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vacacionesLocalService.deleteVacaciones(vacId);
	}

	/**
	 * Deletes the vacaciones from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vacaciones the vacaciones
	 * @return the vacaciones that was removed
	 */
	@Override
	public in2.liferay.crud.intranet.model.Vacaciones deleteVacaciones(
		in2.liferay.crud.intranet.model.Vacaciones vacaciones) {

		return _vacacionesLocalService.deleteVacaciones(vacaciones);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _vacacionesLocalService.dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _vacacionesLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>in2.liferay.crud.intranet.model.impl.VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @return the range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return _vacacionesLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>in2.liferay.crud.intranet.model.impl.VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param dynamicQuery the dynamic query
	 * @param start the lower bound of the range of model instances
	 * @param end the upper bound of the range of model instances (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching rows
	 */
	@Override
	public <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return _vacacionesLocalService.dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return _vacacionesLocalService.dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Override
	public long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return _vacacionesLocalService.dynamicQueryCount(
			dynamicQuery, projection);
	}

	@Override
	public in2.liferay.crud.intranet.model.Vacaciones fetchVacaciones(
		long vacId) {

		return _vacacionesLocalService.fetchVacaciones(vacId);
	}

	/**
	 * Returns the vacaciones matching the UUID and group.
	 *
	 * @param uuid the vacaciones's UUID
	 * @param groupId the primary key of the group
	 * @return the matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	@Override
	public in2.liferay.crud.intranet.model.Vacaciones
		fetchVacacionesByUuidAndGroupId(String uuid, long groupId) {

		return _vacacionesLocalService.fetchVacacionesByUuidAndGroupId(
			uuid, groupId);
	}

	@Override
	public java.util.List<in2.liferay.crud.intranet.model.Vacaciones>
		findByIdGroup(long groupId) {

		return _vacacionesLocalService.findByIdGroup(groupId);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _vacacionesLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _vacacionesLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _vacacionesLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _vacacionesLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vacacionesLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Returns the vacaciones with the primary key.
	 *
	 * @param vacId the primary key of the vacaciones
	 * @return the vacaciones
	 * @throws PortalException if a vacaciones with the primary key could not be found
	 */
	@Override
	public in2.liferay.crud.intranet.model.Vacaciones getVacaciones(long vacId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vacacionesLocalService.getVacaciones(vacId);
	}

	/**
	 * Returns the vacaciones matching the UUID and group.
	 *
	 * @param uuid the vacaciones's UUID
	 * @param groupId the primary key of the group
	 * @return the matching vacaciones
	 * @throws PortalException if a matching vacaciones could not be found
	 */
	@Override
	public in2.liferay.crud.intranet.model.Vacaciones
			getVacacionesByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vacacionesLocalService.getVacacionesByUuidAndGroupId(
			uuid, groupId);
	}

	/**
	 * Returns a range of all the vacacioneses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>in2.liferay.crud.intranet.model.impl.VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @return the range of vacacioneses
	 */
	@Override
	public java.util.List<in2.liferay.crud.intranet.model.Vacaciones>
		getVacacioneses(int start, int end) {

		return _vacacionesLocalService.getVacacioneses(start, end);
	}

	/**
	 * Returns all the vacacioneses matching the UUID and company.
	 *
	 * @param uuid the UUID of the vacacioneses
	 * @param companyId the primary key of the company
	 * @return the matching vacacioneses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<in2.liferay.crud.intranet.model.Vacaciones>
		getVacacionesesByUuidAndCompanyId(String uuid, long companyId) {

		return _vacacionesLocalService.getVacacionesesByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of vacacioneses matching the UUID and company.
	 *
	 * @param uuid the UUID of the vacacioneses
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching vacacioneses, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<in2.liferay.crud.intranet.model.Vacaciones>
		getVacacionesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<in2.liferay.crud.intranet.model.Vacaciones>
					orderByComparator) {

		return _vacacionesLocalService.getVacacionesesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of vacacioneses.
	 *
	 * @return the number of vacacioneses
	 */
	@Override
	public int getVacacionesesCount() {
		return _vacacionesLocalService.getVacacionesesCount();
	}

	@Override
	public com.liferay.asset.kernel.model.AssetEntry updateAsset(
		long userId, in2.liferay.crud.intranet.model.Vacaciones page) {

		return _vacacionesLocalService.updateAsset(userId, page);
	}

	@Override
	public in2.liferay.crud.intranet.model.Vacaciones updateStatus(
			long userId, long entryId, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _vacacionesLocalService.updateStatus(
			userId, entryId, status, serviceContext);
	}

	/**
	 * Updates the vacaciones in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param vacaciones the vacaciones
	 * @return the vacaciones that was updated
	 */
	@Override
	public in2.liferay.crud.intranet.model.Vacaciones updateVacaciones(
		in2.liferay.crud.intranet.model.Vacaciones vacaciones) {

		return _vacacionesLocalService.updateVacaciones(vacaciones);
	}

	@Override
	public VacacionesLocalService getWrappedService() {
		return _vacacionesLocalService;
	}

	@Override
	public void setWrappedService(
		VacacionesLocalService vacacionesLocalService) {

		_vacacionesLocalService = vacacionesLocalService;
	}

	private VacacionesLocalService _vacacionesLocalService;

}