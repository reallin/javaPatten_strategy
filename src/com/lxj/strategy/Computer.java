package com.lxj.strategy;

public class Computer {
	public void cul(int a ,int b,ICulculator i){
		i.culCulator(a, b);
	}
}
