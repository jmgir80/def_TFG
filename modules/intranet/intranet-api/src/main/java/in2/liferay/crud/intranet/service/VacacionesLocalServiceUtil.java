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
import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Vacaciones. This utility wraps
 * <code>in2.liferay.crud.intranet.service.impl.VacacionesLocalServiceImpl</code> and
 * is an access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see VacacionesLocalService
 * @generated
 */
public class VacacionesLocalServiceUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to <code>in2.liferay.crud.intranet.service.impl.VacacionesLocalServiceImpl</code> and rerun ServiceBuilder to regenerate this class.
	 */
	public static void addVacaciones(
		long groupId, long companyId, long userId, String userName,
		java.util.Date desde, java.util.Date hasta, String comentarios,
		long calendarBookingId) {

		getService().addVacaciones(
			groupId, companyId, userId, userName, desde, hasta, comentarios,
			calendarBookingId);
	}

	/**
	 * Adds the vacaciones to the database. Also notifies the appropriate model listeners.
	 *
	 * @param vacaciones the vacaciones
	 * @return the vacaciones that was added
	 */
	public static in2.liferay.crud.intranet.model.Vacaciones addVacaciones(
		in2.liferay.crud.intranet.model.Vacaciones vacaciones) {

		return getService().addVacaciones(vacaciones);
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
	 * Creates a new vacaciones with the primary key. Does not add the vacaciones to the database.
	 *
	 * @param vacId the primary key for the new vacaciones
	 * @return the new vacaciones
	 */
	public static in2.liferay.crud.intranet.model.Vacaciones createVacaciones(
		long vacId) {

		return getService().createVacaciones(vacId);
	}

	public static void deleteAsset(
			in2.liferay.crud.intranet.model.Vacaciones entry)
		throws SearchException {

		getService().deleteAsset(entry);
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

	/**
	 * Deletes the vacaciones with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vacId the primary key of the vacaciones
	 * @return the vacaciones that was removed
	 * @throws PortalException if a vacaciones with the primary key could not be found
	 */
	public static in2.liferay.crud.intranet.model.Vacaciones deleteVacaciones(
			long vacId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().deleteVacaciones(vacId);
	}

	/**
	 * Deletes the vacaciones from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vacaciones the vacaciones
	 * @return the vacaciones that was removed
	 */
	public static in2.liferay.crud.intranet.model.Vacaciones deleteVacaciones(
		in2.liferay.crud.intranet.model.Vacaciones vacaciones) {

		return getService().deleteVacaciones(vacaciones);
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>in2.liferay.crud.intranet.model.impl.VacacionesModelImpl</code>.
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
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>in2.liferay.crud.intranet.model.impl.VacacionesModelImpl</code>.
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

	public static in2.liferay.crud.intranet.model.Vacaciones fetchVacaciones(
		long vacId) {

		return getService().fetchVacaciones(vacId);
	}

	/**
	 * Returns the vacaciones matching the UUID and group.
	 *
	 * @param uuid the vacaciones's UUID
	 * @param groupId the primary key of the group
	 * @return the matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public static in2.liferay.crud.intranet.model.Vacaciones
		fetchVacacionesByUuidAndGroupId(String uuid, long groupId) {

		return getService().fetchVacacionesByUuidAndGroupId(uuid, groupId);
	}

	public static java.util.List<in2.liferay.crud.intranet.model.Vacaciones>
		findByIdGroup(long groupId) {

		return getService().findByIdGroup(groupId);
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
	 * Returns the vacaciones with the primary key.
	 *
	 * @param vacId the primary key of the vacaciones
	 * @return the vacaciones
	 * @throws PortalException if a vacaciones with the primary key could not be found
	 */
	public static in2.liferay.crud.intranet.model.Vacaciones getVacaciones(
			long vacId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getVacaciones(vacId);
	}

	/**
	 * Returns the vacaciones matching the UUID and group.
	 *
	 * @param uuid the vacaciones's UUID
	 * @param groupId the primary key of the group
	 * @return the matching vacaciones
	 * @throws PortalException if a matching vacaciones could not be found
	 */
	public static in2.liferay.crud.intranet.model.Vacaciones
			getVacacionesByUuidAndGroupId(String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().getVacacionesByUuidAndGroupId(uuid, groupId);
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
	public static java.util.List<in2.liferay.crud.intranet.model.Vacaciones>
		getVacacioneses(int start, int end) {

		return getService().getVacacioneses(start, end);
	}

	/**
	 * Returns all the vacacioneses matching the UUID and company.
	 *
	 * @param uuid the UUID of the vacacioneses
	 * @param companyId the primary key of the company
	 * @return the matching vacacioneses, or an empty list if no matches were found
	 */
	public static java.util.List<in2.liferay.crud.intranet.model.Vacaciones>
		getVacacionesesByUuidAndCompanyId(String uuid, long companyId) {

		return getService().getVacacionesesByUuidAndCompanyId(uuid, companyId);
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
	public static java.util.List<in2.liferay.crud.intranet.model.Vacaciones>
		getVacacionesesByUuidAndCompanyId(
			String uuid, long companyId, int start, int end,
			com.liferay.portal.kernel.util.OrderByComparator
				<in2.liferay.crud.intranet.model.Vacaciones>
					orderByComparator) {

		return getService().getVacacionesesByUuidAndCompanyId(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns the number of vacacioneses.
	 *
	 * @return the number of vacacioneses
	 */
	public static int getVacacionesesCount() {
		return getService().getVacacionesesCount();
	}

	public static com.liferay.asset.kernel.model.AssetEntry updateAsset(
		long userId, in2.liferay.crud.intranet.model.Vacaciones page) {

		return getService().updateAsset(userId, page);
	}

	public static in2.liferay.crud.intranet.model.Vacaciones updateStatus(
			long userId, long entryId, int status,
			com.liferay.portal.kernel.service.ServiceContext serviceContext)
		throws com.liferay.portal.kernel.exception.PortalException {

		return getService().updateStatus(
			userId, entryId, status, serviceContext);
	}

	/**
	 * Updates the vacaciones in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param vacaciones the vacaciones
	 * @return the vacaciones that was updated
	 */
	public static in2.liferay.crud.intranet.model.Vacaciones updateVacaciones(
		in2.liferay.crud.intranet.model.Vacaciones vacaciones) {

		return getService().updateVacaciones(vacaciones);
	}

	public static VacacionesLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker
		<VacacionesLocalService, VacacionesLocalService> _serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(VacacionesLocalService.class);

		ServiceTracker<VacacionesLocalService, VacacionesLocalService>
			serviceTracker =
				new ServiceTracker
					<VacacionesLocalService, VacacionesLocalService>(
						bundle.getBundleContext(), VacacionesLocalService.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}