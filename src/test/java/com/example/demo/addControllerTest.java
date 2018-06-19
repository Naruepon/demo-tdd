package com.example.demo;

import static org.junit.Assert.*;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.test.context.junit4.SpringRunner;

// start spring
@RunWith(SpringRunner.class)
@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class addControllerTest {

	@Autowired
	private TestRestTemplate rest;
	
	@Test
	public void _1_add_a_sholudbe_2() {
		String result = rest.getForObject("/add/8/2", String.class);
		assertEquals("4.0", result);
	}

}
