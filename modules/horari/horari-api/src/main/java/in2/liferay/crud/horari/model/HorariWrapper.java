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

import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.wrapper.BaseModelWrapper;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

/**
 * <p>
 * This class is a wrapper for {@link Horari}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Horari
 * @generated
 */
public class HorariWrapper
	extends BaseModelWrapper<Horari> implements Horari, ModelWrapper<Horari> {

	public HorariWrapper(Horari horari) {
		super(horari);
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		attributes.put("uuid", getUuid());
		attributes.put("fooId", getFooId());
		attributes.put("groupId", getGroupId());
		attributes.put("companyId", getCompanyId());
		attributes.put("userId", getUserId());
		attributes.put("userName", getUserName());
		attributes.put("createDate", getCreateDate());
		attributes.put("modifiedDate", getModifiedDate());
		attributes.put("desde", getDesde());
		attributes.put("hasta", getHasta());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		String uuid = (String)attributes.get("uuid");

		if (uuid != null) {
			setUuid(uuid);
		}

		Long fooId = (Long)attributes.get("fooId");

		if (fooId != null) {
			setFooId(fooId);
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
	}

	/**
	 * Returns the company ID of this horari.
	 *
	 * @return the company ID of this horari
	 */
	@Override
	public long getCompanyId() {
		return model.getCompanyId();
	}

	/**
	 * Returns the create date of this horari.
	 *
	 * @return the create date of this horari
	 */
	@Override
	public Date getCreateDate() {
		return model.getCreateDate();
	}

	/**
	 * Returns the desde of this horari.
	 *
	 * @return the desde of this horari
	 */
	@Override
	public Date getDesde() {
		return model.getDesde();
	}

	/**
	 * Returns the foo ID of this horari.
	 *
	 * @return the foo ID of this horari
	 */
	@Override
	public long getFooId() {
		return model.getFooId();
	}

	/**
	 * Returns the group ID of this horari.
	 *
	 * @return the group ID of this horari
	 */
	@Override
	public long getGroupId() {
		return model.getGroupId();
	}

	/**
	 * Returns the hasta of this horari.
	 *
	 * @return the hasta of this horari
	 */
	@Override
	public Date getHasta() {
		return model.getHasta();
	}

	/**
	 * Returns the modified date of this horari.
	 *
	 * @return the modified date of this horari
	 */
	@Override
	public Date getModifiedDate() {
		return model.getModifiedDate();
	}

	/**
	 * Returns the primary key of this horari.
	 *
	 * @return the primary key of this horari
	 */
	@Override
	public long getPrimaryKey() {
		return model.getPrimaryKey();
	}

	/**
	 * Returns the user ID of this horari.
	 *
	 * @return the user ID of this horari
	 */
	@Override
	public long getUserId() {
		return model.getUserId();
	}

	/**
	 * Returns the user name of this horari.
	 *
	 * @return the user name of this horari
	 */
	@Override
	public String getUserName() {
		return model.getUserName();
	}

	/**
	 * Returns the user uuid of this horari.
	 *
	 * @return the user uuid of this horari
	 */
	@Override
	public String getUserUuid() {
		return model.getUserUuid();
	}

	/**
	 * Returns the uuid of this horari.
	 *
	 * @return the uuid of this horari
	 */
	@Override
	public String getUuid() {
		return model.getUuid();
	}

	@Override
	public void persist() {
		model.persist();
	}

	/**
	 * Sets the company ID of this horari.
	 *
	 * @param companyId the company ID of this horari
	 */
	@Override
	public void setCompanyId(long companyId) {
		model.setCompanyId(companyId);
	}

	/**
	 * Sets the create date of this horari.
	 *
	 * @param createDate the create date of this horari
	 */
	@Override
	public void setCreateDate(Date createDate) {
		model.setCreateDate(createDate);
	}

	/**
	 * Sets the desde of this horari.
	 *
	 * @param desde the desde of this horari
	 */
	@Override
	public void setDesde(Date desde) {
		model.setDesde(desde);
	}

	/**
	 * Sets the foo ID of this horari.
	 *
	 * @param fooId the foo ID of this horari
	 */
	@Override
	public void setFooId(long fooId) {
		model.setFooId(fooId);
	}

	/**
	 * Sets the group ID of this horari.
	 *
	 * @param groupId the group ID of this horari
	 */
	@Override
	public void setGroupId(long groupId) {
		model.setGroupId(groupId);
	}

	/**
	 * Sets the hasta of this horari.
	 *
	 * @param hasta the hasta of this horari
	 */
	@Override
	public void setHasta(Date hasta) {
		model.setHasta(hasta);
	}

	/**
	 * Sets the modified date of this horari.
	 *
	 * @param modifiedDate the modified date of this horari
	 */
	@Override
	public void setModifiedDate(Date modifiedDate) {
		model.setModifiedDate(modifiedDate);
	}

	/**
	 * Sets the primary key of this horari.
	 *
	 * @param primaryKey the primary key of this horari
	 */
	@Override
	public void setPrimaryKey(long primaryKey) {
		model.setPrimaryKey(primaryKey);
	}

	/**
	 * Sets the user ID of this horari.
	 *
	 * @param userId the user ID of this horari
	 */
	@Override
	public void setUserId(long userId) {
		model.setUserId(userId);
	}

	/**
	 * Sets the user name of this horari.
	 *
	 * @param userName the user name of this horari
	 */
	@Override
	public void setUserName(String userName) {
		model.setUserName(userName);
	}

	/**
	 * Sets the user uuid of this horari.
	 *
	 * @param userUuid the user uuid of this horari
	 */
	@Override
	public void setUserUuid(String userUuid) {
		model.setUserUuid(userUuid);
	}

	/**
	 * Sets the uuid of this horari.
	 *
	 * @param uuid the uuid of this horari
	 */
	@Override
	public void setUuid(String uuid) {
		model.setUuid(uuid);
	}

	@Override
	public StagedModelType getStagedModelType() {
		return model.getStagedModelType();
	}

	@Override
	protected HorariWrapper wrap(Horari horari) {
		return new HorariWrapper(horari);
	}

}