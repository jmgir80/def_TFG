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

import com.liferay.asset.kernel.model.AssetEntry;
import com.liferay.exportimport.kernel.lar.PortletDataContext;
import com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.DynamicQuery;
import com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery;
import com.liferay.portal.kernel.dao.orm.Projection;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.model.PersistedModel;
import com.liferay.portal.kernel.search.*;
import com.liferay.portal.kernel.search.Indexable;
import com.liferay.portal.kernel.search.IndexableType;
import com.liferay.portal.kernel.service.BaseLocalService;
import com.liferay.portal.kernel.service.PersistedModelLocalService;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.transaction.Isolation;
import com.liferay.portal.kernel.transaction.Propagation;
import com.liferay.portal.kernel.transaction.Transactional;
import com.liferay.portal.kernel.util.OrderByComparator;

import in2.liferay.crud.intranet.model.Vacaciones;

import java.io.Serializable;

import java.util.Date;
import java.util.List;

import org.osgi.annotation.versioning.ProviderType;

/**
 * Provides the local service interface for Vacaciones. Methods of this
 * service will not have security checks based on the propagated JAAS
 * credentials because this service can only be accessed from within the same
 * VM.
 *
 * @author Brian Wing Shun Chan
 * @see VacacionesLocalServiceUtil
 * @generated
 */
@ProviderType
@Transactional(
	isolation = Isolation.PORTAL,
	rollbackFor = {PortalException.class, SystemException.class}
)
public interface VacacionesLocalService
	extends BaseLocalService, PersistedModelLocalService {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. Always use {@link VacacionesLocalServiceUtil} to access the vacaciones local service. Add custom service methods to <code>in2.liferay.crud.intranet.service.impl.VacacionesLocalServiceImpl</code> and rerun ServiceBuilder to automatically copy the method declarations to this interface.
	 */
	public void addVacaciones(
		long groupId, long companyId, long userId, String userName, Date desde,
		Date hasta, String comentarios, long calendarBookingId);

	/**
	 * Adds the vacaciones to the database. Also notifies the appropriate model listeners.
	 *
	 * @param vacaciones the vacaciones
	 * @return the vacaciones that was added
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Vacaciones addVacaciones(Vacaciones vacaciones);

	/**
	 * @throws PortalException
	 */
	public PersistedModel createPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Creates a new vacaciones with the primary key. Does not add the vacaciones to the database.
	 *
	 * @param vacId the primary key for the new vacaciones
	 * @return the new vacaciones
	 */
	@Transactional(enabled = false)
	public Vacaciones createVacaciones(long vacId);

	public void deleteAsset(Vacaciones entry) throws SearchException;

	/**
	 * @throws PortalException
	 */
	@Override
	public PersistedModel deletePersistedModel(PersistedModel persistedModel)
		throws PortalException;

	/**
	 * Deletes the vacaciones with the primary key from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vacId the primary key of the vacaciones
	 * @return the vacaciones that was removed
	 * @throws PortalException if a vacaciones with the primary key could not be found
	 */
	@Indexable(type = IndexableType.DELETE)
	public Vacaciones deleteVacaciones(long vacId) throws PortalException;

	/**
	 * Deletes the vacaciones from the database. Also notifies the appropriate model listeners.
	 *
	 * @param vacaciones the vacaciones
	 * @return the vacaciones that was removed
	 */
	@Indexable(type = IndexableType.DELETE)
	public Vacaciones deleteVacaciones(Vacaciones vacaciones);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public DynamicQuery dynamicQuery();

	/**
	 * Performs a dynamic query on the database and returns the matching rows.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the matching rows
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(DynamicQuery dynamicQuery);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public <T> List<T> dynamicQuery(
		DynamicQuery dynamicQuery, int start, int end,
		OrderByComparator<T> orderByComparator);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(DynamicQuery dynamicQuery);

	/**
	 * Returns the number of rows matching the dynamic query.
	 *
	 * @param dynamicQuery the dynamic query
	 * @param projection the projection to apply to the query
	 * @return the number of rows matching the dynamic query
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public long dynamicQueryCount(
		DynamicQuery dynamicQuery, Projection projection);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Vacaciones fetchVacaciones(long vacId);

	/**
	 * Returns the vacaciones matching the UUID and group.
	 *
	 * @param uuid the vacaciones's UUID
	 * @param groupId the primary key of the group
	 * @return the matching vacaciones, or <code>null</code> if a matching vacaciones could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Vacaciones fetchVacacionesByUuidAndGroupId(
		String uuid, long groupId);

	public List<Vacaciones> findByIdGroup(long groupId);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ActionableDynamicQuery getActionableDynamicQuery();

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public ExportActionableDynamicQuery getExportActionableDynamicQuery(
		PortletDataContext portletDataContext);

	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public IndexableActionableDynamicQuery getIndexableActionableDynamicQuery();

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	public String getOSGiServiceIdentifier();

	/**
	 * @throws PortalException
	 */
	@Override
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public PersistedModel getPersistedModel(Serializable primaryKeyObj)
		throws PortalException;

	/**
	 * Returns the vacaciones with the primary key.
	 *
	 * @param vacId the primary key of the vacaciones
	 * @return the vacaciones
	 * @throws PortalException if a vacaciones with the primary key could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Vacaciones getVacaciones(long vacId) throws PortalException;

	/**
	 * Returns the vacaciones matching the UUID and group.
	 *
	 * @param uuid the vacaciones's UUID
	 * @param groupId the primary key of the group
	 * @return the matching vacaciones
	 * @throws PortalException if a matching vacaciones could not be found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public Vacaciones getVacacionesByUuidAndGroupId(String uuid, long groupId)
		throws PortalException;

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Vacaciones> getVacacioneses(int start, int end);

	/**
	 * Returns all the vacacioneses matching the UUID and company.
	 *
	 * @param uuid the UUID of the vacacioneses
	 * @param companyId the primary key of the company
	 * @return the matching vacacioneses, or an empty list if no matches were found
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Vacaciones> getVacacionesesByUuidAndCompanyId(
		String uuid, long companyId);

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
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public List<Vacaciones> getVacacionesesByUuidAndCompanyId(
		String uuid, long companyId, int start, int end,
		OrderByComparator<Vacaciones> orderByComparator);

	/**
	 * Returns the number of vacacioneses.
	 *
	 * @return the number of vacacioneses
	 */
	@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
	public int getVacacionesesCount();

	public AssetEntry updateAsset(long userId, Vacaciones page);

	@Indexable(type = IndexableType.REINDEX)
	public Vacaciones updateStatus(
			long userId, long entryId, int status,
			ServiceContext serviceContext)
		throws PortalException;

	/**
	 * Updates the vacaciones in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	 *
	 * @param vacaciones the vacaciones
	 * @return the vacaciones that was updated
	 */
	@Indexable(type = IndexableType.REINDEX)
	public Vacaciones updateVacaciones(Vacaciones vacaciones);

}