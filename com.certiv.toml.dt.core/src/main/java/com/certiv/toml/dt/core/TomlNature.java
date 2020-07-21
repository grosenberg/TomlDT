/*******************************************************************************
 * Copyright (c) 2012, 2020 Certiv Analytics.
 *
 * This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License 2.0
 * which accompanies this distribution, and is available at
 * https://www.eclipse.org/legal/epl-2.0/
 *
 * SPDX-License-Identifier: EPL-2.0
 *******************************************************************************/
package com.certiv.toml.dt.core;

import net.certiv.dsl.core.DslCore;
import net.certiv.dsl.core.lang.DslNature;

public class TomlNature extends DslNature {

	@Override
	public DslCore getDslCore() {
		return TomlCore.getDefault();
	}
}
