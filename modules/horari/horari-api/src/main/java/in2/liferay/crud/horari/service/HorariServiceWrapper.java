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

package in2.liferay.crud.horari.service;

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link HorariService}.
 *
 * @author Brian Wing Shun Chan
 * @see HorariService
 * @generated
 */
public class HorariServiceWrapper
	implements HorariService, ServiceWrapper<HorariService> {

	public HorariServiceWrapper(HorariService horariService) {
		_horariService = horariService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _horariService.getOSGiServiceIdentifier();
	}

	@Override
	public HorariService getWrappedService() {
		return _horariService;
	}

	@Override
	public void setWrappedService(HorariService horariService) {
		_horariService = horariService;
	}

	private HorariService _horariService;

}