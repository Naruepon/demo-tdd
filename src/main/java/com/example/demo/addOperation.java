package com.example.demo;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class addOperation {

	
	public double caculate(int addNumber01, int addNumber02) {
		return addNumber01 + addNumber02;
	}

}
