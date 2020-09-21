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

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link in2.liferay.crud.intranet.service.http.VacacionesServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class VacacionesSoap implements Serializable {

	public static VacacionesSoap toSoapModel(Vacaciones model) {
		VacacionesSoap soapModel = new VacacionesSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setVacId(model.getVacId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDesde(model.getDesde());
		soapModel.setHasta(model.getHasta());
		soapModel.setComentarios(model.getComentarios());
		soapModel.setCalendarBookingId(model.getCalendarBookingId());
		soapModel.setStatus(model.getStatus());
		soapModel.setStatusByUserId(model.getStatusByUserId());
		soapModel.setStatusByUserName(model.getStatusByUserName());
		soapModel.setStatusDate(model.getStatusDate());

		return soapModel;
	}

	public static VacacionesSoap[] toSoapModels(Vacaciones[] models) {
		VacacionesSoap[] soapModels = new VacacionesSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static VacacionesSoap[][] toSoapModels(Vacaciones[][] models) {
		VacacionesSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new VacacionesSoap[models.length][models[0].length];
		}
		else {
			soapModels = new VacacionesSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static VacacionesSoap[] toSoapModels(List<Vacaciones> models) {
		List<VacacionesSoap> soapModels = new ArrayList<VacacionesSoap>(
			models.size());

		for (Vacaciones model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new VacacionesSoap[soapModels.size()]);
	}

	public VacacionesSoap() {
	}

	public long getPrimaryKey() {
		return _vacId;
	}

	public void setPrimaryKey(long pk) {
		setVacId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getVacId() {
		return _vacId;
	}

	public void setVacId(long vacId) {
		_vacId = vacId;
	}

	public long getGroupId() {
		return _groupId;
	}

	public void setGroupId(long groupId) {
		_groupId = groupId;
	}

	public long getCompanyId() {
		return _companyId;
	}

	public void setCompanyId(long companyId) {
		_companyId = companyId;
	}

	public long getUserId() {
		return _userId;
	}

	public void setUserId(long userId) {
		_userId = userId;
	}

	public String getUserName() {
		return _userName;
	}

	public void setUserName(String userName) {
		_userName = userName;
	}

	public Date getCreateDate() {
		return _createDate;
	}

	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public void setModifiedDate(Date modifiedDate) {
		_modifiedDate = modifiedDate;
	}

	public Date getDesde() {
		return _desde;
	}

	public void setDesde(Date desde) {
		_desde = desde;
	}

	public Date getHasta() {
		return _hasta;
	}

	public void setHasta(Date hasta) {
		_hasta = hasta;
	}

	public String getComentarios() {
		return _comentarios;
	}

	public void setComentarios(String comentarios) {
		_comentarios = comentarios;
	}

	public long getCalendarBookingId() {
		return _calendarBookingId;
	}

	public void setCalendarBookingId(long calendarBookingId) {
		_calendarBookingId = calendarBookingId;
	}

	public int getStatus() {
		return _status;
	}

	public void setStatus(int status) {
		_status = status;
	}

	public long getStatusByUserId() {
		return _statusByUserId;
	}

	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	public String getStatusByUserName() {
		return _statusByUserName;
	}

	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	public Date getStatusDate() {
		return _statusDate;
	}

	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	private String _uuid;
	private long _vacId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private Date _desde;
	private Date _hasta;
	private String _comentarios;
	private long _calendarBookingId;
	private int _status;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;

}