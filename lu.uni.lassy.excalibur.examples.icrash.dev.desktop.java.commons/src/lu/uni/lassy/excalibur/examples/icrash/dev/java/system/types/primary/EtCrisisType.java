/*******************************************************************************
 * Copyright (c) 2014-2015 University of Luxembourg.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Alfredo Capozucca - initial API and implementation
 *     Christophe Kamphaus - Remote implementation of Actors
 *     Thomas Mortimer - Updated client to MVC and added new design patterns
 ******************************************************************************/
package lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.primary;

import lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.design.JIntIs;
import lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.PtBoolean;

/**
 * The Enum EtCrisisType, which dictates the size of the crisis. How big was the accident?
 */
public enum EtCrisisType implements JIntIs {
	
	/** A very small crisis. */
	verysmall(1),
	/** A small crisis. */
	small(2), 
	/** A medium crisis. */
	medium(3), 
	/** A huge crisis. */
	huge(4),
	/** An insane crisis. */
	insane(5);
	
	
	private int value;
	EtCrisisType(int value) {
		this.value = value;
	}
	
	public int getValue() {
		return value;
	}
	/* (non-Javadoc)
	 * @see lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.design.DtIs#is()
	 */
	public PtBoolean is(){
		return new PtBoolean(this.name() == EtCrisisType.verysmall.name() ||
				this.name() == EtCrisisType.small.name()|| this.name() == EtCrisisType.medium.name()||
						this.name() == EtCrisisType.huge.name()||
								this.name() == EtCrisisType.insane.name());
	}
}
