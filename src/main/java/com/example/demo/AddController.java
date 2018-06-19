package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AddController {
	

	@Autowired
	DiviOperation operation;
	
	addOperation operation02;
	
	@GetMapping("/add/{i01}/{i02}")
	public String add(@PathVariable int i01, @PathVariable int i02) throws DivideOperationException{
//		addOperation operation = new addOperation();
		
		double result = operation.calculateDiv(i01, i02);
		System.out.println(" result : " + result);
		return String.valueOf(result);

	}

	public void setOperation(DiviOperation operation) {
		this.operation = operation;
	}

/*	
	public void setOperation(addOperation operation) {
		this.operation02 = operation;
	}
*/
}
