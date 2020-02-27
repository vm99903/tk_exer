package com.tk.vm.displayer;

import static org.junit.Assert.assertEquals;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import com.tk.vm.CodingExercise;

public class CodingExerciseTest {
	
	private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
	private final PrintStream originalOut = System.out;
	
	private CodingExercise codingExercise;
	
	@Before
	public void setUp() {
		System.setOut(new PrintStream(outContent));
		codingExercise = new CodingExercise(1, 10, new Stage1ValueDisplayer(2, 3));
	}

	@After
	public void tearDown() throws Exception {
		outContent.close();
		System.setOut(originalOut);		
	}

	@Test
	public void testPrintOutput() {
		codingExercise.printOutput();
		String text[] = outContent.toString().split("\n");
		assertEquals(10, text.length);
		assertEquals("1", text[0]);
		assertEquals("Fizz", text[1]);
		assertEquals("Buzz", text[2]);
		assertEquals("Fizz", text[3]);
		assertEquals("5", text[4]);
		assertEquals("FizzBuzz", text[5]);
		assertEquals("7", text[6]);
		assertEquals("Fizz", text[7]);
		assertEquals("Buzz", text[8]);
		assertEquals("Fizz", text[9]);
	}
}
