package com.syntax.class14;

public class MethodsDemo3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MethodsDemo3 md=new MethodsDemo3();
		System.out.println(md.isEven(3));
		
}

	boolean isEven(String str) {
		
		if (str.length()%2==0) {
			return true;
		}else {
			return false;
		}
	}

}
