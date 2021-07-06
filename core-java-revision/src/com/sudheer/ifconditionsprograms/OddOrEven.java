package com.sudheer.ifconditionsprograms;

import java.util.Random;

public class OddOrEven {
	
	private int num;
	
	public OddOrEven() {
		Random random = new Random();
		this.num = random.nextInt(100);
	}

	public OddOrEven(int num) {
		super();
		this.num = num;
	}
	
	public boolean isEven() {
		return num%2==0;
	}
	
	public boolean isOdd() {
		return num%2==1;
	}
	
	public void printNumber() {
		System.out.println(this.num);
	}

}
