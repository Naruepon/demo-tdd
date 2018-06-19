package com.example.demo;

//import com.example.demo.InsertNumber.IFizzBuzz;

public class InsertNumber {

	public String getNumber(int number) {		
		return "1";
	}
	public String show(int inputNumber){
		if(inputNumber%3 == 0 && inputNumber%5 == 0){
			return "fizzbuzz";
		}
		
		if(inputNumber%5 == 0 ){
			return "buzz";
		}
		if(inputNumber%3 == 0 ){
			return "fizz";
		}
		return String.valueOf(inputNumber);
	}
		
/*		
		IFizzBuzz[] rules = { new BuzzRule(), 
		                new FizzRule(),
		                new JavaRule()};
		for (IFizzBuzz rule : rules) {
		if(rule.isValid(inputNumber)) 
		  return rule.show();
}

	*/
/*	
	interface IFizzBuzz {
		boolean isValid(int inputNumber){
			String show();
		}
	}
	class BuzzRule implements IFizzBuzz {
	    public boolean isValid(int inputNumber) {
	        return inputNumber%5 == 0;
	    }
	    public String say() {
	        return "Buzz";
	    }
	}
	class FizzRule implements IFizzBuzz {
	    public boolean isValid(int inputNumber) {
	        return inputNumber%3 == 0;
	    }
	    public String say() {
	        return "Fizz";
	    }
	}
	class JavaRule implements IFizzBuzz {
	    public boolean isValid(int inputNumber) {
	        return inputNumber%7 == 0;
	    }
	    public String say() {
	        return "Java";
	    }
*/
}
