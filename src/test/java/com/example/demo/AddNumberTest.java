package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class AddNumberTest {

	@Test
	public void one_add_one_should_return_2() {
		int addNumber01 = 1;
		int addNumber02= 1;
		addOperation addOperation = new addOperation();		
		double total = addOperation.caculate(addNumber01, addNumber02);
		assertEquals(2, total, 0.00);
		System.out.println(" total : " + total);
	}

}
