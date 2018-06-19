package com.example.demo;

import static org.junit.Assert.*;
import static org.mockito.BDDMockito.given;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;
//start spring
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class AddControllerMockTest {
	
	@MockBean
	private addOperation addoperation;
	private DiviOperation dividOperation;
	
	@Autowired
	private TestRestTemplate rest;

	@Test
	public void test() throws DivideOperationException {
		given(dividOperation.calculateDiv(8, 2)).willReturn(4.0);	
		String result = rest.getForObject("/add/8/2", String.class);
		assertEquals("4.0", result);
	}

}
