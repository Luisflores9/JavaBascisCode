package com.syntax.class14;

public class MethodsDemo4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodsDemo4 md=new MethodsDemo4();
		System.out.println(md.sumNumbers(10, 10));
		md=str(3);
		
	}
	
	private static MethodsDemo4 str(int i) {
		// TODO Auto-generated method stub
		return null;
	}

	int sumNumbers(int num1, int num2) {
		return num1+num2;
	}
	
	void print(String str, int num3) {
		for ( int i=3; i<num3; i++) {
			System.out.println(str);
		}
	}
	
	
	


}
