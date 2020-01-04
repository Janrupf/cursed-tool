/*
 * Patchwork Project
 * Copyright (C) 2019 PatchworkMC and contributors
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 3 of the License, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program; if not, write to the Free Software Foundation,
 * Inc., 51 Franklin Street, Fifth Floor, Boston, MA  02110-1301, USA.
 */

package com.patchworkmc.jobs.parser.token;

import com.patchworkmc.jobs.parser.FrozenFilePosition;

public class BooleanConstant extends JobDefinitionToken {
	private final boolean value;

	public BooleanConstant(FrozenFilePosition startPosition, FrozenFilePosition endPosition, boolean value) {
		super(startPosition, endPosition);
		this.value = value;
	}

	public boolean value() {
		return value;
	}
}
