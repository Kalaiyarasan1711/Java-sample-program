package com.variables;

public class Variable_Declaration {
	
	static int a = 23; //Static variable
	
	int b = 90; //class variable
	
	public void squad() {
		int c =34;  //Inside the method (Local variable)
		System.out.println(c);
		
		
		

	}
	
	public static void main(String[] args) {
		int i = 13;
		System.out.println(i);
		
		System.out.println(a);
		Variable_Declaration s = new Variable_Declaration();
	
		s.squad();
		System.out.println(s.b);
		
		
	}

	
}
