package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.MockitoAnnotations.initMocks;
import static org.mockito.BDDMockito.given;

public class AddControllerUnitTest {
	
	@Mock
	private addOperation addOperation;
	private DiviOperation divOperarion;
	private AddController controller;
	
	@Before
	public void initial(){
		initMocks(this);
	}
	
	@Test
	public void test() throws DivideOperationException {	
		given(divOperarion.calculateDiv(8, 2)).willReturn(4.0);	
		String result = controller.add(8, 2);
		assertEquals("4.0", result);
	}

}
