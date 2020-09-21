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

package in2.liferay.crud.horari.service.impl;

import com.liferay.portal.aop.AopService;

import in2.liferay.crud.horari.model.Horari;
import in2.liferay.crud.horari.model.impl.HorariImpl;
import in2.liferay.crud.horari.service.base.HorariLocalServiceBaseImpl;

import org.osgi.service.component.annotations.Component;

import java.util.Date;
import java.util.List;

/**
 * The implementation of the horari local service.
 *
 * <p>
 * All custom service methods should be put in this class. Whenever methods are added, rerun ServiceBuilder to copy their definitions into the <code>in2.liferay.crud.horari.service.HorariLocalService</code> interface.
 *
 * <p>
 * This is a local service. Methods of this service will not have security checks based on the propagated JAAS credentials because this service can only be accessed from within the same VM.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HorariLocalServiceBaseImpl
 */
@Component(
	property = "model.class.name=in2.liferay.crud.horari.model.Horari",
	service = AopService.class
)
public class HorariLocalServiceImpl extends HorariLocalServiceBaseImpl {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never reference this class directly. Use <code>in2.liferay.crud.horari.service.HorariLocalService</code> via injection or a <code>org.osgi.util.tracker.ServiceTracker</code> or use <code>in2.liferay.crud.horari.service.HorariLocalServiceUtil</code>.
	 */

	public void addHorari(long groupId, long companyId, long userId, String userName, Date desde, Date hasta) {
		Horari horari = new HorariImpl();

		horari.setFooId(counterLocalService.increment());
		horari.setGroupId(groupId);
		horari.setCompanyId(companyId);
		horari.setUserId(userId);
		horari.setUserName(userName);
		horari.setDesde(desde);
		horari.setHasta(hasta);
		horari = horariLocalService.addHorari(horari);
	}

	public List<Horari> findByUsernameAndYear(String username){
		return this.horariPersistence.findByuserName(username);
	}

}