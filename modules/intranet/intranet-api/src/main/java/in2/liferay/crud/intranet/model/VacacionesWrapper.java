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

package in2.liferay.crud.intranet.model;

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Vacaciones}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Vacaciones
 * @generated
 */
public class VacacionesWrapper
	extends BaseModelWrapper<Vacaciones>
	implements ModelWrapper<Vacaciones>, Vacaciones {

	public VacacionesWrapper(Vacaciones vacaciones) {
		super(vacaciones);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("vacId", getVacId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("desde", getDesde());
		attributes.put("hasta", getHasta());
		attributes.put("comentarios", getComentarios());
		attributes.put("calendarBookingId", getCalendarBookingId());
		attributes.put("status", getStatus());
		attributes.put("statusByUserId", getStatusByUserId());
		attributes.put("statusByUserName", getStatusByUserName());
		attributes.put("statusDate", getStatusDate());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long vacId = (Long)attributes.get("vacId");

		if (vacId != null) {
			setVacId(vacId);
		}

		Long groupId = (Long)attributes.get("groupId");

		if (groupId != null) {
			setGroupId(groupId);
		}

		Long companyId = (Long)attributes.get("companyId");

		if (companyId != null) {
			setCompanyId(companyId);
		}

		Long userId = (Long)attributes.get("userId");

		if (userId != null) {
			setUserId(userId);
		}

		String userName = (String)attributes.get("userName");

		if (userName != null) {
			setUserName(userName);
		}

		Date createDate = (Date)attributes.get("createDate");

		if (createDate != null) {
			setCreateDate(createDate);
		}

		Date modifiedDate = (Date)attributes.get("modifiedDate");

		if (modifiedDate != null) {
			setModifiedDate(modifiedDate);
		}

		Date desde = (Date)attributes.get("desde");

		if (desde != null) {
			setDesde(desde);
		}

		Date hasta = (Date)attributes.get("hasta");

		if (hasta != null) {
			setHasta(hasta);
		}

		String comentarios = (String)attributes.get("comentarios");

		if (comentarios != null) {
			setComentarios(comentarios);
		}

		Long calendarBookingId = (Long)attributes.get("calendarBookingId");

		if (calendarBookingId != null) {
			setCalendarBookingId(calendarBookingId);
		}

		Integer status = (Integer)attributes.get("status");

		if (status != null) {
			setStatus(status);
		}

		Long statusByUserId = (Long)attributes.get("statusByUserId");

		if (statusByUserId != null) {
			setStatusByUserId(statusByUserId);
		}

		String statusByUserName = (String)attributes.get("statusByUserName");

		if (statusByUserName != null) {
			setStatusByUserName(statusByUserName);
		}

		Date statusDate = (Date)attributes.get("statusDate");

		if (statusDate != null) {
			setStatusDate(statusDate);
		}
	}

	/**
	 * Returns the calendar booking ID of this vacaciones.
	 *
	 * @return the calendar booking ID of this vacaciones
	 */
	@Override
	public long getCalendarBookingId() {
		return model.getCalendarBookingId();
	}

	/**
	 * Returns the comentarios of this vacaciones.
	 *
	 * @return the comentarios of this vacaciones
	 */
	@Override
	public String getComentarios() {
		return model.getComentarios();
	}

	/**
	 * Returns the company ID of this vacaciones.
	 *
	 * @return the company ID of this vacaciones
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this vacaciones.
	 *
	 * @return the create date of this vacaciones
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the desde of this vacaciones.
	 *
	 * @return the desde of this vacaciones
	 */
	@Override
	public Date getDesde() {
		return model.getDesde();
	}

	/**
	 * Returns the group ID of this vacaciones.
	 *
	 * @return the group ID of this vacaciones
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hasta of this vacaciones.
	 *
	 * @return the hasta of this vacaciones
	 */
	@Override
	public Date getHasta() {
		return model.getHasta();
	}

	/**
	 * Returns the modified date of this vacaciones.
	 *
	 * @return the modified date of this vacaciones
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this vacaciones.
	 *
	 * @return the primary key of this vacaciones
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the status of this vacaciones.
	 *
	 * @return the status of this vacaciones
	 */
	@Override
	public int getStatus() {
		return model.getStatus();
	}

	/**
	 * Returns the status by user ID of this vacaciones.
	 *
	 * @return the status by user ID of this vacaciones
	 */
	@Override
	public long getStatusByUserId() {
		return model.getStatusByUserId();
	}

	/**
	 * Returns the status by user name of this vacaciones.
	 *
	 * @return the status by user name of this vacaciones
	 */
	@Override
	public String getStatusByUserName() {
		return model.getStatusByUserName();
	}

	/**
	 * Returns the status by user uuid of this vacaciones.
	 *
	 * @return the status by user uuid of this vacaciones
	 */
	@Override
	public String getStatusByUserUuid() {
		return model.getStatusByUserUuid();
	}

	/**
	 * Returns the status date of this vacaciones.
	 *
	 * @return the status date of this vacaciones
	 */
	@Override
	public Date getStatusDate() {
		return model.getStatusDate();
	}

	/**
	 * Returns the user ID of this vacaciones.
	 *
	 * @return the user ID of this vacaciones
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this vacaciones.
	 *
	 * @return the user name of this vacaciones
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this vacaciones.
	 *
	 * @return the user uuid of this vacaciones
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this vacaciones.
	 *
	 * @return the uuid of this vacaciones
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	/**
	 * Returns the vac ID of this vacaciones.
	 *
	 * @return the vac ID of this vacaciones
	 */
	@Override
	public long getVacId() {
		return model.getVacId();
	}

	/**
	 * Returns <code>true</code> if this vacaciones is approved.
	 *
	 * @return <code>true</code> if this vacaciones is approved; <code>false</code> otherwise
	 */
	@Override
	public boolean isApproved() {
		return model.isApproved();
	}

	/**
	 * Returns <code>true</code> if this vacaciones is denied.
	 *
	 * @return <code>true</code> if this vacaciones is denied; <code>false</code> otherwise
	 */
	@Override
	public boolean isDenied() {
		return model.isDenied();
	}

	/**
	 * Returns <code>true</code> if this vacaciones is a draft.
	 *
	 * @return <code>true</code> if this vacaciones is a draft; <code>false</code> otherwise
	 */
	@Override
	public boolean isDraft() {
		return model.isDraft();
	}

	/**
	 * Returns <code>true</code> if this vacaciones is expired.
	 *
	 * @return <code>true</code> if this vacaciones is expired; <code>false</code> otherwise
	 */
	@Override
	public boolean isExpired() {
		return model.isExpired();
	}

	/**
	 * Returns <code>true</code> if this vacaciones is inactive.
	 *
	 * @return <code>true</code> if this vacaciones is inactive; <code>false</code> otherwise
	 */
	@Override
	public boolean isInactive() {
		return model.isInactive();
	}

	/**
	 * Returns <code>true</code> if this vacaciones is incomplete.
	 *
	 * @return <code>true</code> if this vacaciones is incomplete; <code>false</code> otherwise
	 */
	@Override
	public boolean isIncomplete() {
		return model.isIncomplete();
	}

	/**
	 * Returns <code>true</code> if this vacaciones is pending.
	 *
	 * @return <code>true</code> if this vacaciones is pending; <code>false</code> otherwise
	 */
	@Override
	public boolean isPending() {
		return model.isPending();
	}

	/**
	 * Returns <code>true</code> if this vacaciones is scheduled.
	 *
	 * @return <code>true</code> if this vacaciones is scheduled; <code>false</code> otherwise
	 */
	@Override
	public boolean isScheduled() {
		return model.isScheduled();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the calendar booking ID of this vacaciones.
	 *
	 * @param calendarBookingId the calendar booking ID of this vacaciones
	 */
	@Override
	public void setCalendarBookingId(long calendarBookingId) {
		model.setCalendarBookingId(calendarBookingId);
	}

	/**
	 * Sets the comentarios of this vacaciones.
	 *
	 * @param comentarios the comentarios of this vacaciones
	 */
	@Override
	public void setComentarios(String comentarios) {
		model.setComentarios(comentarios);
	}

	/**
	 * Sets the company ID of this vacaciones.
	 *
	 * @param companyId the company ID of this vacaciones
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this vacaciones.
	 *
	 * @param createDate the create date of this vacaciones
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the desde of this vacaciones.
	 *
	 * @param desde the desde of this vacaciones
	 */
	@Override
	public void setDesde(Date desde) {
		model.setDesde(desde);
	}

	/**
	 * Sets the group ID of this vacaciones.
	 *
	 * @param groupId the group ID of this vacaciones
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hasta of this vacaciones.
	 *
	 * @param hasta the hasta of this vacaciones
	 */
	@Override
	public void setHasta(Date hasta) {
		model.setHasta(hasta);
	}

	/**
	 * Sets the modified date of this vacaciones.
	 *
	 * @param modifiedDate the modified date of this vacaciones
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this vacaciones.
	 *
	 * @param primaryKey the primary key of this vacaciones
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the status of this vacaciones.
	 *
	 * @param status the status of this vacaciones
	 */
	@Override
	public void setStatus(int status) {
		model.setStatus(status);
	}

	/**
	 * Sets the status by user ID of this vacaciones.
	 *
	 * @param statusByUserId the status by user ID of this vacaciones
	 */
	@Override
	public void setStatusByUserId(long statusByUserId) {
		model.setStatusByUserId(statusByUserId);
	}

	/**
	 * Sets the status by user name of this vacaciones.
	 *
	 * @param statusByUserName the status by user name of this vacaciones
	 */
	@Override
	public void setStatusByUserName(String statusByUserName) {
		model.setStatusByUserName(statusByUserName);
	}

	/**
	 * Sets the status by user uuid of this vacaciones.
	 *
	 * @param statusByUserUuid the status by user uuid of this vacaciones
	 */
	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
		model.setStatusByUserUuid(statusByUserUuid);
	}

	/**
	 * Sets the status date of this vacaciones.
	 *
	 * @param statusDate the status date of this vacaciones
	 */
	@Override
	public void setStatusDate(Date statusDate) {
		model.setStatusDate(statusDate);
	}

	/**
	 * Sets the user ID of this vacaciones.
	 *
	 * @param userId the user ID of this vacaciones
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this vacaciones.
	 *
	 * @param userName the user name of this vacaciones
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this vacaciones.
	 *
	 * @param userUuid the user uuid of this vacaciones
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this vacaciones.
	 *
	 * @param uuid the uuid of this vacaciones
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	/**
	 * Sets the vac ID of this vacaciones.
	 *
	 * @param vacId the vac ID of this vacaciones
	 */
	@Override
	public void setVacId(long vacId) {
		model.setVacId(vacId);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected VacacionesWrapper wrap(Vacaciones vacaciones) {
		return new VacacionesWrapper(vacaciones);
	}

}