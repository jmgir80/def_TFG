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

package in2.liferay.crud.horari.service.persistence;

import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.util.OrderByComparator;

import in2.liferay.crud.horari.model.Horari;

import java.io.Serializable;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.osgi.framework.Bundle;
import org.osgi.framework.FrameworkUtil;
import org.osgi.util.tracker.ServiceTracker;

/**
 * The persistence utility for the horari service. This utility wraps <code>in2.liferay.crud.horari.service.persistence.impl.HorariPersistenceImpl</code> and provides direct access to the database for CRUD operations. This utility should only be used by the service layer, as it must operate within a transaction. Never access this utility in a JSP, controller, model, or other front-end class.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HorariPersistence
 * @generated
 */
public class HorariUtil {

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
	public static void clearCache(Horari horari) {
		getPersistence().clearCache(horari);
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
	public static Map<Serializable, Horari> fetchByPrimaryKeys(
		Set<Serializable> primaryKeys) {

		return getPersistence().fetchByPrimaryKeys(primaryKeys);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery)
	 */
	public static List<Horari> findWithDynamicQuery(DynamicQuery dynamicQuery) {
		return getPersistence().findWithDynamicQuery(dynamicQuery);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int)
	 */
	public static List<Horari> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end) {

		return getPersistence().findWithDynamicQuery(dynamicQuery, start, end);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#findWithDynamicQuery(DynamicQuery, int, int, OrderByComparator)
	 */
	public static List<Horari> findWithDynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<Horari> orderByComparator) {

		return getPersistence().findWithDynamicQuery(
			dynamicQuery, start, end, orderByComparator);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel)
	 */
	public static Horari update(Horari horari) {
		return getPersistence().update(horari);
	}

	/**
	 * @see com.liferay.portal.kernel.service.persistence.BasePersistence#update(com.liferay.portal.kernel.model.BaseModel, ServiceContext)
	 */
	public static Horari update(Horari horari, ServiceContext serviceContext) {
		return getPersistence().update(horari, serviceContext);
	}

	/**
	 * Returns all the horaris where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching horaris
	 */
	public static List<Horari> findByUuid(String uuid) {
		return getPersistence().findByUuid(uuid);
	}

	/**
	 * Returns a range of all the horaris where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HorariModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of horaris
	 * @param end the upper bound of the range of horaris (not inclusive)
	 * @return the range of matching horaris
	 */
	public static List<Horari> findByUuid(String uuid, int start, int end) {
		return getPersistence().findByUuid(uuid, start, end);
	}

