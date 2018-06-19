package com.example.demo;

import java.util.Random;

public class MyRandom {
	IRandom random;
	public MyRandom(IRandom random) {
		this.random = random;
	}
	public int generate(){
		
//		return this.random.nextInt(10);
		return this.random.getNumber();
	}
	
}
