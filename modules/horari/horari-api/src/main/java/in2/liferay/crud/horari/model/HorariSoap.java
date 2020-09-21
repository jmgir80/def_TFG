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

package in2.liferay.crud.horari.model;

import java.io.Serializable;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * This class is used by SOAP remote services, specifically {@link in2.liferay.crud.horari.service.http.HorariServiceSoap}.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HorariSoap implements Serializable {

	public static HorariSoap toSoapModel(Horari model) {
		HorariSoap soapModel = new HorariSoap();

		soapModel.setUuid(model.getUuid());
		soapModel.setFooId(model.getFooId());
		soapModel.setGroupId(model.getGroupId());
		soapModel.setCompanyId(model.getCompanyId());
		soapModel.setUserId(model.getUserId());
		soapModel.setUserName(model.getUserName());
		soapModel.setCreateDate(model.getCreateDate());
		soapModel.setModifiedDate(model.getModifiedDate());
		soapModel.setDesde(model.getDesde());
		soapModel.setHasta(model.getHasta());

		return soapModel;
	}

	public static HorariSoap[] toSoapModels(Horari[] models) {
		HorariSoap[] soapModels = new HorariSoap[models.length];

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModel(models[i]);
		}

		return soapModels;
	}

	public static HorariSoap[][] toSoapModels(Horari[][] models) {
		HorariSoap[][] soapModels = null;

		if (models.length > 0) {
			soapModels = new HorariSoap[models.length][models[0].length];
		}
		else {
			soapModels = new HorariSoap[0][0];
		}

		for (int i = 0; i < models.length; i++) {
			soapModels[i] = toSoapModels(models[i]);
		}

		return soapModels;
	}

	public static HorariSoap[] toSoapModels(List<Horari> models) {
		List<HorariSoap> soapModels = new ArrayList<HorariSoap>(models.size());

		for (Horari model : models) {
			soapModels.add(toSoapModel(model));
		}

		return soapModels.toArray(new HorariSoap[soapModels.size()]);
	}

	public HorariSoap() {
	}

	public long getPrimaryKey() {
		return _fooId;
	}

	public void setPrimaryKey(long pk) {
		setFooId(pk);
	}

	public String getUuid() {
		return _uuid;
	}

	public void setUuid(String uuid) {
		_uuid = uuid;
	}

	public long getFooId() {
		return _fooId;
	}

	public void setFooId(long fooId) {
		_fooId = fooId;
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

	private String _uuid;
	private long _fooId;
	private long _groupId;
	private long _companyId;
	private long _userId;
	private String _userName;
	private Date _createDate;
	private Date _modifiedDate;
	private Date _desde;
	private Date _hasta;

}