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

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Horari. This utility wraps
 * <code>in2.liferay.crud.horari.service.impl.HorariLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see HorariLocalService
 * @generated
 */
public class HorariLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>in2.liferay.crud.horari.service.impl.HorariLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * Adds the horari to the database. Also notifies the appropriate model listeners.
	 *
	 * @param horari the horari
	 * @return the horari that was added
	 */
	public static in2.liferay.crud.horari.model.Horari addHorari(
		in2.liferay.crud.horari.model.Horari horari) {

		return getService().addHorari(horari);
	}

	public static void addHorari(
		long groupId, long companyId, long userId, String userName,
		java.util.Date desde, java.util.Date hasta) {

		getService().addHorari(
			groupId, companyId, userId, userName, desde, hasta);
	}

	/**
	 * Creates a new horari with the primary key. Does not add the horari to the database.
	 *
	 * @param fooId the primary key for the new horari
	 * @return the new horari
	 */
	public static in2.liferay.crud.horari.model.Horari createHorari(
		long fooId) {

		return getService().createHorari(fooId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			createPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().createPersistedModel(primaryKeyObj);
	}

	/**
	 * Deletes the horari from the database. Also notifies the appropriate model listeners.
	 *
	 * @param horari the horari
	 * @return the horari that was removed
	 */
	public static in2.liferay.crud.horari.model.Horari deleteHorari(
		in2.liferay.crud.horari.model.Horari horari) {

		return getService().deleteHorari(horari);
	}

	/**
	 * Deletes the horari with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fooId the primary key of the horari
	 * @return the horari that was removed
	 * @throws PortalException if a horari with the primary key could not be found
	 */
	public static in2.liferay.crud.horari.model.Horari deleteHorari(long fooId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteHorari(fooId);
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			deletePersistedModel(
				com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery
		dynamicQuery() {

		return getService().dynamicQuery();
	}

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQuery(dynamicQuery);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {

		return getService().dynamicQuery(dynamicQuery, start, end);
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
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {

		return getService().dynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {

		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {

		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static in2.liferay.crud.horari.model.Horari fetchHorari(long fooId) {
		return getService().fetchHorari(fooId);
	}

	/**
	 * Returns the horari matching the UUID and group.
	 *
	 * @param uuid the horari's UUID
	 * @param groupId the primary key of the group
	 * @return the matching horari, or <code>null</code> if a matching horari could not be found
	 */
	public static in2.liferay.crud.horari.model.Horari
		fetchHorariByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchHorariByUuidAndGroupId(uuid, groupId);
	}

	public static java.util.List<in2.liferay.crud.horari.model.Horari>
		findByUsernameAndYear(String username) {

		return getService().findByUsernameAndYear(username);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery
		getActionableDynamicQuery() {

		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery
		getExportActionableDynamicQuery(
			com.liferay.exportimport.kernel.lar.PortletDataContext
				portletDataContext) {

		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	/**
	 * Returns the horari with the primary key.
	 *
	 * @param fooId the primary key of the horari
	 * @return the horari
	 * @throws PortalException if a horari with the primary key could not be found
	 */
	public static in2.liferay.crud.horari.model.Horari getHorari(long fooId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getHorari(fooId);
	}

	/**
	 * Returns the horari matching the UUID and group.
	 *
	 * @param uuid the horari's UUID
	 * @param groupId the primary key of the group
	 * @return the matching horari
	 * @throws PortalException if a matching horari could not be found
	 */
	public static in2.liferay.crud.horari.model.Horari
			getHorariByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getHorariByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<in2.liferay.crud.horari.model.Horari>
		getHoraris(int start, int end) {

		return getService().getHoraris(start, end);
	}

	/**
	 * Returns all the horaris matching the UUID and company.
	 *
	 * @param uuid the UUID of the horaris
	 * @param companyId the primary key of the company
	 * @return the matching horaris, or an empty list if no matches were found
	 */
	public static java.util.List<in2.liferay.crud.horari.model.Horari>
		getHorarisByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getHorarisByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<in2.liferay.crud.horari.model.Horari>
		getHorarisByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<in2.liferay.crud.horari.model.Horari> orderByComparator) {

		return getService().getHorarisByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of horaris.
	 *
	 * @return the number of horaris
	 */
	public static int getHorarisCount() {
		return getService().getHorarisCount();
	}

	public static
		com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery
			getIndexableActionableDynamicQuery() {

		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public static String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	 * @throws PortalException
	 */
	public static com.liferay.portal.kernel.model.PersistedModel
			getPersistedModel(java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	 * Updates the horari in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param horari the horari
	 * @return the horari that was updated
	 */
	public static in2.liferay.crud.horari.model.Horari updateHorari(
		in2.liferay.crud.horari.model.Horari horari) {

		return getService().updateHorari(horari);
	}

	public static HorariLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HorariLocalService, HorariLocalService>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(HorariLocalService.class);

		ServiceTracker<HorariLocalService, HorariLocalService> serviceTracker =
			new ServiceTracker<HorariLocalService, HorariLocalService>(
				bundle.getBundleContext(), HorariLocalService.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}