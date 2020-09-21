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

package in2.liferay.crud.horari.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import in2.liferay.crud.horari.model.Horari;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Horari in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class HorariCacheModel implements CacheModel<Horari>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof HorariCacheModel)) {
			return false;
		}

		HorariCacheModel horariCacheModel = (HorariCacheModel)obj;

		if (fooId == horariCacheModel.fooId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, fooId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(21);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", fooId=");
		sb.append(fooId);
		sb.append(", groupId=");
		sb.append(groupId);
		sb.append(", companyId=");
		sb.append(companyId);
		sb.append(", userId=");
		sb.append(userId);
		sb.append(", userName=");
		sb.append(userName);
		sb.append(", createDate=");
		sb.append(createDate);
		sb.append(", modifiedDate=");
		sb.append(modifiedDate);
		sb.append(", desde=");
		sb.append(desde);
		sb.append(", hasta=");
		sb.append(hasta);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Horari toEntityModel() {
		HorariImpl horariImpl = new HorariImpl();

		if (uuid == null) {
			horariImpl.setUuid("");
		}
		else {
			horariImpl.setUuid(uuid);
		}

		horariImpl.setFooId(fooId);
		horariImpl.setGroupId(groupId);
		horariImpl.setCompanyId(companyId);
		horariImpl.setUserId(userId);

		if (userName == null) {
			horariImpl.setUserName("");
		}
		else {
			horariImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			horariImpl.setCreateDate(null);
		}
		else {
			horariImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			horariImpl.setModifiedDate(null);
		}
		else {
			horariImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (desde == Long.MIN_VALUE) {
			horariImpl.setDesde(null);
		}
		else {
			horariImpl.setDesde(new Date(desde));
		}

		if (hasta == Long.MIN_VALUE) {
			horariImpl.setHasta(null);
		}
		else {
			horariImpl.setHasta(new Date(hasta));
		}

		horariImpl.resetOriginalValues();

		return horariImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		fooId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		desde = objectInput.readLong();
		hasta = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(fooId);

		objectOutput.writeLong(groupId);

		objectOutput.writeLong(companyId);

		objectOutput.writeLong(userId);

		if (userName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(userName);
		}

		objectOutput.writeLong(createDate);
		objectOutput.writeLong(modifiedDate);
		objectOutput.writeLong(desde);
		objectOutput.writeLong(hasta);
	}

	public String uuid;
	public long fooId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long desde;
	public long hasta;

}