package com.tk.vm.displayer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Stage1DisplayerTest {
	
	private IValueDisplayer valueDisplayer;

	@Before
	public void setUp() {
		valueDisplayer = new Stage1ValueDisplayer(3, 5);
	}

	@Test
	public void testIsFizzBuzzCriteriaMet() {
		assertTrue(valueDisplayer.isFizzBuzzCriteriaMet(15));
		assertFalse(valueDisplayer.isFizzBuzzCriteriaMet(9));
		assertFalse(valueDisplayer.isFizzBuzzCriteriaMet(10));
		assertFalse(valueDisplayer.isFizzBuzzCriteriaMet(19));
		assertFalse(valueDisplayer.isFizzBuzzCriteriaMet(23));
		assertFalse(valueDisplayer.isFizzBuzzCriteriaMet(55));
	}
	
	@Test
	public void testIsFizzCriteriaMet() throws Exception {
		assertTrue(valueDisplayer.isFizzCriteriaMet(15));
		assertTrue(valueDisplayer.isFizzCriteriaMet(9));
		assertFalse(valueDisplayer.isFizzCriteriaMet(20));
		assertFalse(valueDisplayer.isFizzCriteriaMet(23));
		assertFalse(valueDisplayer.isFizzCriteriaMet(55));
	}
	
	@Test
	public void testIsBuzzCriteriaMet() throws Exception {
		assertTrue(valueDisplayer.isBuzzCriteriaMet(15));
		assertTrue(valueDisplayer.isBuzzCriteriaMet(20));
		assertFalse(valueDisplayer.isBuzzCriteriaMet(9));
		assertFalse(valueDisplayer.isBuzzCriteriaMet(51));
		assertFalse(valueDisplayer.isBuzzCriteriaMet(33));
	}
	
	@Test
	public void testDisplayValue() throws Exception {
		assertEquals("Fizz", valueDisplayer.getDisplayValue(3));
		assertEquals("FizzBuzz", valueDisplayer.getDisplayValue(30));
		assertEquals("4", valueDisplayer.getDisplayValue(4));
		assertEquals("Buzz", valueDisplayer.getDisplayValue(5));
		assertEquals("Buzz", valueDisplayer.getDisplayValue(55));
		assertEquals("43", valueDisplayer.getDisplayValue(43));
	}
}
