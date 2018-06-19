package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class divideNumberTest {

	@Test(expected=DivideOperationException.class)
	public void should_throws_exception_with_divide_by_zero() throws DivideOperationException {
		DiviOperation operation = new DiviOperation();
		operation.calculateDiv(2, 0);
	}

	@Test
	public void should_throws_exception_with_divide_by_two() throws DivideOperationException {
		DiviOperation operation = new DiviOperation();
		double actualResult = operation.calculateDiv(8, 2);
		assertEquals(4, actualResult, 0.000);
		System.out.println(" result : " + actualResult);
	}
}
