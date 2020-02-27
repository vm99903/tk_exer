package com.tk.vm.displayer;

/**
 * This class is Stage2 implementation of the given exercise.
 * It evaluates different criteria based on whether the given number is divisible by the given value(s) or whether the given number
 * contains the given value
 * @author vm
 *
 */
public class Stage2ValueDisplayer implements IValueDisplayer {
	
	private int evalCriteriaInt1;
	private int evalCriteriaInt2;
	
	/**
	 * Instantiates Stage2ValueDisplayer with two integer values. Both these values will be used in evaluating different criteria
	 * @param evalCriteriaInt1 is the first integer against which the given number will be evaluated
	 * @param evalCriteriaInt2 is the second integer against which the given number will be evaluated
	 */
	public Stage2ValueDisplayer(int evalCriteriaInt1, int evalCriteriaInt2) {
		this.evalCriteriaInt1 = evalCriteriaInt1;
		this.evalCriteriaInt2 = evalCriteriaInt2;
	}
	
	/**
	 * @see IValueDisplayer#isFizzBuzzCriteriaMet(int)
	 */
	@Override
	public boolean isFizzBuzzCriteriaMet(int number) {
		return isDivisbleByOrContainsValue(number, evalCriteriaInt1) && isDivisbleByOrContainsValue(number, evalCriteriaInt2);
	}

	/**
	 * @see IValueDisplayer#isFizzBuzzCriteriaMet(int)
	 */
	@Override
	public boolean isFizzCriteriaMet(int number) {
		return isDivisbleByOrContainsValue(number, evalCriteriaInt1);
	}
	
	/**
	 * @see IValueDisplayer#isBuzzCriteriaMet(int)
	 */
	@Override
	public boolean isBuzzCriteriaMet(int number) {
		return isDivisbleByOrContainsValue(number, evalCriteriaInt2);
	}
}
