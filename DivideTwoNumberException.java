package com.advance.exceptions;

public class DivideTwoNumberException {

	public static void main(String[] args) {
		System.out.println("30,2")	;	
		System.out.println("15,0")	;
		System.out.println("job is finished")	;

	}
	private static int divide(int dividend, int divisor) {
		try {
		return dividend/divisor;
		}catch(NullPointerException exception) {
			System.err.println("null pointer exception is thrown");
			return 0;
		}
		catch(ArithmeticException exception) {
			System.err.println("divisor can't be zero");
			exception.printStackTrace();
			return 0;
		}
		finally {
			System.out.println("this is useful tool for closing files ");
		}
		
	}

}
