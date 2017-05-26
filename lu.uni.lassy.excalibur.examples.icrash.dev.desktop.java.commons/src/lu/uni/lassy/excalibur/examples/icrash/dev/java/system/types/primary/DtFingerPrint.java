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

import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.Serializable;
import lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.design.JIntIs;
import lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.PtBoolean;

import java.awt.image.BufferedImage;

public class DtFingerPrint implements Serializable,JIntIs {

	/**
	 * 
	 */
	private static final long serialVersionUID = 2199100275426508608L;
	
	public byte[] fingerPrint;
	
	
	public DtFingerPrint(byte[] fingerPrint) throws IOException {
		this.fingerPrint=fingerPrint;
	}

//	private DtPercent _percentGrey;
//	private DtPercent _percentWhite;
//	private DtPercent _percentBlack;
//	
//	private double sumPercents = _percentGrey.Sum(new DtPercent (new PtReal(_percentWhite.Sum(_percentBlack))));
//	
	@Override
	public PtBoolean is() {
		
//		return new PtBoolean((sumPercents>=99)&&(sumPercents <=101)) ;
		return new PtBoolean(true);
	}
	
	public byte[] getFingerPrint() {
		return fingerPrint;
	}
	
	public Boolean compare(byte[] anImage) {
		return (fingerPrint.equals(anImage));
	}
	
	//Algorithm de reconnaissance de finger print a implementers

		
	
	
}
