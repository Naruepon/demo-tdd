package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;

public class FizzBuzz {

	InsertNumber insertNumber = new InsertNumber();
	@Test
	public void input_1_show_1() {
		String one = "1";	
		assertEquals(one, insertNumber.show(1));
		String result = insertNumber.show(1);
		System.out.println(" show 1 : " + result);
	}
	@Test
	public void input_2_show_2() {
		String two = "2";	
		assertEquals(two, insertNumber.show(2));
		String result = insertNumber.show(2);
		System.out.println(" show 1 : " + result);
	}
	@Test
	public void input_3_show_fizz() {
		String three = "fizz";
		assertEquals(three, insertNumber.show(3));
		String result = insertNumber.show(3);
		System.out.println(" show 3 : " + result);
	}
	@Test
	public void input_4_show_4() {
		String four = "4";
		assertEquals(four, insertNumber.show(4));
		String result = insertNumber.show(4);
		System.out.println(" show 4 : " + result);
	}

	@Test
	public void input_5_show_buzz() {
		String five = "buzz";
		assertEquals(five, insertNumber.show(5));
		String result = insertNumber.show(5);
		System.out.println(" show 5 : " + result);
	}
	@Test
	public void input_6_show_fizz() {
		String six = "fizz";
		assertEquals(six, insertNumber.show(6));
		String result = insertNumber.show(6);
		System.out.println(" show 6 : " + result);
	}
	@Test
	public void input_7_show_7() {
		String seven = "JAVA";
		assertEquals(seven, insertNumber.show(7));
		String result = insertNumber.show(7);
		System.out.println(" show 7 : " + result);
	}
	@Test
	public void input_10_show_buzz() {
		String ten = "buzz";
		assertEquals(ten, insertNumber.show(10));
		String result = insertNumber.show(10);
		System.out.println(" show 10 : " + result);
	}
	@Test
	public void input_15_show_fizzbuzz() {
		String fifteen = "fizzbuzz";
		assertEquals(fifteen, insertNumber.show(15));
		String result = insertNumber.show(15);
		System.out.println(" show 15 : " + result);
	}
}
