package com.prodapt.week2Test;

public abstract class abstractBasics {
	abstract void abstractdemo();
	final void display() {
		System.out.println("Final Method Can't Override");
	}
	public abstractBasics(int a,int b) {
		int result=a+b;
		System.out.println("Addition of Two Numbers="+result);
		
	}
	static void method(int c,int d) {
		int res=c-d;
		System.out.println("Sub of Two Numbers is="+res);
	}

}
