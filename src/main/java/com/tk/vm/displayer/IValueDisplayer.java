package com.tk.vm.displayer;

/**
 * Interface for displaying value for the given number. Implementation of this interface decides the respective criteria
 * @author vm
 *
 */
public interface IValueDisplayer {
	
	String FIZZ = "Fizz";
	String BUZZ = "Buzz";
	String FIZZ_BUZZ = "FizzBuzz";
	int ZERO = 0;
	
	/**
	 * checks if the given number is divisible by the @val
	 * @param number is the number to check if it is divisible by @val
	 * @param val is the value
	 * @return true if number is divisible by given value else false
	 */
	default boolean isDivisibleByValue(int number, int val) {
		return number % val == ZERO;
	}
	
	/**
	 * checks if given number is either divisible by or contains the given value
	 * @param number is the number to check if it is divisible by @val or contains the digit @val
	 * @param val is the value
	 * @return true if number is either divisible by the given value or if number contains the given digit, else returns false
	 */
	default boolean isDivisbleByOrContainsValue(int number, int val) {
		return isDivisibleByValue(number, val) || String.valueOf(number).contains(String.valueOf(val));
	}

	/**
	 * checks if FizzBuzz criteria is met. Implementation decides the respective criteria  
	 * @param number is the number to check
	 * @return true if criteria is met, false otherwise
	 */
	boolean isFizzBuzzCriteriaMet(int number);
	
	/**
	 * checks if Fizz criteria is met. Implementation decides the respective criteria  
	 * @param number is the number to check
	 * @return true if criteria is met, false otherwise
	 */
	boolean isFizzCriteriaMet(int number);
	
	/**
	 * checks if Buzz criteria is met. Implementation decides the respective criteria  
	 * @param number is the number to check
	 * @return true if criteria is met, false otherwise
	 */
	boolean isBuzzCriteriaMet(int number);
	
	/**
	 * gets the display value on the basis of criteria. Implementing class(es) will define their respective criteria 
	 * @param number is the number which will be checked against all criteria 
	 * @return the display value for given number based on the evaluation
	 */
	default String getDisplayValue(int number) {
		String displayValue;
		if (isFizzBuzzCriteriaMet(number)) {
			displayValue = FIZZ_BUZZ;
		} else if (isFizzCriteriaMet(number)) {
			displayValue = FIZZ;
		} else if (isBuzzCriteriaMet(number)) {
			displayValue = BUZZ;
		} else {
			displayValue = String.valueOf(number);
		}
		return displayValue;
	}
}
