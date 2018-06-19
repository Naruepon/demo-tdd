package com.example.demo;

import static org.junit.Assert.*;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Collection;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.junit.runners.Parameterized.Parameter;
import org.junit.runners.Parameterized.Parameters;

@RunWith(Parameterized.class)
public class AddNumberWithParameterrizedTest {

	private int operrand01;
	private int operrand02;
	private double operrandResult;
	
	public AddNumberWithParameterrizedTest(int operrand01, int operrand02, double operrandResult) {

		this.operrand01 = operrand01;
		this.operrand02 = operrand02;
		this.operrandResult = operrandResult;
	}
	
	@Parameters
	public static Collection<Object[]> myData(){
		return Arrays.asList(new Object[][]{
			{1, 1, 2.0},
			{2, 2, 4.0}
			
		});
	}
	
	@Test
	public void add() {
		addOperation addOperation = new addOperation();		
		double total = addOperation.caculate(this.operrand01, this.operrand02);
		assertEquals(this.operrandResult, total, 0.000);
		System.out.println(" total : " + total);
	}
	
}
