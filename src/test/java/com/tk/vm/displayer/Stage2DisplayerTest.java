package com.tk.vm.displayer;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

public class Stage2DisplayerTest {
	
	private IValueDisplayer valueDisplayer;

	@Before
	public void setUp() {
		valueDisplayer = new Stage2ValueDisplayer(3, 5);
	}

	@Test
	public void testIsFizzBuzzCriteriaMet() {
		assertTrue(valueDisplayer.isFizzBuzzCriteriaMet(15));
		assertTrue(valueDisplayer.isFizzBuzzCriteriaMet(35));
		assertTrue(valueDisplayer.isFizzBuzzCriteriaMet(53));
		assertTrue(valueDisplayer.isFizzBuzzCriteriaMet(60));
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
		assertTrue(valueDisplayer.isFizzCriteriaMet(23));
		assertTrue(valueDisplayer.isFizzCriteriaMet(31));
		assertFalse(valueDisplayer.isFizzCriteriaMet(20));
		assertFalse(valueDisplayer.isFizzCriteriaMet(55));
	}
	
	@Test
	public void testIsBuzzCriteriaMet() throws Exception {
		assertTrue(valueDisplayer.isBuzzCriteriaMet(15));
		assertTrue(valueDisplayer.isBuzzCriteriaMet(20));
		assertTrue(valueDisplayer.isBuzzCriteriaMet(51));
		assertTrue(valueDisplayer.isBuzzCriteriaMet(65));
		assertFalse(valueDisplayer.isBuzzCriteriaMet(9));
		assertFalse(valueDisplayer.isBuzzCriteriaMet(63));
		assertFalse(valueDisplayer.isBuzzCriteriaMet(33));
	}
	
	@Test
	public void testDisplayValue() throws Exception {
		assertEquals("Fizz", valueDisplayer.getDisplayValue(3));
		assertEquals("FizzBuzz", valueDisplayer.getDisplayValue(30));
		assertEquals("FizzBuzz", valueDisplayer.getDisplayValue(35));
		assertEquals("FizzBuzz", valueDisplayer.getDisplayValue(60));
		assertEquals("4", valueDisplayer.getDisplayValue(4));
		assertEquals("17", valueDisplayer.getDisplayValue(17));
		assertEquals("Buzz", valueDisplayer.getDisplayValue(5));
		assertEquals("Buzz", valueDisplayer.getDisplayValue(55));
		assertEquals("Fizz", valueDisplayer.getDisplayValue(43));
		assertEquals("Buzz", valueDisplayer.getDisplayValue(70));
	}
}
