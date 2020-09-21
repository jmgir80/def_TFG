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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import in2.liferay.crud.intranet.exception.NoSuchVacacionesException;
import in2.liferay.crud.intranet.model.Vacaciones;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the vacaciones service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VacacionesUtil
 * @generated
 */
@ProviderType
public interface VacacionesPersistence extends BasePersistence<Vacaciones> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VacacionesUtil} to access the vacaciones persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the vacacioneses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching vacacioneses
	 */
	public java.util.List<Vacaciones> findByUuid(String uuid);

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
	public java.util.List<Vacaciones> findByUuid(
		String uuid, int start, int end);

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
	public java.util.List<Vacaciones> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator);

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
	public java.util.List<Vacaciones> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first vacaciones in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public Vacaciones findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
				orderByComparator)
		throws NoSuchVacacionesException;

	/**
	 * Returns the first vacaciones in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public Vacaciones fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator);

	/**
	 * Returns the last vacaciones in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public Vacaciones findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
				orderByComparator)
		throws NoSuchVacacionesException;

	/**
	 * Returns the last vacaciones in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public Vacaciones fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator);

	/**
	 * Returns the vacacioneses before and after the current vacaciones in the ordered set where uuid = &#63;.
	 *
	 * @param vacId the primary key of the current vacaciones
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vacaciones
	 * @throws NoSuchVacacionesException if a vacaciones with the primary key could not be found
	 */
	public Vacaciones[] findByUuid_PrevAndNext(
			long vacId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
				orderByComparator)
		throws NoSuchVacacionesException;

	/**
	 * Removes all the vacacioneses where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of vacacioneses where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching vacacioneses
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the vacaciones where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchVacacionesException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public Vacaciones findByUUID_G(String uuid, long groupId)
		throws NoSuchVacacionesException;

	/**
	 * Returns the vacaciones where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public Vacaciones fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the vacaciones where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public Vacaciones fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the vacaciones where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the vacaciones that was removed
	 */
	public Vacaciones removeByUUID_G(String uuid, long groupId)
		throws NoSuchVacacionesException;

	/**
	 * Returns the number of vacacioneses where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching vacacioneses
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the vacacioneses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching vacacioneses
	 */
	public java.util.List<Vacaciones> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Vacaciones> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Vacaciones> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator);

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
	public java.util.List<Vacaciones> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first vacaciones in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public Vacaciones findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
				orderByComparator)
		throws NoSuchVacacionesException;

	/**
	 * Returns the first vacaciones in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public Vacaciones fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator);

	/**
	 * Returns the last vacaciones in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public Vacaciones findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
				orderByComparator)
		throws NoSuchVacacionesException;

	/**
	 * Returns the last vacaciones in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public Vacaciones fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator);

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
	public Vacaciones[] findByUuid_C_PrevAndNext(
			long vacId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
				orderByComparator)
		throws NoSuchVacacionesException;

	/**
	 * Removes all the vacacioneses where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of vacacioneses where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching vacacioneses
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the vacacioneses where userName = &#63;.
	 *
	 * @param userName the user name
	 * @return the matching vacacioneses
	 */
	public java.util.List<Vacaciones> findByuserName(String userName);

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
	public java.util.List<Vacaciones> findByuserName(
		String userName, int start, int end);

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
	public java.util.List<Vacaciones> findByuserName(
		String userName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator);

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
	public java.util.List<Vacaciones> findByuserName(
		String userName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first vacaciones in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public Vacaciones findByuserName_First(
			String userName,
			com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
				orderByComparator)
		throws NoSuchVacacionesException;

	/**
	 * Returns the first vacaciones in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public Vacaciones fetchByuserName_First(
		String userName,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator);

	/**
	 * Returns the last vacaciones in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public Vacaciones findByuserName_Last(
			String userName,
			com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
				orderByComparator)
		throws NoSuchVacacionesException;

	/**
	 * Returns the last vacaciones in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public Vacaciones fetchByuserName_Last(
		String userName,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator);

	/**
	 * Returns the vacacioneses before and after the current vacaciones in the ordered set where userName = &#63;.
	 *
	 * @param vacId the primary key of the current vacaciones
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vacaciones
	 * @throws NoSuchVacacionesException if a vacaciones with the primary key could not be found
	 */
	public Vacaciones[] findByuserName_PrevAndNext(
			long vacId, String userName,
			com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
				orderByComparator)
		throws NoSuchVacacionesException;

	/**
	 * Removes all the vacacioneses where userName = &#63; from the database.
	 *
	 * @param userName the user name
	 */
	public void removeByuserName(String userName);

	/**
	 * Returns the number of vacacioneses where userName = &#63;.
	 *
	 * @param userName the user name
	 * @return the number of matching vacacioneses
	 */
	public int countByuserName(String userName);

	/**
	 * Returns all the vacacioneses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the matching vacacioneses
	 */
	public java.util.List<Vacaciones> findByuserId(long userId);

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
	public java.util.List<Vacaciones> findByuserId(
		long userId, int start, int end);

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
	public java.util.List<Vacaciones> findByuserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator);

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
	public java.util.List<Vacaciones> findByuserId(
		long userId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first vacaciones in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public Vacaciones findByuserId_First(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
				orderByComparator)
		throws NoSuchVacacionesException;

	/**
	 * Returns the first vacaciones in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public Vacaciones fetchByuserId_First(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator);

	/**
	 * Returns the last vacaciones in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public Vacaciones findByuserId_Last(
			long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
				orderByComparator)
		throws NoSuchVacacionesException;

	/**
	 * Returns the last vacaciones in the ordered set where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public Vacaciones fetchByuserId_Last(
		long userId,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator);

	/**
	 * Returns the vacacioneses before and after the current vacaciones in the ordered set where userId = &#63;.
	 *
	 * @param vacId the primary key of the current vacaciones
	 * @param userId the user ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vacaciones
	 * @throws NoSuchVacacionesException if a vacaciones with the primary key could not be found
	 */
	public Vacaciones[] findByuserId_PrevAndNext(
			long vacId, long userId,
			com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
				orderByComparator)
		throws NoSuchVacacionesException;

	/**
	 * Removes all the vacacioneses where userId = &#63; from the database.
	 *
	 * @param userId the user ID
	 */
	public void removeByuserId(long userId);

	/**
	 * Returns the number of vacacioneses where userId = &#63;.
	 *
	 * @param userId the user ID
	 * @return the number of matching vacacioneses
	 */
	public int countByuserId(long userId);

	/**
	 * Returns all the vacacioneses where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the matching vacacioneses
	 */
	public java.util.List<Vacaciones> findBystatus(long groupId, int status);

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
	public java.util.List<Vacaciones> findBystatus(
		long groupId, int status, int start, int end);

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
	public java.util.List<Vacaciones> findBystatus(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator);

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
	public java.util.List<Vacaciones> findBystatus(
		long groupId, int status, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first vacaciones in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public Vacaciones findBystatus_First(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
				orderByComparator)
		throws NoSuchVacacionesException;

	/**
	 * Returns the first vacaciones in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public Vacaciones fetchBystatus_First(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator);

	/**
	 * Returns the last vacaciones in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public Vacaciones findBystatus_Last(
			long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
				orderByComparator)
		throws NoSuchVacacionesException;

	/**
	 * Returns the last vacaciones in the ordered set where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public Vacaciones fetchBystatus_Last(
		long groupId, int status,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator);

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
	public Vacaciones[] findBystatus_PrevAndNext(
			long vacId, long groupId, int status,
			com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
				orderByComparator)
		throws NoSuchVacacionesException;

	/**
	 * Removes all the vacacioneses where groupId = &#63; and status = &#63; from the database.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 */
	public void removeBystatus(long groupId, int status);

	/**
	 * Returns the number of vacacioneses where groupId = &#63; and status = &#63;.
	 *
	 * @param groupId the group ID
	 * @param status the status
	 * @return the number of matching vacacioneses
	 */
	public int countBystatus(long groupId, int status);

	/**
	 * Returns all the vacacioneses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the matching vacacioneses
	 */
	public java.util.List<Vacaciones> findBygroupId(long groupId);

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
	public java.util.List<Vacaciones> findBygroupId(
		long groupId, int start, int end);

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
	public java.util.List<Vacaciones> findBygroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator);

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
	public java.util.List<Vacaciones> findBygroupId(
		long groupId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first vacaciones in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public Vacaciones findBygroupId_First(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
				orderByComparator)
		throws NoSuchVacacionesException;

	/**
	 * Returns the first vacaciones in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public Vacaciones fetchBygroupId_First(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator);

	/**
	 * Returns the last vacaciones in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones
	 * @throws NoSuchVacacionesException if a matching vacaciones could not be found
	 */
	public Vacaciones findBygroupId_Last(
			long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
				orderByComparator)
		throws NoSuchVacacionesException;

	/**
	 * Returns the last vacaciones in the ordered set where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	public Vacaciones fetchBygroupId_Last(
		long groupId,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator);

	/**
	 * Returns the vacacioneses before and after the current vacaciones in the ordered set where groupId = &#63;.
	 *
	 * @param vacId the primary key of the current vacaciones
	 * @param groupId the group ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next vacaciones
	 * @throws NoSuchVacacionesException if a vacaciones with the primary key could not be found
	 */
	public Vacaciones[] findBygroupId_PrevAndNext(
			long vacId, long groupId,
			com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
				orderByComparator)
		throws NoSuchVacacionesException;

	/**
	 * Removes all the vacacioneses where groupId = &#63; from the database.
	 *
	 * @param groupId the group ID
	 */
	public void removeBygroupId(long groupId);

	/**
	 * Returns the number of vacacioneses where groupId = &#63;.
	 *
	 * @param groupId the group ID
	 * @return the number of matching vacacioneses
	 */
	public int countBygroupId(long groupId);

	/**
	 * Caches the vacaciones in the entity cache if it is enabled.
	 *
	 * @param vacaciones the vacaciones
	 */
	public void cacheResult(Vacaciones vacaciones);

	/**
	 * Caches the vacacioneses in the entity cache if it is enabled.
	 *
	 * @param vacacioneses the vacacioneses
	 */
	public void cacheResult(java.util.List<Vacaciones> vacacioneses);

	/**
	 * Creates a new vacaciones with the primary key. Does not add the vacaciones to the database.
	 *
	 * @param vacId the primary key for the new vacaciones
	 * @return the new vacaciones
	 */
	public Vacaciones create(long vacId);

	/**
	 * Removes the vacaciones with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vacId the primary key of the vacaciones
	 * @return the vacaciones that was removed
	 * @throws NoSuchVacacionesException if a vacaciones with the primary key could not be found
	 */
	public Vacaciones remove(long vacId) throws NoSuchVacacionesException;

	public Vacaciones updateImpl(Vacaciones vacaciones);

	/**
	 * Returns the vacaciones with the primary key or throws a <code>NoSuchVacacionesException</code> if it could not be found.
	 *
	 * @param vacId the primary key of the vacaciones
	 * @return the vacaciones
	 * @throws NoSuchVacacionesException if a vacaciones with the primary key could not be found
	 */
	public Vacaciones findByPrimaryKey(long vacId)
		throws NoSuchVacacionesException;

	/**
	 * Returns the vacaciones with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param vacId the primary key of the vacaciones
	 * @return the vacaciones, or <code>null</code> if a vacaciones with the primary key could not be found
	 */
	public Vacaciones fetchByPrimaryKey(long vacId);

	/**
	 * Returns all the vacacioneses.
	 *
	 * @return the vacacioneses
	 */
	public java.util.List<Vacaciones> findAll();

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
	public java.util.List<Vacaciones> findAll(int start, int end);

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
	public java.util.List<Vacaciones> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator);

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
	public java.util.List<Vacaciones> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Vacaciones>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the vacacioneses from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of vacacioneses.
	 *
	 * @return the number of vacacioneses
	 */
	public int countAll();

}