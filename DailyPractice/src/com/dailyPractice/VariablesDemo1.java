package com.dailyPractice;

public class VariablesDemo1 {
	
	int s;
	static int jelin;
	
	protected void met1() {
		System.out.println("local variable is "+s);
		int s=50;
		System.out.println("local variable is "+s);
		
	}
	
	public void met2() {
		System.out.println("met2 called"+s);
		
	}

	public static void main(String[] args) {
		VariablesDemo1 obj = new VariablesDemo1();
		obj.s=100;
		obj.met1();
		
		VariablesDemo1 obj2 = new VariablesDemo1();
		obj2.s=200;
		
		obj2.met2();
		
	}
	

}
