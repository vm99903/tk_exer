package com.tk.vm;

import java.util.Arrays;
import java.util.stream.IntStream;

import com.tk.vm.displayer.IValueDisplayer;
import com.tk.vm.displayer.Stage1ValueDisplayer;
import com.tk.vm.displayer.Stage2ValueDisplayer;

/**
 * Main class 
 * @author vm
 *
 */
public class CodingExercise {
	
	private int[] arrayOfIntegers;
	private IValueDisplayer valueDisplayer;
	
	/**
	 * creates an array of integers from startRange till endRange
	 * @param startRange is the start of the range
	 * @param endRange is end of the range 
	 * @param valueDisplayer is an implementation of {@link IValueDisplayer}, this gets injected at instantiation
	 */
	public CodingExercise(int startRange, int endRange, IValueDisplayer valueDisplayer) {
		arrayOfIntegers = IntStream.range(startRange, endRange+1).toArray();
		this.valueDisplayer = valueDisplayer;
	}

	/**
	 * iterate through the range and prints the output to screen
	 */
	public void printOutput() {
		Arrays.stream(arrayOfIntegers).mapToObj(num -> getVal(num)).forEach(System.out::println);
	}

	/**
	 * uses the injected valueDisplayer to compute the output String value for given number
	 * @param num is the integer passed as argument
	 * @return display value based on injected valueDisplayer
	 */
	private String getVal(int num) {
		return valueDisplayer.getDisplayValue(num);
	}
	
	/**
	 * main method
	 */
	public static void main(String[] args) {
		// stage 1 
		IValueDisplayer valueDisplayer = new Stage1ValueDisplayer(3, 5);
		CodingExercise codingExercise = new CodingExercise(1, 100, valueDisplayer);
		System.out.println("Stage 1 Output");
		codingExercise.printOutput();
		
		// stage 2
		valueDisplayer = new Stage2ValueDisplayer(3, 5);
		codingExercise = new CodingExercise(1, 100, valueDisplayer);
		System.out.println("Stage 2 Output");
		codingExercise.printOutput();
	}
}
