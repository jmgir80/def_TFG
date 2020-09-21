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

import com.liferay.portal.kernel.service.ServiceWrapper;

/**
 * Provides a wrapper for {@link VacacionesService}.
 *
 * @author Brian Wing Shun Chan
 * @see VacacionesService
 * @generated
 */
public class VacacionesServiceWrapper
	implements ServiceWrapper<VacacionesService>, VacacionesService {

	public VacacionesServiceWrapper(VacacionesService vacacionesService) {
		_vacacionesService = vacacionesService;
	}

	/**
	 * Returns the OSGi service identifier.
	 *
	 * @return the OSGi service identifier
	 */
	@Override
	public String getOSGiServiceIdentifier() {
		return _vacacionesService.getOSGiServiceIdentifier();
	}

	@Override
	public VacacionesService getWrappedService() {
		return _vacacionesService;
	}

	@Override
	public void setWrappedService(VacacionesService vacacionesService) {
		_vacacionesService = vacacionesService;
	}

	private VacacionesService _vacacionesService;

}