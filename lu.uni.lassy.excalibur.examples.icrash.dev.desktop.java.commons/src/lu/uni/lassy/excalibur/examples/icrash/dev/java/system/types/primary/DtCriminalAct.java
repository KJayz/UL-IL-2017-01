
package lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.primary;

import lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.design.JIntIs;
import lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.DtString;
import lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.PtBoolean;
import lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.PtString;

/**
 * The Class DtCriminalAct, which holds the data type of the Criminal Act Message.
 */
public class DtCriminalAct extends DtString implements JIntIs {

	/** The Constant serialVersionUID. */
	private static final long serialVersionUID = 227L;
	
	/**
	 * Instantiates a new datatype of the criminal act.
	 *
	 * @param s The primitive type of string to put into the datatype
	 */
	public DtCriminalAct(PtString s) {
		super(s);
	}
	
	/** The maximum length of a criminal act . */
	private int _maxLength = 100;
	

	public PtBoolean is(){
		return new PtBoolean((this.value.getValue().length() <= _maxLength));
	}
}