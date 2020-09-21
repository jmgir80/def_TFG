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

package in2.liferay.crud.intranet.model.impl;

import com.liferay.petra.lang.HashUtil;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.model.CacheModel;

import in2.liferay.crud.intranet.model.Vacaciones;

import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;

import java.util.Date;

/**
 * The cache model class for representing Vacaciones in entity cache.
 *
 * @author Brian Wing Shun Chan
 * @generated
 */
public class VacacionesCacheModel
	implements CacheModel<Vacaciones>, Externalizable {

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof VacacionesCacheModel)) {
			return false;
		}

		VacacionesCacheModel vacacionesCacheModel = (VacacionesCacheModel)obj;

		if (vacId == vacacionesCacheModel.vacId) {
			return true;
		}

		return false;
	}

	@Override
	public int hashCode() {
		return HashUtil.hash(0, vacId);
	}

	@Override
	public String toString() {
		StringBundler sb = new StringBundler(33);

		sb.append("{uuid=");
		sb.append(uuid);
		sb.append(", vacId=");
		sb.append(vacId);
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
		sb.append(", comentarios=");
		sb.append(comentarios);
		sb.append(", calendarBookingId=");
		sb.append(calendarBookingId);
		sb.append(", status=");
		sb.append(status);
		sb.append(", statusByUserId=");
		sb.append(statusByUserId);
		sb.append(", statusByUserName=");
		sb.append(statusByUserName);
		sb.append(", statusDate=");
		sb.append(statusDate);
		sb.append("}");

		return sb.toString();
	}

	@Override
	public Vacaciones toEntityModel() {
		VacacionesImpl vacacionesImpl = new VacacionesImpl();

		if (uuid == null) {
			vacacionesImpl.setUuid("");
		}
		else {
			vacacionesImpl.setUuid(uuid);
		}

		vacacionesImpl.setVacId(vacId);
		vacacionesImpl.setGroupId(groupId);
		vacacionesImpl.setCompanyId(companyId);
		vacacionesImpl.setUserId(userId);

		if (userName == null) {
			vacacionesImpl.setUserName("");
		}
		else {
			vacacionesImpl.setUserName(userName);
		}

		if (createDate == Long.MIN_VALUE) {
			vacacionesImpl.setCreateDate(null);
		}
		else {
			vacacionesImpl.setCreateDate(new Date(createDate));
		}

		if (modifiedDate == Long.MIN_VALUE) {
			vacacionesImpl.setModifiedDate(null);
		}
		else {
			vacacionesImpl.setModifiedDate(new Date(modifiedDate));
		}

		if (desde == Long.MIN_VALUE) {
			vacacionesImpl.setDesde(null);
		}
		else {
			vacacionesImpl.setDesde(new Date(desde));
		}

		if (hasta == Long.MIN_VALUE) {
			vacacionesImpl.setHasta(null);
		}
		else {
			vacacionesImpl.setHasta(new Date(hasta));
		}

		if (comentarios == null) {
			vacacionesImpl.setComentarios("");
		}
		else {
			vacacionesImpl.setComentarios(comentarios);
		}

		vacacionesImpl.setCalendarBookingId(calendarBookingId);
		vacacionesImpl.setStatus(status);
		vacacionesImpl.setStatusByUserId(statusByUserId);

		if (statusByUserName == null) {
			vacacionesImpl.setStatusByUserName("");
		}
		else {
			vacacionesImpl.setStatusByUserName(statusByUserName);
		}

		if (statusDate == Long.MIN_VALUE) {
			vacacionesImpl.setStatusDate(null);
		}
		else {
			vacacionesImpl.setStatusDate(new Date(statusDate));
		}

		vacacionesImpl.resetOriginalValues();

		return vacacionesImpl;
	}

	@Override
	public void readExternal(ObjectInput objectInput) throws IOException {
		uuid = objectInput.readUTF();

		vacId = objectInput.readLong();

		groupId = objectInput.readLong();

		companyId = objectInput.readLong();

		userId = objectInput.readLong();
		userName = objectInput.readUTF();
		createDate = objectInput.readLong();
		modifiedDate = objectInput.readLong();
		desde = objectInput.readLong();
		hasta = objectInput.readLong();
		comentarios = objectInput.readUTF();

		calendarBookingId = objectInput.readLong();

		status = objectInput.readInt();

		statusByUserId = objectInput.readLong();
		statusByUserName = objectInput.readUTF();
		statusDate = objectInput.readLong();
	}

	@Override
	public void writeExternal(ObjectOutput objectOutput) throws IOException {
		if (uuid == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(uuid);
		}

		objectOutput.writeLong(vacId);

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

		if (comentarios == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(comentarios);
		}

		objectOutput.writeLong(calendarBookingId);

		objectOutput.writeInt(status);

		objectOutput.writeLong(statusByUserId);

		if (statusByUserName == null) {
			objectOutput.writeUTF("");
		}
		else {
			objectOutput.writeUTF(statusByUserName);
		}

		objectOutput.writeLong(statusDate);
	}

	public String uuid;
	public long vacId;
	public long groupId;
	public long companyId;
	public long userId;
	public String userName;
	public long createDate;
	public long modifiedDate;
	public long desde;
	public long hasta;
	public String comentarios;
	public long calendarBookingId;
	public int status;
	public long statusByUserId;
	public String statusByUserName;
	public long statusDate;

}