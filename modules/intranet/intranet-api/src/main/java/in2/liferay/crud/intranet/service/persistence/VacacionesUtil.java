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

package in2.liferay.crud.intranet.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import in2.liferay.crud.intranet.model.Vacaciones;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the vacaciones service. This utility wraps <code>in2.liferay.crud.intranet.service.persistence.impl.VacacionesPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VacacionesPersistence
 * @generated
 */
public class VacacionesUtil {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache()
	 */
	public static void clearCache() {
		getPersistence().clearCache();
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#clearCache(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static void clearCache(Vacaciones vacaciones) {
		getPersistence().clearCache(vacaciones);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#countWithDynamicQuery(DynamicQuery)
	 */
	public static long countWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().countWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#fetchByPrimaryKeys(Set)
	 */
	public static Map<Serializable, Vacaciones> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Vacaciones> findWithDynamicQuery(
		DynamicQuery dynamicQuery) {

		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Vacaciones> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Vacaciones> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Vacaciones update(Vacaciones vacaciones) {
		return getPersistence().update(vacaciones);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Vacaciones update(
		Vacaciones vacaciones, ServiceContext serviceContext) {

		return getPersistence().update(vacaciones, serviceContext);
	}

	/**
	 * Returns all the vacacioneses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching vacacioneses
	 */
	public static List<Vacaciones> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the vacacioneses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @return the range of matching vacacioneses
	 */
	public static List<Vacaciones> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the vacacioneses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vacacioneses
	 */
	public static List<Vacaciones> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the vacacioneses where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching vacacioneses
	 */
	public static List<Vacaciones> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Vacaciones> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first vacaciones in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public static Vacaciones findByUuid_First(
			String uuid, OrderByComparator<Vacaciones> orderByComparator)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first vacaciones in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public static Vacaciones fetchByUuid_First(
		String uuid, OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last vacaciones in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public static Vacaciones findByUuid_Last(
			String uuid, OrderByComparator<Vacaciones> orderByComparator)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last vacaciones in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public static Vacaciones fetchByUuid_Last(
		String uuid, OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the vacacioneses before and after the current vacaciones in the ordered set where uuid = &#63;.
	 *
	 * @param vacId the primary key of the current vacaciones
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vacaciones
	 * @throws NoSuchVacacionesException if a vacaciones with the primary key could not be found
	 */
	public static Vacaciones[] findByUuid_PrevAndNext(
			long vacId, String uuid,
			OrderByComparator<Vacaciones> orderByComparator)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findByUuid_PrevAndNext(
			vacId, uuid, orderByComparator);
	}

	/**
	 * Removes all the vacacioneses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of vacacioneses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching vacacioneses
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the vacaciones where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchVacacionesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public static Vacaciones findByUUID_G(String uuid, long groupId)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the vacaciones where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public static Vacaciones fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the vacaciones where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public static Vacaciones fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the vacaciones where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the vacaciones that was removed
	 */
	public static Vacaciones removeByUUID_G(String uuid, long groupId)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of vacacioneses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching vacacioneses
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the vacacioneses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching vacacioneses
	 */
	public static List<Vacaciones> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the vacacioneses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @return the range of matching vacacioneses
	 */
	public static List<Vacaciones> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the vacacioneses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vacacioneses
	 */
	public static List<Vacaciones> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the vacacioneses where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching vacacioneses
	 */
	public static List<Vacaciones> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Vacaciones> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first vacaciones in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public static Vacaciones findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Vacaciones> orderByComparator)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first vacaciones in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public static Vacaciones fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last vacaciones in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public static Vacaciones findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Vacaciones> orderByComparator)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last vacaciones in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public static Vacaciones fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the vacacioneses before and after the current vacaciones in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param vacId the primary key of the current vacaciones
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vacaciones
	 * @throws NoSuchVacacionesException if a vacaciones with the primary key could not be found
	 */
	public static Vacaciones[] findByUuid_C_PrevAndNext(
			long vacId, String uuid, long companyId,
			OrderByComparator<Vacaciones> orderByComparator)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findByUuid_C_PrevAndNext(
			vacId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the vacacioneses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of vacacioneses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching vacacioneses
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the vacacioneses where userName = &#63;.
	 *
	 * @param userName the user name
	 * @return the matching vacacioneses
	 */
	public static List<Vacaciones> findByuserName(String userName) {
		return getPersistence().findByuserName(userName);
	}

	/**
	 * Returns a range of all the vacacioneses where userName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param userName the user name
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @return the range of matching vacacioneses
	 */
	public static List<Vacaciones> findByuserName(
		String userName, int start, int end) {

		return getPersistence().findByuserName(userName, start, end);
	}

	/**
	 * Returns an ordered range of all the vacacioneses where userName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param userName the user name
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vacacioneses
	 */
	public static List<Vacaciones> findByuserName(
		String userName, int start, int end,
		OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().findByuserName(
			userName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the vacacioneses where userName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param userName the user name
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching vacacioneses
	 */
	public static List<Vacaciones> findByuserName(
		String userName, int start, int end,
		OrderByComparator<Vacaciones> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByuserName(
			userName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first vacaciones in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public static Vacaciones findByuserName_First(
			String userName, OrderByComparator<Vacaciones> orderByComparator)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findByuserName_First(
			userName, orderByComparator);
	}

	/**
	 * Returns the first vacaciones in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public static Vacaciones fetchByuserName_First(
		String userName, OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().fetchByuserName_First(
			userName, orderByComparator);
	}

	/**
	 * Returns the last vacaciones in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public static Vacaciones findByuserName_Last(
			String userName, OrderByComparator<Vacaciones> orderByComparator)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findByuserName_Last(
			userName, orderByComparator);
	}

	/**
	 * Returns the last vacaciones in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public static Vacaciones fetchByuserName_Last(
		String userName, OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().fetchByuserName_Last(
			userName, orderByComparator);
	}

	/**
	 * Returns the vacacioneses before and after the current vacaciones in the ordered set where userName = &#63;.
	 *
	 * @param vacId the primary key of the current vacaciones
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vacaciones
	 * @throws NoSuchVacacionesException if a vacaciones with the primary key could not be found
	 */
	public static Vacaciones[] findByuserName_PrevAndNext(
			long vacId, String userName,
			OrderByComparator<Vacaciones> orderByComparator)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findByuserName_PrevAndNext(
			vacId, userName, orderByComparator);
	}

	/**
	 * Removes all the vacacioneses where userName = &#63; from the database.
	 *
	 * @param userName the user name
	 */
	public static void removeByuserName(String userName) {
		getPersistence().removeByuserName(userName);
	}

	/**
	 * Returns the number of vacacioneses where userName = &#63;.
	 *
	 * @param userName the user name
	 * @return the number of matching vacacioneses
	 */
	public static int countByuserName(String userName) {
		return getPersistence().countByuserName(userName);
	}

	/**
	 * Returns all the vacacioneses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching vacacioneses
	 */
	public static List<Vacaciones> findByuserId(long userId) {
		return getPersistence().findByuserId(userId);
	}

	/**
	 * Returns a range of all the vacacioneses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @return the range of matching vacacioneses
	 */
	public static List<Vacaciones> findByuserId(
		long userId, int start, int end) {

		return getPersistence().findByuserId(userId, start, end);
	}

	/**
	 * Returns an ordered range of all the vacacioneses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vacacioneses
	 */
	public static List<Vacaciones> findByuserId(
		long userId, int start, int end,
		OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().findByuserId(
			userId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the vacacioneses where userId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param userId the user ID
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching vacacioneses
	 */
	public static List<Vacaciones> findByuserId(
		long userId, int start, int end,
		OrderByComparator<Vacaciones> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findByuserId(
			userId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first vacaciones in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public static Vacaciones findByuserId_First(
			long userId, OrderByComparator<Vacaciones> orderByComparator)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findByuserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the first vacaciones in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public static Vacaciones fetchByuserId_First(
		long userId, OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().fetchByuserId_First(userId, orderByComparator);
	}

	/**
	 * Returns the last vacaciones in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public static Vacaciones findByuserId_Last(
			long userId, OrderByComparator<Vacaciones> orderByComparator)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findByuserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the last vacaciones in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public static Vacaciones fetchByuserId_Last(
		long userId, OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().fetchByuserId_Last(userId, orderByComparator);
	}

	/**
	 * Returns the vacacioneses before and after the current vacaciones in the ordered set where userId = &#63;.
	 *
	 * @param vacId the primary key of the current vacaciones
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vacaciones
	 * @throws NoSuchVacacionesException if a vacaciones with the primary key could not be found
	 */
	public static Vacaciones[] findByuserId_PrevAndNext(
			long vacId, long userId,
			OrderByComparator<Vacaciones> orderByComparator)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findByuserId_PrevAndNext(
			vacId, userId, orderByComparator);
	}

	/**
	 * Removes all the vacacioneses where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public static void removeByuserId(long userId) {
		getPersistence().removeByuserId(userId);
	}

	/**
	 * Returns the number of vacacioneses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching vacacioneses
	 */
	public static int countByuserId(long userId) {
		return getPersistence().countByuserId(userId);
	}

	/**
	 * Returns all the vacacioneses where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching vacacioneses
	 */
	public static List<Vacaciones> findBystatus(long groupId, int status) {
		return getPersistence().findBystatus(groupId, status);
	}

	/**
	 * Returns a range of all the vacacioneses where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @return the range of matching vacacioneses
	 */
	public static List<Vacaciones> findBystatus(
		long groupId, int status, int start, int end) {

		return getPersistence().findBystatus(groupId, status, start, end);
	}

	/**
	 * Returns an ordered range of all the vacacioneses where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vacacioneses
	 */
	public static List<Vacaciones> findBystatus(
		long groupId, int status, int start, int end,
		OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().findBystatus(
			groupId, status, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the vacacioneses where groupId = &#63; and status = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching vacacioneses
	 */
	public static List<Vacaciones> findBystatus(
		long groupId, int status, int start, int end,
		OrderByComparator<Vacaciones> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBystatus(
			groupId, status, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first vacaciones in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public static Vacaciones findBystatus_First(
			long groupId, int status,
			OrderByComparator<Vacaciones> orderByComparator)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findBystatus_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the first vacaciones in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public static Vacaciones fetchBystatus_First(
		long groupId, int status,
		OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().fetchBystatus_First(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last vacaciones in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public static Vacaciones findBystatus_Last(
			long groupId, int status,
			OrderByComparator<Vacaciones> orderByComparator)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findBystatus_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the last vacaciones in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public static Vacaciones fetchBystatus_Last(
		long groupId, int status,
		OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().fetchBystatus_Last(
			groupId, status, orderByComparator);
	}

	/**
	 * Returns the vacacioneses before and after the current vacaciones in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param vacId the primary key of the current vacaciones
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vacaciones
	 * @throws NoSuchVacacionesException if a vacaciones with the primary key could not be found
	 */
	public static Vacaciones[] findBystatus_PrevAndNext(
			long vacId, long groupId, int status,
			OrderByComparator<Vacaciones> orderByComparator)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findBystatus_PrevAndNext(
			vacId, groupId, status, orderByComparator);
	}

	/**
	 * Removes all the vacacioneses where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public static void removeBystatus(long groupId, int status) {
		getPersistence().removeBystatus(groupId, status);
	}

	/**
	 * Returns the number of vacacioneses where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching vacacioneses
	 */
	public static int countBystatus(long groupId, int status) {
		return getPersistence().countBystatus(groupId, status);
	}

	/**
	 * Returns all the vacacioneses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching vacacioneses
	 */
	public static List<Vacaciones> findBygroupId(long groupId) {
		return getPersistence().findBygroupId(groupId);
	}

	/**
	 * Returns a range of all the vacacioneses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @return the range of matching vacacioneses
	 */
	public static List<Vacaciones> findBygroupId(
		long groupId, int start, int end) {

		return getPersistence().findBygroupId(groupId, start, end);
	}

	/**
	 * Returns an ordered range of all the vacacioneses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching vacacioneses
	 */
	public static List<Vacaciones> findBygroupId(
		long groupId, int start, int end,
		OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().findBygroupId(
			groupId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the vacacioneses where groupId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param groupId the group ID
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching vacacioneses
	 */
	public static List<Vacaciones> findBygroupId(
		long groupId, int start, int end,
		OrderByComparator<Vacaciones> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findBygroupId(
			groupId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first vacaciones in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public static Vacaciones findBygroupId_First(
			long groupId, OrderByComparator<Vacaciones> orderByComparator)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findBygroupId_First(groupId, orderByComparator);
	}

	/**
	 * Returns the first vacaciones in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public static Vacaciones fetchBygroupId_First(
		long groupId, OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().fetchBygroupId_First(
			groupId, orderByComparator);
	}

	/**
	 * Returns the last vacaciones in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public static Vacaciones findBygroupId_Last(
			long groupId, OrderByComparator<Vacaciones> orderByComparator)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findBygroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the last vacaciones in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public static Vacaciones fetchBygroupId_Last(
		long groupId, OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().fetchBygroupId_Last(groupId, orderByComparator);
	}

	/**
	 * Returns the vacacioneses before and after the current vacaciones in the ordered set where groupId = &#63;.
	 *
	 * @param vacId the primary key of the current vacaciones
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vacaciones
	 * @throws NoSuchVacacionesException if a vacaciones with the primary key could not be found
	 */
	public static Vacaciones[] findBygroupId_PrevAndNext(
			long vacId, long groupId,
			OrderByComparator<Vacaciones> orderByComparator)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findBygroupId_PrevAndNext(
			vacId, groupId, orderByComparator);
	}

	/**
	 * Removes all the vacacioneses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public static void removeBygroupId(long groupId) {
		getPersistence().removeBygroupId(groupId);
	}

	/**
	 * Returns the number of vacacioneses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching vacacioneses
	 */
	public static int countBygroupId(long groupId) {
		return getPersistence().countBygroupId(groupId);
	}

	/**
	 * Caches the vacaciones in the entity cache if it is enabled.
	 *
	 * @param vacaciones the vacaciones
	 */
	public static void cacheResult(Vacaciones vacaciones) {
		getPersistence().cacheResult(vacaciones);
	}

	/**
	 * Caches the vacacioneses in the entity cache if it is enabled.
	 *
	 * @param vacacioneses the vacacioneses
	 */
	public static void cacheResult(List<Vacaciones> vacacioneses) {
		getPersistence().cacheResult(vacacioneses);
	}

	/**
	 * Creates a new vacaciones with the primary key. Does not add the vacaciones to the database.
	 *
	 * @param vacId the primary key for the new vacaciones
	 * @return the new vacaciones
	 */
	public static Vacaciones create(long vacId) {
		return getPersistence().create(vacId);
	}

	/**
	 * Removes the vacaciones with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vacId the primary key of the vacaciones
	 * @return the vacaciones that was removed
	 * @throws NoSuchVacacionesException if a vacaciones with the primary key could not be found
	 */
	public static Vacaciones remove(long vacId)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().remove(vacId);
	}

	public static Vacaciones updateImpl(Vacaciones vacaciones) {
		return getPersistence().updateImpl(vacaciones);
	}

	/**
	 * Returns the vacaciones with the primary key or throws a <code>NoSuchVacacionesException</code> if it could not be found.
	 *
	 * @param vacId the primary key of the vacaciones
	 * @return the vacaciones
	 * @throws NoSuchVacacionesException if a vacaciones with the primary key could not be found
	 */
	public static Vacaciones findByPrimaryKey(long vacId)
		throws in2.liferay.crud.intranet.exception.NoSuchVacacionesException {

		return getPersistence().findByPrimaryKey(vacId);
	}

	/**
	 * Returns the vacaciones with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vacId the primary key of the vacaciones
	 * @return the vacaciones, or <code>null</code> if a vacaciones with the primary key could not be found
	 */
	public static Vacaciones fetchByPrimaryKey(long vacId) {
		return getPersistence().fetchByPrimaryKey(vacId);
	}

	/**
	 * Returns all the vacacioneses.
	 *
	 * @return the vacacioneses
	 */
	public static List<Vacaciones> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the vacacioneses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @return the range of vacacioneses
	 */
	public static List<Vacaciones> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the vacacioneses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of vacacioneses
	 */
	public static List<Vacaciones> findAll(
		int start, int end, OrderByComparator<Vacaciones> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the vacacioneses.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>VacacionesModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of vacacioneses
	 * @param end the upper bound of the range of vacacioneses (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of vacacioneses
	 */
	public static List<Vacaciones> findAll(
		int start, int end, OrderByComparator<Vacaciones> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the vacacioneses from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of vacacioneses.
	 *
	 * @return the number of vacacioneses
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static VacacionesPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<VacacionesPersistence, VacacionesPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(VacacionesPersistence.class);

		ServiceTracker<VacacionesPersistence, VacacionesPersistence>
			serviceTracker =
				new ServiceTracker
					<VacacionesPersistence, VacacionesPersistence>(
						bundle.getBundleContext(), VacacionesPersistence.class,
						null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}