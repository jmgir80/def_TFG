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

import in2.liferay.crud.horari.model.Horari;
import in2.liferay.crud.horari.service.HorariLocalServiceUtil;

/**
 * The extended model base implementation for the Horari service. Represents a row in the &quot;Horari_Horari&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This class exists only as a container for the default extended model level methods generated by ServiceBuilder. Helper methods and all application logic should be put in {@link HorariImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see HorariImpl
 * @see Horari
 * @generated
 */
public abstract class HorariBaseImpl extends HorariModelImpl implements Horari {

	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this class directly. All methods that expect a horari model instance should use the <code>Horari</code> interface instead.
	 */
	@Override
	public void persist() {
		if (this.isNew()) {
			HorariLocalServiceUtil.addHorari(this);
		}
		else {
			HorariLocalServiceUtil.updateHorari(this);
		}
	}

}