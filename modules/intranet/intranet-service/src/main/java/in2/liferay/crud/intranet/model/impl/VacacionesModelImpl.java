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

import com.liferay.expando.kernel.model.ExpandoBridge;
import com.liferay.expando.kernel.util.ExpandoBridgeFactoryUtil;
import com.liferay.exportimport.kernel.lar.StagedModelType;
import com.liferay.petra.string.StringBundler;
import com.liferay.portal.kernel.bean.AutoEscapeBeanHandler;
import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.json.JSON;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.ModelWrapper;
import com.liferay.portal.kernel.model.User;
import com.liferay.portal.kernel.model.impl.BaseModelImpl;
import com.liferay.portal.kernel.service.ServiceContext;
import com.liferay.portal.kernel.service.UserLocalServiceUtil;
import com.liferay.portal.kernel.util.GetterUtil;
import com.liferay.portal.kernel.util.PortalUtil;
import com.liferay.portal.kernel.util.ProxyUtil;
import com.liferay.portal.kernel.workflow.WorkflowConstants;

import in2.liferay.crud.intranet.model.Vacaciones;
import in2.liferay.crud.intranet.model.VacacionesModel;
import in2.liferay.crud.intranet.model.VacacionesSoap;

import java.io.Serializable;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationHandler;

import java.sql.Types;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.BiConsumer;
import java.util.function.Function;

/**
 * The base model implementation for the Vacaciones service. Represents a row in the &quot;Vacaciones_Vacaciones&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This implementation and its corresponding interface <code>VacacionesModel</code> exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link VacacionesImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see VacacionesImpl
 * @generated
 */
