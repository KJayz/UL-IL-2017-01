package lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.primary;

import lu.uni.lassy.excalibur.examples.icrash.dev.java.system.types.design.JIntIs;
import lu.uni.lassy.excalibur.examples.icrash.dev.java.types.stdlib.PtBoolean;

/**
 * The Enum EtExperience, which dictates the experience level of a coordinator.
 */

public enum EtExperience implements JIntIs {
	/**
	 * The lowest to the highest experience level, ranked accordingly and given a value between 1-5,
	 * where 1 is the lowest value and 5 is the highest.
	 */
	novice(1),
	beginner(2),
	experienced(3),
	professional(4),
	expert(5);
	
	/**
	 * Assigns the value of the experience level to the instance of EtExperience
	 */
	private int value;
	private EtExperience(int value) {
		this.value = value;
	}
	
	/**
	 * Allows the value of the experience level to be requested
	 * @return
	 */
	public int getValue() {
		return value;
	}
	
	public PtBoolean is(){
		return new PtBoolean(this.name() == EtExperience.novice.name() ||this.name() == EtExperience.beginner.name() || 
				this.name() == EtExperience.experienced.name() ||this.name() == EtExperience.professional.name() ||this.name() == EtExperience.expert.name());
	}
}
