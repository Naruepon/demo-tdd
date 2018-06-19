package com.example.demo;

public class DiviOperation {

	public double calculateDiv(int i, int j) throws DivideOperationException {
		if(j==0){
			throw new DivideOperationException();
		}
		return i/j;
	}

}