@JSON(strict = true)
public class VacacionesModelImpl
	extends BaseModelImpl<Vacaciones> implements VacacionesModel {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a vacaciones model instance should use the <code>Vacaciones</code> interface instead.
	 */
	public static final String TABLE_NAME = "Vacaciones_Vacaciones";

	public static final Object[][] TABLE_COLUMNS = {
		{"uuid_", Types.VARCHAR}, {"vacId", Types.BIGINT},
		{"groupId", Types.BIGINT}, {"companyId", Types.BIGINT},
		{"userId", Types.BIGINT}, {"userName", Types.VARCHAR},
		{"createDate", Types.TIMESTAMP}, {"modifiedDate", Types.TIMESTAMP},
		{"desde", Types.TIMESTAMP}, {"hasta", Types.TIMESTAMP},
		{"comentarios", Types.VARCHAR}, {"calendarBookingId", Types.BIGINT},
		{"status", Types.INTEGER}, {"statusByUserId", Types.BIGINT},
		{"statusByUserName", Types.VARCHAR}, {"statusDate", Types.TIMESTAMP}
	};

	public static final Map<String, Integer> TABLE_COLUMNS_MAP =
		new HashMap<String, Integer>();

	static {
		TABLE_COLUMNS_MAP.put("uuid_", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("vacId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("groupId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("companyId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("userName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("createDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("modifiedDate", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("desde", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("hasta", Types.TIMESTAMP);
		TABLE_COLUMNS_MAP.put("comentarios", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("calendarBookingId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("status", Types.INTEGER);
		TABLE_COLUMNS_MAP.put("statusByUserId", Types.BIGINT);
		TABLE_COLUMNS_MAP.put("statusByUserName", Types.VARCHAR);
		TABLE_COLUMNS_MAP.put("statusDate", Types.TIMESTAMP);
	}

	public static final String TABLE_SQL_CREATE =
		"create table Vacaciones_Vacaciones (uuid_ VARCHAR(75) null,vacId LONG not null primary key,groupId LONG,companyId LONG,userId LONG,userName VARCHAR(75) null,createDate DATE null,modifiedDate DATE null,desde DATE null,hasta DATE null,comentarios VARCHAR(75) null,calendarBookingId LONG,status INTEGER,statusByUserId LONG,statusByUserName VARCHAR(75) null,statusDate DATE null)";

	public static final String TABLE_SQL_DROP =
		"drop table Vacaciones_Vacaciones";

	public static final String ORDER_BY_JPQL =
		" ORDER BY vacaciones.userId ASC";

	public static final String ORDER_BY_SQL =
		" ORDER BY Vacaciones_Vacaciones.userId ASC";

	public static final String DATA_SOURCE = "liferayDataSource";

	public static final String SESSION_FACTORY = "liferaySessionFactory";

	public static final String TX_MANAGER = "liferayTransactionManager";

	public static final long COMPANYID_COLUMN_BITMASK = 1L;

	public static final long GROUPID_COLUMN_BITMASK = 2L;

	public static final long STATUS_COLUMN_BITMASK = 4L;

	public static final long USERID_COLUMN_BITMASK = 8L;

	public static final long USERNAME_COLUMN_BITMASK = 16L;

	public static final long UUID_COLUMN_BITMASK = 32L;

	public static void setEntityCacheEnabled(boolean entityCacheEnabled) {
		_entityCacheEnabled = entityCacheEnabled;
	}

	public static void setFinderCacheEnabled(boolean finderCacheEnabled) {
		_finderCacheEnabled = finderCacheEnabled;
	}

	/**
	 * Converts the soap model instance into a normal model instance.
	 *
	 * @param soapModel the soap model instance to convert
	 * @return the normal model instance
	 */
	public static Vacaciones toModel(VacacionesSoap soapModel) {
		if (soapModel == null) {
			return null;
		}

		Vacaciones model = new VacacionesImpl();

		model.setUuid(soapModel.getUuid());
		model.setVacId(soapModel.getVacId());
		model.setGroupId(soapModel.getGroupId());
		model.setCompanyId(soapModel.getCompanyId());
		model.setUserId(soapModel.getUserId());
		model.setUserName(soapModel.getUserName());
		model.setCreateDate(soapModel.getCreateDate());
		model.setModifiedDate(soapModel.getModifiedDate());
		model.setDesde(soapModel.getDesde());
		model.setHasta(soapModel.getHasta());
		model.setComentarios(soapModel.getComentarios());
		model.setCalendarBookingId(soapModel.getCalendarBookingId());
		model.setStatus(soapModel.getStatus());
		model.setStatusByUserId(soapModel.getStatusByUserId());
		model.setStatusByUserName(soapModel.getStatusByUserName());
		model.setStatusDate(soapModel.getStatusDate());

		return model;
	}

	/**
	 * Converts the soap model instances into normal model instances.
	 *
	 * @param soapModels the soap model instances to convert
	 * @return the normal model instances
	 */
	public static List<Vacaciones> toModels(VacacionesSoap[] soapModels) {
		if (soapModels == null) {
			return null;
		}

		List<Vacaciones> models = new ArrayList<Vacaciones>(soapModels.length);

		for (VacacionesSoap soapModel : soapModels) {
			models.add(toModel(soapModel));
		}

		return models;
	}

	public VacacionesModelImpl() {
	}

	@Override
	public long getPrimaryKey() {
		return _vacId;
	}

	@Override
	public void setPrimaryKey(long primaryKey) {
		setVacId(primaryKey);
	}

	@Override
	public Serializable getPrimaryKeyObj() {
		return _vacId;
	}

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj) {
		setPrimaryKey(((Long)primaryKeyObj).longValue());
	}

	@Override
	public Class<?> getModelClass() {
		return Vacaciones.class;
	}

	@Override
	public String getModelClassName() {
		return Vacaciones.class.getName();
	}

	@Override
	public Map<String, Object> getModelAttributes() {
		Map<String, Object> attributes = new HashMap<String, Object>();

		Map<String, Function<Vacaciones, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		for (Map.Entry<String, Function<Vacaciones, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Vacaciones, Object> attributeGetterFunction =
				entry.getValue();

			attributes.put(
				attributeName, attributeGetterFunction.apply((Vacaciones)this));
		}

		attributes.put("entityCacheEnabled", isEntityCacheEnabled());
		attributes.put("finderCacheEnabled", isFinderCacheEnabled());

		return attributes;
	}

	@Override
	public void setModelAttributes(Map<String, Object> attributes) {
		Map<String, BiConsumer<Vacaciones, Object>> attributeSetterBiConsumers =
			getAttributeSetterBiConsumers();

		for (Map.Entry<String, Object> entry : attributes.entrySet()) {
			String attributeName = entry.getKey();

			BiConsumer<Vacaciones, Object> attributeSetterBiConsumer =
				attributeSetterBiConsumers.get(attributeName);

			if (attributeSetterBiConsumer != null) {
				attributeSetterBiConsumer.accept(
					(Vacaciones)this, entry.getValue());
			}
		}
	}

	public Map<String, Function<Vacaciones, Object>>
		getAttributeGetterFunctions() {

		return _attributeGetterFunctions;
	}

	public Map<String, BiConsumer<Vacaciones, Object>>
		getAttributeSetterBiConsumers() {

		return _attributeSetterBiConsumers;
	}

	private static Function<InvocationHandler, Vacaciones>
		_getProxyProviderFunction() {

		Class<?> proxyClass = ProxyUtil.getProxyClass(
			Vacaciones.class.getClassLoader(), Vacaciones.class,
			ModelWrapper.class);

		try {
			Constructor<Vacaciones> constructor =
				(Constructor<Vacaciones>)proxyClass.getConstructor(
					InvocationHandler.class);

			return invocationHandler -> {
				try {
					return constructor.newInstance(invocationHandler);
				}
				catch (ReflectiveOperationException
							reflectiveOperationException) {

					throw new InternalError(reflectiveOperationException);
				}
			};
		}
		catch (NoSuchMethodException noSuchMethodException) {
			throw new InternalError(noSuchMethodException);
		}
	}

	private static final Map<String, Function<Vacaciones, Object>>
		_attributeGetterFunctions;
	private static final Map<String, BiConsumer<Vacaciones, Object>>
		_attributeSetterBiConsumers;

	static {
		Map<String, Function<Vacaciones, Object>> attributeGetterFunctions =
			new LinkedHashMap<String, Function<Vacaciones, Object>>();
		Map<String, BiConsumer<Vacaciones, ?>> attributeSetterBiConsumers =
			new LinkedHashMap<String, BiConsumer<Vacaciones, ?>>();

		attributeGetterFunctions.put("uuid", Vacaciones::getUuid);
		attributeSetterBiConsumers.put(
			"uuid", (BiConsumer<Vacaciones, String>)Vacaciones::setUuid);
		attributeGetterFunctions.put("vacId", Vacaciones::getVacId);
		attributeSetterBiConsumers.put(
			"vacId", (BiConsumer<Vacaciones, Long>)Vacaciones::setVacId);
		attributeGetterFunctions.put("groupId", Vacaciones::getGroupId);
		attributeSetterBiConsumers.put(
			"groupId", (BiConsumer<Vacaciones, Long>)Vacaciones::setGroupId);
		attributeGetterFunctions.put("companyId", Vacaciones::getCompanyId);
		attributeSetterBiConsumers.put(
			"companyId",
			(BiConsumer<Vacaciones, Long>)Vacaciones::setCompanyId);
		attributeGetterFunctions.put("userId", Vacaciones::getUserId);
		attributeSetterBiConsumers.put(
			"userId", (BiConsumer<Vacaciones, Long>)Vacaciones::setUserId);
		attributeGetterFunctions.put("userName", Vacaciones::getUserName);
		attributeSetterBiConsumers.put(
			"userName",
			(BiConsumer<Vacaciones, String>)Vacaciones::setUserName);
		attributeGetterFunctions.put("createDate", Vacaciones::getCreateDate);
		attributeSetterBiConsumers.put(
			"createDate",
			(BiConsumer<Vacaciones, Date>)Vacaciones::setCreateDate);
		attributeGetterFunctions.put(
			"modifiedDate", Vacaciones::getModifiedDate);
		attributeSetterBiConsumers.put(
			"modifiedDate",
			(BiConsumer<Vacaciones, Date>)Vacaciones::setModifiedDate);
		attributeGetterFunctions.put("desde", Vacaciones::getDesde);
		attributeSetterBiConsumers.put(
			"desde", (BiConsumer<Vacaciones, Date>)Vacaciones::setDesde);
		attributeGetterFunctions.put("hasta", Vacaciones::getHasta);
		attributeSetterBiConsumers.put(
			"hasta", (BiConsumer<Vacaciones, Date>)Vacaciones::setHasta);
		attributeGetterFunctions.put("comentarios", Vacaciones::getComentarios);
		attributeSetterBiConsumers.put(
			"comentarios",
			(BiConsumer<Vacaciones, String>)Vacaciones::setComentarios);
		attributeGetterFunctions.put(
			"calendarBookingId", Vacaciones::getCalendarBookingId);
		attributeSetterBiConsumers.put(
			"calendarBookingId",
			(BiConsumer<Vacaciones, Long>)Vacaciones::setCalendarBookingId);
		attributeGetterFunctions.put("status", Vacaciones::getStatus);
		attributeSetterBiConsumers.put(
			"status", (BiConsumer<Vacaciones, Integer>)Vacaciones::setStatus);
		attributeGetterFunctions.put(
			"statusByUserId", Vacaciones::getStatusByUserId);
		attributeSetterBiConsumers.put(
			"statusByUserId",
			(BiConsumer<Vacaciones, Long>)Vacaciones::setStatusByUserId);
		attributeGetterFunctions.put(
			"statusByUserName", Vacaciones::getStatusByUserName);
		attributeSetterBiConsumers.put(
			"statusByUserName",
			(BiConsumer<Vacaciones, String>)Vacaciones::setStatusByUserName);
		attributeGetterFunctions.put("statusDate", Vacaciones::getStatusDate);
		attributeSetterBiConsumers.put(
			"statusDate",
			(BiConsumer<Vacaciones, Date>)Vacaciones::setStatusDate);

		_attributeGetterFunctions = Collections.unmodifiableMap(
			attributeGetterFunctions);
		_attributeSetterBiConsumers = Collections.unmodifiableMap(
			(Map)attributeSetterBiConsumers);
	}

	@JSON
	@Override
	public String getUuid() {
		if (_uuid == null) {
			return "";
		}
		else {
			return _uuid;
		}
	}

	@Override
	public void setUuid(String uuid) {
		_columnBitmask |= UUID_COLUMN_BITMASK;

		if (_originalUuid == null) {
			_originalUuid = _uuid;
		}

		_uuid = uuid;
	}

	public String getOriginalUuid() {
		return GetterUtil.getString(_originalUuid);
	}

	@JSON
	@Override
	public long getVacId() {
		return _vacId;
	}

	@Override
	public void setVacId(long vacId) {
		_vacId = vacId;
	}

	@JSON
	@Override
	public long getGroupId() {
		return _groupId;
	}

	@Override
	public void setGroupId(long groupId) {
		_columnBitmask |= GROUPID_COLUMN_BITMASK;

		if (!_setOriginalGroupId) {
			_setOriginalGroupId = true;

			_originalGroupId = _groupId;
		}

		_groupId = groupId;
	}

	public long getOriginalGroupId() {
		return _originalGroupId;
	}

	@JSON
	@Override
	public long getCompanyId() {
		return _companyId;
	}

	@Override
	public void setCompanyId(long companyId) {
		_columnBitmask |= COMPANYID_COLUMN_BITMASK;

		if (!_setOriginalCompanyId) {
			_setOriginalCompanyId = true;

			_originalCompanyId = _companyId;
		}

		_companyId = companyId;
	}

	public long getOriginalCompanyId() {
		return _originalCompanyId;
	}

	@JSON
	@Override
	public long getUserId() {
		return _userId;
	}

	@Override
	public void setUserId(long userId) {
		_columnBitmask = -1L;

		if (!_setOriginalUserId) {
			_setOriginalUserId = true;

			_originalUserId = _userId;
		}

		_userId = userId;
	}

	@Override
	public String getUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setUserUuid(String userUuid) {
	}

	public long getOriginalUserId() {
		return _originalUserId;
	}

	@JSON
	@Override
	public String getUserName() {
		if (_userName == null) {
			return "";
		}
		else {
			return _userName;
		}
	}

	@Override
	public void setUserName(String userName) {
		_columnBitmask |= USERNAME_COLUMN_BITMASK;

		if (_originalUserName == null) {
			_originalUserName = _userName;
		}

		_userName = userName;
	}

	public String getOriginalUserName() {
		return GetterUtil.getString(_originalUserName);
	}

	@JSON
	@Override
	public Date getCreateDate() {
		return _createDate;
	}

	@Override
	public void setCreateDate(Date createDate) {
		_createDate = createDate;
	}

	@JSON
	@Override
	public Date getModifiedDate() {
		return _modifiedDate;
	}

	public boolean hasSetModifiedDate() {
		return _setModifiedDate;
	}

	@Override
	public void setModifiedDate(Date modifiedDate) {
		_setModifiedDate = true;

		_modifiedDate = modifiedDate;
	}

	@JSON
	@Override
	public Date getDesde() {
		return _desde;
	}

	@Override
	public void setDesde(Date desde) {
		_desde = desde;
	}

	@JSON
	@Override
	public Date getHasta() {
		return _hasta;
	}

	@Override
	public void setHasta(Date hasta) {
		_hasta = hasta;
	}

	@JSON
	@Override
	public String getComentarios() {
		if (_comentarios == null) {
			return "";
		}
		else {
			return _comentarios;
		}
	}

	@Override
	public void setComentarios(String comentarios) {
		_comentarios = comentarios;
	}

	@JSON
	@Override
	public long getCalendarBookingId() {
		return _calendarBookingId;
	}

	@Override
	public void setCalendarBookingId(long calendarBookingId) {
		_calendarBookingId = calendarBookingId;
	}

	@JSON
	@Override
	public int getStatus() {
		return _status;
	}

	@Override
	public void setStatus(int status) {
		_columnBitmask |= STATUS_COLUMN_BITMASK;

		if (!_setOriginalStatus) {
			_setOriginalStatus = true;

			_originalStatus = _status;
		}

		_status = status;
	}

	public int getOriginalStatus() {
		return _originalStatus;
	}

	@JSON
	@Override
	public long getStatusByUserId() {
		return _statusByUserId;
	}

	@Override
	public void setStatusByUserId(long statusByUserId) {
		_statusByUserId = statusByUserId;
	}

	@Override
	public String getStatusByUserUuid() {
		try {
			User user = UserLocalServiceUtil.getUserById(getStatusByUserId());

			return user.getUuid();
		}
		catch (PortalException portalException) {
			return "";
		}
	}

	@Override
	public void setStatusByUserUuid(String statusByUserUuid) {
	}

	@JSON
	@Override
	public String getStatusByUserName() {
		if (_statusByUserName == null) {
			return "";
		}
		else {
			return _statusByUserName;
		}
	}

	@Override
	public void setStatusByUserName(String statusByUserName) {
		_statusByUserName = statusByUserName;
	}

	@JSON
	@Override
	public Date getStatusDate() {
		return _statusDate;
	}

	@Override
	public void setStatusDate(Date statusDate) {
		_statusDate = statusDate;
	}

	@Override
	public StagedModelType getStagedModelType() {
		return new StagedModelType(
			PortalUtil.getClassNameId(Vacaciones.class.getName()));
	}

	@Override
	public boolean isApproved() {
		if (getStatus() == WorkflowConstants.STATUS_APPROVED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDenied() {
		if (getStatus() == WorkflowConstants.STATUS_DENIED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isDraft() {
		if (getStatus() == WorkflowConstants.STATUS_DRAFT) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isExpired() {
		if (getStatus() == WorkflowConstants.STATUS_EXPIRED) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isInactive() {
		if (getStatus() == WorkflowConstants.STATUS_INACTIVE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isIncomplete() {
		if (getStatus() == WorkflowConstants.STATUS_INCOMPLETE) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isPending() {
		if (getStatus() == WorkflowConstants.STATUS_PENDING) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public boolean isScheduled() {
		if (getStatus() == WorkflowConstants.STATUS_SCHEDULED) {
			return true;
		}
		else {
			return false;
		}
	}

	public long getColumnBitmask() {
		return _columnBitmask;
	}

	@Override
	public ExpandoBridge getExpandoBridge() {
		return ExpandoBridgeFactoryUtil.getExpandoBridge(
			getCompanyId(), Vacaciones.class.getName(), getPrimaryKey());
	}

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext) {
		ExpandoBridge expandoBridge = getExpandoBridge();

		expandoBridge.setAttributes(serviceContext);
	}

	@Override
	public Vacaciones toEscapedModel() {
		if (_escapedModel == null) {
			Function<InvocationHandler, Vacaciones>
				escapedModelProxyProviderFunction =
					EscapedModelProxyProviderFunctionHolder.
						_escapedModelProxyProviderFunction;

			_escapedModel = escapedModelProxyProviderFunction.apply(
				new AutoEscapeBeanHandler(this));
		}

		return _escapedModel;
	}

	@Override
	public Object clone() {
		VacacionesImpl vacacionesImpl = new VacacionesImpl();

		vacacionesImpl.setUuid(getUuid());
		vacacionesImpl.setVacId(getVacId());
		vacacionesImpl.setGroupId(getGroupId());
		vacacionesImpl.setCompanyId(getCompanyId());
		vacacionesImpl.setUserId(getUserId());
		vacacionesImpl.setUserName(getUserName());
		vacacionesImpl.setCreateDate(getCreateDate());
		vacacionesImpl.setModifiedDate(getModifiedDate());
		vacacionesImpl.setDesde(getDesde());
		vacacionesImpl.setHasta(getHasta());
		vacacionesImpl.setComentarios(getComentarios());
		vacacionesImpl.setCalendarBookingId(getCalendarBookingId());
		vacacionesImpl.setStatus(getStatus());
		vacacionesImpl.setStatusByUserId(getStatusByUserId());
		vacacionesImpl.setStatusByUserName(getStatusByUserName());
		vacacionesImpl.setStatusDate(getStatusDate());

		vacacionesImpl.resetOriginalValues();

		return vacacionesImpl;
	}

	@Override
	public int compareTo(Vacaciones vacaciones) {
		int value = 0;

		if (getUserId() < vacaciones.getUserId()) {
			value = -1;
		}
		else if (getUserId() > vacaciones.getUserId()) {
			value = 1;
		}
		else {
			value = 0;
		}

		if (value != 0) {
			return value;
		}

		return 0;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}

		if (!(obj instanceof Vacaciones)) {
			return false;
		}

		Vacaciones vacaciones = (Vacaciones)obj;

		long primaryKey = vacaciones.getPrimaryKey();

		if (getPrimaryKey() == primaryKey) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return (int)getPrimaryKey();
	}

	@Override
	public boolean isEntityCacheEnabled() {
		return _entityCacheEnabled;
	}

	@Override
	public boolean isFinderCacheEnabled() {
		return _finderCacheEnabled;
	}

	@Override
	public void resetOriginalValues() {
		VacacionesModelImpl vacacionesModelImpl = this;

		vacacionesModelImpl._originalUuid = vacacionesModelImpl._uuid;

		vacacionesModelImpl._originalGroupId = vacacionesModelImpl._groupId;

		vacacionesModelImpl._setOriginalGroupId = false;

		vacacionesModelImpl._originalCompanyId = vacacionesModelImpl._companyId;

		vacacionesModelImpl._setOriginalCompanyId = false;

		vacacionesModelImpl._originalUserId = vacacionesModelImpl._userId;

		vacacionesModelImpl._setOriginalUserId = false;

		vacacionesModelImpl._originalUserName = vacacionesModelImpl._userName;

		vacacionesModelImpl._setModifiedDate = false;

		vacacionesModelImpl._originalStatus = vacacionesModelImpl._status;

		vacacionesModelImpl._setOriginalStatus = false;

		vacacionesModelImpl._columnBitmask = 0;
	}

	@Override
	public CacheModel<Vacaciones> toCacheModel() {
		VacacionesCacheModel vacacionesCacheModel = new VacacionesCacheModel();

		vacacionesCacheModel.uuid = getUuid();

		String uuid = vacacionesCacheModel.uuid;

		if ((uuid != null) && (uuid.length() == 0)) {
			vacacionesCacheModel.uuid = null;
		}

		vacacionesCacheModel.vacId = getVacId();

		vacacionesCacheModel.groupId = getGroupId();

		vacacionesCacheModel.companyId = getCompanyId();

		vacacionesCacheModel.userId = getUserId();

		vacacionesCacheModel.userName = getUserName();

		String userName = vacacionesCacheModel.userName;

		if ((userName != null) && (userName.length() == 0)) {
			vacacionesCacheModel.userName = null;
		}

		Date createDate = getCreateDate();

		if (createDate != null) {
			vacacionesCacheModel.createDate = createDate.getTime();
		}
		else {
			vacacionesCacheModel.createDate = Long.MIN_VALUE;
		}

		Date modifiedDate = getModifiedDate();

		if (modifiedDate != null) {
			vacacionesCacheModel.modifiedDate = modifiedDate.getTime();
		}
		else {
			vacacionesCacheModel.modifiedDate = Long.MIN_VALUE;
		}

		Date desde = getDesde();

		if (desde != null) {
			vacacionesCacheModel.desde = desde.getTime();
		}
		else {
			vacacionesCacheModel.desde = Long.MIN_VALUE;
		}

		Date hasta = getHasta();

		if (hasta != null) {
			vacacionesCacheModel.hasta = hasta.getTime();
		}
		else {
			vacacionesCacheModel.hasta = Long.MIN_VALUE;
		}

		vacacionesCacheModel.comentarios = getComentarios();

		String comentarios = vacacionesCacheModel.comentarios;

		if ((comentarios != null) && (comentarios.length() == 0)) {
			vacacionesCacheModel.comentarios = null;
		}

		vacacionesCacheModel.calendarBookingId = getCalendarBookingId();

		vacacionesCacheModel.status = getStatus();

		vacacionesCacheModel.statusByUserId = getStatusByUserId();

		vacacionesCacheModel.statusByUserName = getStatusByUserName();

		String statusByUserName = vacacionesCacheModel.statusByUserName;

		if ((statusByUserName != null) && (statusByUserName.length() == 0)) {
			vacacionesCacheModel.statusByUserName = null;
		}

		Date statusDate = getStatusDate();

		if (statusDate != null) {
			vacacionesCacheModel.statusDate = statusDate.getTime();
		}
		else {
			vacacionesCacheModel.statusDate = Long.MIN_VALUE;
		}

		return vacacionesCacheModel;
	}

	@Override
	public String toString() {
		Map<String, Function<Vacaciones, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			4 * attributeGetterFunctions.size() + 2);

		sb.append("{");

		for (Map.Entry<String, Function<Vacaciones, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Vacaciones, Object> attributeGetterFunction =
				entry.getValue();

			sb.append(attributeName);
			sb.append("=");
			sb.append(attributeGetterFunction.apply((Vacaciones)this));
			sb.append(", ");
		}

		if (sb.index() > 1) {
			sb.setIndex(sb.index() - 1);
		}

		sb.append("}");

		return sb.toString();
	}

	@Override
	public String toXmlString() {
		Map<String, Function<Vacaciones, Object>> attributeGetterFunctions =
			getAttributeGetterFunctions();

		StringBundler sb = new StringBundler(
			5 * attributeGetterFunctions.size() + 4);

		sb.append("<model><model-name>");
		sb.append(getModelClassName());
		sb.append("</model-name>");

		for (Map.Entry<String, Function<Vacaciones, Object>> entry :
				attributeGetterFunctions.entrySet()) {

			String attributeName = entry.getKey();
			Function<Vacaciones, Object> attributeGetterFunction =
				entry.getValue();

			sb.append("<column><column-name>");
			sb.append(attributeName);
			sb.append("</column-name><column-value><![CDATA[");
			sb.append(attributeGetterFunction.apply((Vacaciones)this));
			sb.append("]]></column-value></column>");
		}

		sb.append("</model>");

		return sb.toString();
	}

	private static class EscapedModelProxyProviderFunctionHolder {

		private static final Function<InvocationHandler, Vacaciones>
			_escapedModelProxyProviderFunction = _getProxyProviderFunction();

	}

	private static boolean _entityCacheEnabled;
	private static boolean _finderCacheEnabled;

	private String _uuid;
	private String _originalUuid;
	private long _vacId;
	private long _groupId;
	private long _originalGroupId;
	private boolean _setOriginalGroupId;
	private long _companyId;
	private long _originalCompanyId;
	private boolean _setOriginalCompanyId;
	private long _userId;
	private long _originalUserId;
	private boolean _setOriginalUserId;
	private String _userName;
	private String _originalUserName;
	private Date _createDate;
	private Date _modifiedDate;
	private boolean _setModifiedDate;
	private Date _desde;
	private Date _hasta;
	private String _comentarios;
	private long _calendarBookingId;
	private int _status;
	private int _originalStatus;
	private boolean _setOriginalStatus;
	private long _statusByUserId;
	private String _statusByUserName;
	private Date _statusDate;
	private long _columnBitmask;
	private Vacaciones _escapedModel;

}