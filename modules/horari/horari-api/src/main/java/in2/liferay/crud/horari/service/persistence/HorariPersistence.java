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

import com.liferay.portal.kernel.service.persistence.BasePersistence;

import in2.liferay.crud.horari.exception.NoSuchHorariException;
import in2.liferay.crud.horari.model.Horari;

import org.osgi.annotation.versioning.ProviderType;

/**
 * The persistence interface for the horari service.
 *
 * <p>
 * Caching information and settings can be found in <code>portal.properties</code>
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HorariUtil
 * @generated
 */
@ProviderType
public interface HorariPersistence extends BasePersistence<Horari> {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link HorariUtil} to access the horari persistence. Modify <code>service.xml</code> and rerun ServiceBuilder to regenerate this interface.
	 */

	/**
	 * Returns all the horaris where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the matching horaris
	 */
	public java.util.List<Horari> findByUuid(String uuid);

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
	public java.util.List<Horari> findByUuid(String uuid, int start, int end);

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
	public java.util.List<Horari> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horari>
			orderByComparator);

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
	public java.util.List<Horari> findByUuid(
		String uuid, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horari>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first horari in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching horari
	 * @throws NoSuchHorariException if a matching horari could not be found
	 */
	public Horari findByUuid_First(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Horari>
				orderByComparator)
		throws NoSuchHorariException;

	/**
	 * Returns the first horari in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching horari, or <code>null</code> if a matching horari could not be found
	 */
	public Horari fetchByUuid_First(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Horari>
			orderByComparator);

	/**
	 * Returns the last horari in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching horari
	 * @throws NoSuchHorariException if a matching horari could not be found
	 */
	public Horari findByUuid_Last(
			String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Horari>
				orderByComparator)
		throws NoSuchHorariException;

	/**
	 * Returns the last horari in the ordered set where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching horari, or <code>null</code> if a matching horari could not be found
	 */
	public Horari fetchByUuid_Last(
		String uuid,
		com.liferay.portal.kernel.util.OrderByComparator<Horari>
			orderByComparator);

	/**
	 * Returns the horaris before and after the current horari in the ordered set where uuid = &#63;.
	 *
	 * @param fooId the primary key of the current horari
	 * @param uuid the uuid
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next horari
	 * @throws NoSuchHorariException if a horari with the primary key could not be found
	 */
	public Horari[] findByUuid_PrevAndNext(
			long fooId, String uuid,
			com.liferay.portal.kernel.util.OrderByComparator<Horari>
				orderByComparator)
		throws NoSuchHorariException;

	/**
	 * Removes all the horaris where uuid = &#63; from the database.
	 *
	 * @param uuid the uuid
	 */
	public void removeByUuid(String uuid);

	/**
	 * Returns the number of horaris where uuid = &#63;.
	 *
	 * @param uuid the uuid
	 * @return the number of matching horaris
	 */
	public int countByUuid(String uuid);

	/**
	 * Returns the horari where uuid = &#63; and groupId = &#63; or throws a <code>NoSuchHorariException</code> if it could not be found.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching horari
	 * @throws NoSuchHorariException if a matching horari could not be found
	 */
	public Horari findByUUID_G(String uuid, long groupId)
		throws NoSuchHorariException;

	/**
	 * Returns the horari where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found. Uses the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the matching horari, or <code>null</code> if a matching horari could not be found
	 */
	public Horari fetchByUUID_G(String uuid, long groupId);

	/**
	 * Returns the horari where uuid = &#63; and groupId = &#63; or returns <code>null</code> if it could not be found, optionally using the finder cache.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @param useFinderCache whether to use the finder cache
	 * @return the matching horari, or <code>null</code> if a matching horari could not be found
	 */
	public Horari fetchByUUID_G(
		String uuid, long groupId, boolean useFinderCache);

	/**
	 * Removes the horari where uuid = &#63; and groupId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the horari that was removed
	 */
	public Horari removeByUUID_G(String uuid, long groupId)
		throws NoSuchHorariException;

	/**
	 * Returns the number of horaris where uuid = &#63; and groupId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param groupId the group ID
	 * @return the number of matching horaris
	 */
	public int countByUUID_G(String uuid, long groupId);

	/**
	 * Returns all the horaris where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the matching horaris
	 */
	public java.util.List<Horari> findByUuid_C(String uuid, long companyId);

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
	public java.util.List<Horari> findByUuid_C(
		String uuid, long companyId, int start, int end);

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
	public java.util.List<Horari> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horari>
			orderByComparator);

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
	public java.util.List<Horari> findByUuid_C(
		String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horari>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first horari in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching horari
	 * @throws NoSuchHorariException if a matching horari could not be found
	 */
	public Horari findByUuid_C_First(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Horari>
				orderByComparator)
		throws NoSuchHorariException;

	/**
	 * Returns the first horari in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching horari, or <code>null</code> if a matching horari could not be found
	 */
	public Horari fetchByUuid_C_First(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Horari>
			orderByComparator);

	/**
	 * Returns the last horari in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching horari
	 * @throws NoSuchHorariException if a matching horari could not be found
	 */
	public Horari findByUuid_C_Last(
			String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Horari>
				orderByComparator)
		throws NoSuchHorariException;

	/**
	 * Returns the last horari in the ordered set where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching horari, or <code>null</code> if a matching horari could not be found
	 */
	public Horari fetchByUuid_C_Last(
		String uuid, long companyId,
		com.liferay.portal.kernel.util.OrderByComparator<Horari>
			orderByComparator);

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
	public Horari[] findByUuid_C_PrevAndNext(
			long fooId, String uuid, long companyId,
			com.liferay.portal.kernel.util.OrderByComparator<Horari>
				orderByComparator)
		throws NoSuchHorariException;

	/**
	 * Removes all the horaris where uuid = &#63; and companyId = &#63; from the database.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 */
	public void removeByUuid_C(String uuid, long companyId);

	/**
	 * Returns the number of horaris where uuid = &#63; and companyId = &#63;.
	 *
	 * @param uuid the uuid
	 * @param companyId the company ID
	 * @return the number of matching horaris
	 */
	public int countByUuid_C(String uuid, long companyId);

	/**
	 * Returns all the horaris where userName = &#63;.
	 *
	 * @param userName the user name
	 * @return the matching horaris
	 */
	public java.util.List<Horari> findByuserName(String userName);

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
	public java.util.List<Horari> findByuserName(
		String userName, int start, int end);

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
	public java.util.List<Horari> findByuserName(
		String userName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horari>
			orderByComparator);

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
	public java.util.List<Horari> findByuserName(
		String userName, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horari>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Returns the first horari in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching horari
	 * @throws NoSuchHorariException if a matching horari could not be found
	 */
	public Horari findByuserName_First(
			String userName,
			com.liferay.portal.kernel.util.OrderByComparator<Horari>
				orderByComparator)
		throws NoSuchHorariException;

	/**
	 * Returns the first horari in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the first matching horari, or <code>null</code> if a matching horari could not be found
	 */
	public Horari fetchByuserName_First(
		String userName,
		com.liferay.portal.kernel.util.OrderByComparator<Horari>
			orderByComparator);

	/**
	 * Returns the last horari in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching horari
	 * @throws NoSuchHorariException if a matching horari could not be found
	 */
	public Horari findByuserName_Last(
			String userName,
			com.liferay.portal.kernel.util.OrderByComparator<Horari>
				orderByComparator)
		throws NoSuchHorariException;

	/**
	 * Returns the last horari in the ordered set where userName = &#63;.
	 *
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the last matching horari, or <code>null</code> if a matching horari could not be found
	 */
	public Horari fetchByuserName_Last(
		String userName,
		com.liferay.portal.kernel.util.OrderByComparator<Horari>
			orderByComparator);

	/**
	 * Returns the horaris before and after the current horari in the ordered set where userName = &#63;.
	 *
	 * @param fooId the primary key of the current horari
	 * @param userName the user name
	 * @param orderByComparator the comparator to order the set by (optionally <code>null</code>)
	 * @return the previous, current, and next horari
	 * @throws NoSuchHorariException if a horari with the primary key could not be found
	 */
	public Horari[] findByuserName_PrevAndNext(
			long fooId, String userName,
			com.liferay.portal.kernel.util.OrderByComparator<Horari>
				orderByComparator)
		throws NoSuchHorariException;

	/**
	 * Removes all the horaris where userName = &#63; from the database.
	 *
	 * @param userName the user name
	 */
	public void removeByuserName(String userName);

	/**
	 * Returns the number of horaris where userName = &#63;.
	 *
	 * @param userName the user name
	 * @return the number of matching horaris
	 */
	public int countByuserName(String userName);

	/**
	 * Caches the horari in the entity cache if it is enabled.
	 *
	 * @param horari the horari
	 */
	public void cacheResult(Horari horari);

	/**
	 * Caches the horaris in the entity cache if it is enabled.
	 *
	 * @param horaris the horaris
	 */
	public void cacheResult(java.util.List<Horari> horaris);

	/**
	 * Creates a new horari with the primary key. Does not add the horari to the database.
	 *
	 * @param fooId the primary key for the new horari
	 * @return the new horari
	 */
	public Horari create(long fooId);

	/**
	 * Removes the horari with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param fooId the primary key of the horari
	 * @return the horari that was removed
	 * @throws NoSuchHorariException if a horari with the primary key could not be found
	 */
	public Horari remove(long fooId) throws NoSuchHorariException;

	public Horari updateImpl(Horari horari);

	/**
	 * Returns the horari with the primary key or throws a <code>NoSuchHorariException</code> if it could not be found.
	 *
	 * @param fooId the primary key of the horari
	 * @return the horari
	 * @throws NoSuchHorariException if a horari with the primary key could not be found
	 */
	public Horari findByPrimaryKey(long fooId) throws NoSuchHorariException;

	/**
	 * Returns the horari with the primary key or returns <code>null</code> if it could not be found.
	 *
	 * @param fooId the primary key of the horari
	 * @return the horari, or <code>null</code> if a horari with the primary key could not be found
	 */
	public Horari fetchByPrimaryKey(long fooId);

	/**
	 * Returns all the horaris.
	 *
	 * @return the horaris
	 */
	public java.util.List<Horari> findAll();

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
	public java.util.List<Horari> findAll(int start, int end);

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
	public java.util.List<Horari> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horari>
			orderByComparator);

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
	public java.util.List<Horari> findAll(
		int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<Horari>
			orderByComparator,
		boolean useFinderCache);

	/**
	 * Removes all the horaris from the database.
	 */
	public void removeAll();

	/**
	 * Returns the number of horaris.
	 *
	 * @return the number of horaris
	 */
	public int countAll();

}