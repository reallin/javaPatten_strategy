package com.lxj.strategy;

public class Main {
	public static void main(String[] args){
		Computer  c = new Computer();
		Add add = new Add();
		Mul mul = new Mul();
		c.cul(1, 3, add);
		c.cul(1, 3, mul);
	}
}
