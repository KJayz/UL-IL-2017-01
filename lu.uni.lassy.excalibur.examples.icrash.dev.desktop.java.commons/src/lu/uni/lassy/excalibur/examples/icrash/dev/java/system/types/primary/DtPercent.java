/*******************************************************************************
 * Copyright (c) 2016-2017 University of Luxembourg.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 * 
 * Contributors:
 *     Mr. Rabbit
 ******************************************************************************/
package lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.primary;



import lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.design.JIntIs;
import lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.DtReal;
import lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.PtBoolean;
import lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.PtReal;

public class DtPercent extends DtReal implements JIntIs{

	/**
	 * 
	 */
	private static final long serialVersionUID = 5298248390425567739L;


	public DtPercent(PtReal r) {
		super(r);
	}
	
	//Un pourcentage doit etre entre 0 et 100
	private double _minValue = 0;
	private double _maxValue = 100;
	

	@Override
	public PtBoolean is() {
		return new PtBoolean(this.value.getValue() >= _minValue && this.value.getValue() <= _maxValue);
	}
	
	public Double Sum(DtPercent aDtPercent) { 
		return (this.value.getValue()+ aDtPercent.value.getValue());
	}
	
	

}
