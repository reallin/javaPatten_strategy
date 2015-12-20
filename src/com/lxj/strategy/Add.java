package com.lxj.strategy;

public class Add implements ICulculator {

	public void culCulator(int a,int b) {
		int c = a+b;
		System.out.println("the result is: "+c);
	}

}
