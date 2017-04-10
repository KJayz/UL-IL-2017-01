package lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.primary;

import lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.design.JIntIs;
import lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.DtInteger;
import lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.PtBoolean;
import lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.PtInteger;


/**
 * The Class DtGrade, which holds a datatype of the grade.
 */
public class DtGrade extends DtInteger implements JIntIs {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 227L;
	
	/**
	 * Instantiates a new datatype grade.
	 *
	 * @param i The primitive type integer (Integer) to become the datatype grade
	 */
	public DtGrade(PtInteger i) {
		super(i);
	}
	
	/**
	 * The minimum value a grade can have
	 */
	private int _minvalue =1;
	
	/**
	 * The maximum value a grade can have
	 */
	private int _maxvalue =5;
	
	public PtBoolean is(){
		return new PtBoolean(this.value.getValue() >= _minvalue && this.value.getValue() <= _maxvalue);
	}
	
}