	/**
	 * Returns an ordered range of all the horaris where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HorariModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of horaris
	 * @param end the upper bound of the range of horaris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching horaris
	 */
	public static List<Horari> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Horari> orderByComparator) {

		return getPersistence().findByUuid(uuid, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the horaris where uuid = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HorariModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param start the lower bound of the range of horaris
	 * @param end the upper bound of the range of horaris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching horaris
	 */
	public static List<Horari> findByUuid(
		String uuid, int start, int end,
		OrderByComparator<Horari> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid(
			uuid, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first horari in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching horari
	 * @throws NoSuchHorariException if a matching horari could not be found
	 */
	public static Horari findByUuid_First(
			String uuid, OrderByComparator<Horari> orderByComparator)
		throws in2.liferay.crud.horari.exception.NoSuchHorariException {

		return getPersistence().findByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the first horari in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching horari, or <code>null</code> if a matching horari could not be found
	 */
	public static Horari fetchByUuid_First(
		String uuid, OrderByComparator<Horari> orderByComparator) {

		return getPersistence().fetchByUuid_First(uuid, orderByComparator);
	}

	/**
	 * Returns the last horari in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching horari
	 * @throws NoSuchHorariException if a matching horari could not be found
	 */
	public static Horari findByUuid_Last(
			String uuid, OrderByComparator<Horari> orderByComparator)
		throws in2.liferay.crud.horari.exception.NoSuchHorariException {

		return getPersistence().findByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the last horari in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching horari, or <code>null</code> if a matching horari could not be found
	 */
	public static Horari fetchByUuid_Last(
		String uuid, OrderByComparator<Horari> orderByComparator) {

		return getPersistence().fetchByUuid_Last(uuid, orderByComparator);
	}

	/**
	 * Returns the horaris before and after the current horari in the ordered set where uuid = &#63;.
	 *
	 * @param fooId the primary key of the current horari
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next horari
	 * @throws NoSuchHorariException if a horari with the primary key could not be found
	 */
	public static Horari[] findByUuid_PrevAndNext(
			long fooId, String uuid,
			OrderByComparator<Horari> orderByComparator)
		throws in2.liferay.crud.horari.exception.NoSuchHorariException {

		return getPersistence().findByUuid_PrevAndNext(
			fooId, uuid, orderByComparator);
	}

	/**
	 * Removes all the horaris where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public static void removeByUuid(String uuid) {
		getPersistence().removeByUuid(uuid);
	}

	/**
	 * Returns the number of horaris where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching horaris
	 */
	public static int countByUuid(String uuid) {
		return getPersistence().countByUuid(uuid);
	}

	/**
	 * Returns the horari where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchHorariException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching horari
	 * @throws NoSuchHorariException if a matching horari could not be found
	 */
	public static Horari findByUUID_G(String uuid, long groupId)
		throws in2.liferay.crud.horari.exception.NoSuchHorariException {

		return getPersistence().findByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the horari where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching horari, or <code>null</code> if a matching horari could not be found
	 */
	public static Horari fetchByUUID_G(String uuid, long groupId) {
		return getPersistence().fetchByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the horari where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching horari, or <code>null</code> if a matching horari could not be found
	 */
	public static Horari fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache) {

		return getPersistence().fetchByUUID_G(uuid, groupId, useFinderCache);
	}

	/**
	 * Removes the horari where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the horari that was removed
	 */
	public static Horari removeByUUID_G(String uuid, long groupId)
		throws in2.liferay.crud.horari.exception.NoSuchHorariException {

		return getPersistence().removeByUUID_G(uuid, groupId);
	}

	/**
	 * Returns the number of horaris where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching horaris
	 */
	public static int countByUUID_G(String uuid, long groupId) {
		return getPersistence().countByUUID_G(uuid, groupId);
	}

	/**
	 * Returns all the horaris where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching horaris
	 */
	public static List<Horari> findByUuid_C(String uuid, long companyId) {
		return getPersistence().findByUuid_C(uuid, companyId);
	}

	/**
	 * Returns a range of all the horaris where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HorariModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of horaris
	 * @param end the upper bound of the range of horaris (not inclusive)
	 * @return the range of matching horaris
	 */
	public static List<Horari> findByUuid_C(
		String uuid, long companyId, int start, int end) {

		return getPersistence().findByUuid_C(uuid, companyId, start, end);
	}

	/**
	 * Returns an ordered range of all the horaris where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HorariModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of horaris
	 * @param end the upper bound of the range of horaris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching horaris
	 */
	public static List<Horari> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Horari> orderByComparator) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the horaris where uuid = &#63; and companyId = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HorariModelImpl</code>.
	 * </p>
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param start the lower bound of the range of horaris
	 * @param end the upper bound of the range of horaris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching horaris
	 */
	public static List<Horari> findByUuid_C(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Horari> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByUuid_C(
			uuid, companyId, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first horari in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching horari
	 * @throws NoSuchHorariException if a matching horari could not be found
	 */
	public static Horari findByUuid_C_First(
			String uuid, long companyId,
			OrderByComparator<Horari> orderByComparator)
		throws in2.liferay.crud.horari.exception.NoSuchHorariException {

		return getPersistence().findByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the first horari in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching horari, or <code>null</code> if a matching horari could not be found
	 */
	public static Horari fetchByUuid_C_First(
		String uuid, long companyId,
		OrderByComparator<Horari> orderByComparator) {

		return getPersistence().fetchByUuid_C_First(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last horari in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching horari
	 * @throws NoSuchHorariException if a matching horari could not be found
	 */
	public static Horari findByUuid_C_Last(
			String uuid, long companyId,
			OrderByComparator<Horari> orderByComparator)
		throws in2.liferay.crud.horari.exception.NoSuchHorariException {

		return getPersistence().findByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the last horari in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching horari, or <code>null</code> if a matching horari could not be found
	 */
	public static Horari fetchByUuid_C_Last(
		String uuid, long companyId,
		OrderByComparator<Horari> orderByComparator) {

		return getPersistence().fetchByUuid_C_Last(
			uuid, companyId, orderByComparator);
	}

	/**
	 * Returns the horaris before and after the current horari in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param fooId the primary key of the current horari
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next horari
	 * @throws NoSuchHorariException if a horari with the primary key could not be found
	 */
	public static Horari[] findByUuid_C_PrevAndNext(
			long fooId, String uuid, long companyId,
			OrderByComparator<Horari> orderByComparator)
		throws in2.liferay.crud.horari.exception.NoSuchHorariException {

		return getPersistence().findByUuid_C_PrevAndNext(
			fooId, uuid, companyId, orderByComparator);
	}

	/**
	 * Removes all the horaris where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public static void removeByUuid_C(String uuid, long companyId) {
		getPersistence().removeByUuid_C(uuid, companyId);
	}

	/**
	 * Returns the number of horaris where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching horaris
	 */
	public static int countByUuid_C(String uuid, long companyId) {
		return getPersistence().countByUuid_C(uuid, companyId);
	}

	/**
	 * Returns all the horaris where userName = &#63;.
	 *
	 * @param userName the user name
	 * @return the matching horaris
	 */
	public static List<Horari> findByuserName(String userName) {
		return getPersistence().findByuserName(userName);
	}

	/**
	 * Returns a range of all the horaris where userName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HorariModelImpl</code>.
	 * </p>
	 *
	 * @param userName the user name
	 * @param start the lower bound of the range of horaris
	 * @param end the upper bound of the range of horaris (not inclusive)
	 * @return the range of matching horaris
	 */
	public static List<Horari> findByuserName(
		String userName, int start, int end) {

		return getPersistence().findByuserName(userName, start, end);
	}

	/**
	 * Returns an ordered range of all the horaris where userName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HorariModelImpl</code>.
	 * </p>
	 *
	 * @param userName the user name
	 * @param start the lower bound of the range of horaris
	 * @param end the upper bound of the range of horaris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of matching horaris
	 */
	public static List<Horari> findByuserName(
		String userName, int start, int end,
		OrderByComparator<Horari> orderByComparator) {

		return getPersistence().findByuserName(
			userName, start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the horaris where userName = &#63;.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HorariModelImpl</code>.
	 * </p>
	 *
	 * @param userName the user name
	 * @param start the lower bound of the range of horaris
	 * @param end the upper bound of the range of horaris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of matching horaris
	 */
	public static List<Horari> findByuserName(
		String userName, int start, int end,
		OrderByComparator<Horari> orderByComparator, boolean useFinderCache) {

		return getPersistence().findByuserName(
			userName, start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Returns the first horari in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching horari
	 * @throws NoSuchHorariException if a matching horari could not be found
	 */
	public static Horari findByuserName_First(
			String userName, OrderByComparator<Horari> orderByComparator)
		throws in2.liferay.crud.horari.exception.NoSuchHorariException {

		return getPersistence().findByuserName_First(
			userName, orderByComparator);
	}

	/**
	 * Returns the first horari in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching horari, or <code>null</code> if a matching horari could not be found
	 */
	public static Horari fetchByuserName_First(
		String userName, OrderByComparator<Horari> orderByComparator) {

		return getPersistence().fetchByuserName_First(
			userName, orderByComparator);
	}

	/**
	 * Returns the last horari in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching horari
	 * @throws NoSuchHorariException if a matching horari could not be found
	 */
	public static Horari findByuserName_Last(
			String userName, OrderByComparator<Horari> orderByComparator)
		throws in2.liferay.crud.horari.exception.NoSuchHorariException {

		return getPersistence().findByuserName_Last(
			userName, orderByComparator);
	}

	/**
	 * Returns the last horari in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching horari, or <code>null</code> if a matching horari could not be found
	 */
	public static Horari fetchByuserName_Last(
		String userName, OrderByComparator<Horari> orderByComparator) {

		return getPersistence().fetchByuserName_Last(
			userName, orderByComparator);
	}

	/**
	 * Returns the horaris before and after the current horari in the ordered set where userName = &#63;.
	 *
	 * @param fooId the primary key of the current horari
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next horari
	 * @throws NoSuchHorariException if a horari with the primary key could not be found
	 */
	public static Horari[] findByuserName_PrevAndNext(
			long fooId, String userName,
			OrderByComparator<Horari> orderByComparator)
		throws in2.liferay.crud.horari.exception.NoSuchHorariException {

		return getPersistence().findByuserName_PrevAndNext(
			fooId, userName, orderByComparator);
	}

	/**
	 * Removes all the horaris where userName = &#63; from the database.
	 *
	 * @param userName the user name
	 */
	public static void removeByuserName(String userName) {
		getPersistence().removeByuserName(userName);
	}

	/**
	 * Returns the number of horaris where userName = &#63;.
	 *
	 * @param userName the user name
	 * @return the number of matching horaris
	 */
	public static int countByuserName(String userName) {
		return getPersistence().countByuserName(userName);
	}

	/**
	 * Caches the horari in the entity cache if it is enabled.
	 *
	 * @param horari the horari
	 */
	public static void cacheResult(Horari horari) {
		getPersistence().cacheResult(horari);
	}

	/**
	 * Caches the horaris in the entity cache if it is enabled.
	 *
	 * @param horaris the horaris
	 */
	public static void cacheResult(List<Horari> horaris) {
		getPersistence().cacheResult(horaris);
	}

	/**
	 * Creates a new horari with the primary key. Does not add the horari to the database.
	 *
	 * @param fooId the primary key for the new horari
	 * @return the new horari
	 */
	public static Horari create(long fooId) {
		return getPersistence().create(fooId);
	}

	/**
	 * Removes the horari with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fooId the primary key of the horari
	 * @return the horari that was removed
	 * @throws NoSuchHorariException if a horari with the primary key could not be found
	 */
	public static Horari remove(long fooId)
		throws in2.liferay.crud.horari.exception.NoSuchHorariException {

		return getPersistence().remove(fooId);
	}

	public static Horari updateImpl(Horari horari) {
		return getPersistence().updateImpl(horari);
	}

	/**
	 * Returns the horari with the primary key or throws a <code>NoSuchHorariException</code> if it could not be found.
	 *
	 * @param fooId the primary key of the horari
	 * @return the horari
	 * @throws NoSuchHorariException if a horari with the primary key could not be found
	 */
	public static Horari findByPrimaryKey(long fooId)
		throws in2.liferay.crud.horari.exception.NoSuchHorariException {

		return getPersistence().findByPrimaryKey(fooId);
	}

	/**
	 * Returns the horari with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fooId the primary key of the horari
	 * @return the horari, or <code>null</code> if a horari with the primary key could not be found
	 */
	public static Horari fetchByPrimaryKey(long fooId) {
		return getPersistence().fetchByPrimaryKey(fooId);
	}

	/**
	 * Returns all the horaris.
	 *
	 * @return the horaris
	 */
	public static List<Horari> findAll() {
		return getPersistence().findAll();
	}

	/**
	 * Returns a range of all the horaris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HorariModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of horaris
	 * @param end the upper bound of the range of horaris (not inclusive)
	 * @return the range of horaris
	 */
	public static List<Horari> findAll(int start, int end) {
		return getPersistence().findAll(start, end);
	}

	/**
	 * Returns an ordered range of all the horaris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HorariModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of horaris
	 * @param end the upper bound of the range of horaris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @return the ordered range of horaris
	 */
	public static List<Horari> findAll(
		int start, int end, OrderByComparator<Horari> orderByComparator) {

		return getPersistence().findAll(start, end, orderByComparator);
	}

	/**
	 * Returns an ordered range of all the horaris.
	 *
	 * <p>
	 * Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to <code>QueryUtil#ALL_POS</code> will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent, then the query will include the default ORDER BY logic from <code>HorariModelImpl</code>.
	 * </p>
	 *
	 * @param start the lower bound of the range of horaris
	 * @param end the upper bound of the range of horaris (not inclusive)
	 * @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	 * @param useFinderCache whether to use the finder cache
	 * @return the ordered range of horaris
	 */
	public static List<Horari> findAll(
		int start, int end, OrderByComparator<Horari> orderByComparator,
		boolean useFinderCache) {

		return getPersistence().findAll(
			start, end, orderByComparator, useFinderCache);
	}

	/**
	 * Removes all the horaris from the database.
	 */
	public static void removeAll() {
		getPersistence().removeAll();
	}

	/**
	 * Returns the number of horaris.
	 *
	 * @return the number of horaris
	 */
	public static int countAll() {
		return getPersistence().countAll();
	}

	public static HorariPersistence getPersistence() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<HorariPersistence, HorariPersistence>
		_serviceTracker;

	static {
		Bundle bundle = FrameworkUtil.getBundle(HorariPersistence.class);

		ServiceTracker<HorariPersistence, HorariPersistence> serviceTracker =
			new ServiceTracker<HorariPersistence, HorariPersistence>(
				bundle.getBundleContext(), HorariPersistence.class, null);

		serviceTracker.open();

		_serviceTracker = serviceTracker;
	}

}