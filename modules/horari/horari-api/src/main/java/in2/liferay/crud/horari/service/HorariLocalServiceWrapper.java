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

package in2.liferay.crud.horari.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HorariLocalService}.
 *
 * @author Brian Wing Shun Chan
 * @see HorariLocalService
 * @generated
 */
public class HorariLocalServiceWrapper
	implements HorariLocalService, ServiceWrapper<HorariLocalService> {

	public HorariLocalServiceWrapper(HorariLocalService horariLocalService) {
		_horariLocalService = horariLocalService;
	}

	/**
	 * Adds the horari to the database. Also notifies the appropriate model listeners.
	 *
	 * @param horari the horari
	 * @return the horari that was added
	 */
	@Override
	public in2.liferay.crud.horari.model.Horari addHorari(
		in2.liferay.crud.horari.model.Horari horari) {

		return _horariLocalService.addHorari(horari);
	}

	@Override
	public void addHorari(
		long groupId, long companyId, long userId, String userName,
		java.util.Date desde, java.util.Date hasta) {

		_horariLocalService.addHorari(
			groupId, companyId, userId, userName, desde, hasta);
	}

	/**
	 * Creates a new horari with the primary key. Does not add the horari to the database.
	 *
	 * @param fooId the primary key for the new horari
	 * @return the new horari
	 */
	@Override
	public in2.liferay.crud.horari.model.Horari createHorari(long fooId) {
		return _horariLocalService.createHorari(fooId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel createPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _horariLocalService.createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the horari from the database. Also notifies the appropriate model listeners.
	 *
	 * @param horari the horari
	 * @return the horari that was removed
	 */
	@Override
	public in2.liferay.crud.horari.model.Horari deleteHorari(
		in2.liferay.crud.horari.model.Horari horari) {

		return _horariLocalService.deleteHorari(horari);
	}

	/**
	 * Deletes the horari with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fooId the primary key of the horari
	 * @return the horari that was removed
	 * @throws PortalException if a horari with the primary key could not be found
	 */
	@Override
	public in2.liferay.crud.horari.model.Horari deleteHorari(long fooId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _horariLocalService.deleteHorari(fooId);
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
			com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _horariLocalService.deletePersistedModel(persistedModel);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return _horariLocalService.dynamicQuery();
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

		return _horariLocalService.dynamicQuery(dynamicQuery);
	}

	/**
	 * Performs a dynamic query on the database and returns a range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>in2.liferay.crud.horari.model.impl.HorariModelImpl</code>.
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

		return _horariLocalService.dynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * Performs a dynamic query on the database and returns an ordered range of the matching rows.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>in2.liferay.crud.horari.model.impl.HorariModelImpl</code>.
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

		return _horariLocalService.dynamicQuery(
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

		return _horariLocalService.dynamicQueryCount(dynamicQuery);
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

		return _horariLocalService.dynamicQueryCount(dynamicQuery, projection);
	}

	@Override
	public in2.liferay.crud.horari.model.Horari fetchHorari(long fooId) {
		return _horariLocalService.fetchHorari(fooId);
	}

	/**
	 * Returns the horari matching the UUID and group.
	 *
	 * @param uuid the horari's UUID
	 * @param groupId the primary key of the group
	 * @return the matching horari, or <code>null</code> if a matching horari could not be found
	 */
	@Override
	public in2.liferay.crud.horari.model.Horari fetchHorariByUuidAndGroupId(
		String uuid, long groupId) {

		return _horariLocalService.fetchHorariByUuidAndGroupId(uuid, groupId);
	}

	@Override
	public java.util.List<in2.liferay.crud.horari.model.Horari>
		findByUsernameAndYear(String username) {

		return _horariLocalService.findByUsernameAndYear(username);
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return _horariLocalService.getActionableDynamicQuery();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return _horariLocalService.getExportActionableDynamicQuery(
			portletDataContext);
	}

	/**
	 * Returns the horari with the primary key.
	 *
	 * @param fooId the primary key of the horari
	 * @return the horari
	 * @throws PortalException if a horari with the primary key could not be found
	 */
	@Override
	public in2.liferay.crud.horari.model.Horari getHorari(long fooId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _horariLocalService.getHorari(fooId);
	}

	/**
	 * Returns the horari matching the UUID and group.
	 *
	 * @param uuid the horari's UUID
	 * @param groupId the primary key of the group
	 * @return the matching horari
	 * @throws PortalException if a matching horari could not be found
	 */
	@Override
	public in2.liferay.crud.horari.model.Horari getHorariByUuidAndGroupId(
			String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _horariLocalService.getHorariByUuidAndGroupId(uuid, groupId);
	}

	/**
	 * Returns a range of all the horaris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>in2.liferay.crud.horari.model.impl.HorariModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of horaris
	 * @param end the upper bound of the range of horaris (not inclusive)
	 * @return the range of horaris
	 */
	@Override
	public java.util.List<in2.liferay.crud.horari.model.Horari> getHoraris(
		int start, int end) {

		return _horariLocalService.getHoraris(start, end);
	}

	/**
	 * Returns all the horaris matching the UUID and company.
	 *
	 * @param uuid the UUID of the horaris
	 * @param companyId the primary key of the company
	 * @return the matching horaris, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<in2.liferay.crud.horari.model.Horari>
		getHorarisByUuidAndCompanyId(String uuid, long companyId) {

		return _horariLocalService.getHorarisByUuidAndCompanyId(
			uuid, companyId);
	}

	/**
	 * Returns a range of horaris matching the UUID and company.
	 *
	 * @param uuid the UUID of the horaris
	 * @param companyId the primary key of the company
	 * @param start the lower bound of the range of horaris
	 * @param end the upper bound of the range of horaris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the range of matching horaris, or an empty list if no matches were found
	 */
	@Override
	public java.util.List<in2.liferay.crud.horari.model.Horari>
		getHorarisByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<in2.liferay.crud.horari.model.Horari> orderByComparator) {

		return _horariLocalService.getHorarisByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of horaris.
	 *
	 * @return the number of horaris
	 */
	@Override
	public int getHorarisCount() {
		return _horariLocalService.getHorarisCount();
	}

	@Override
	public com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
		getIndexableActionableDynamicQuery() {

		return _horariLocalService.getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _horariLocalService.getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	@Override
	public com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
			java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return _horariLocalService.getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the horari in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param horari the horari
	 * @return the horari that was updated
	 */
	@Override
	public in2.liferay.crud.horari.model.Horari updateHorari(
		in2.liferay.crud.horari.model.Horari horari) {

		return _horariLocalService.updateHorari(horari);
	}

	@Override
	public HorariLocalService getWrappedService() {
		return _horariLocalService;
	}

	@Override
	public void setWrappedService(HorariLocalService horariLocalService) {
		_horariLocalService = horariLocalService;
	}

	private HorariLocalService _horariLocalService;

}