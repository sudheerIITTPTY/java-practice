package com.sudheer.loopprograms;

public class FirstNNaturalNumbers {
	
	private int upperLimit;

	public FirstNNaturalNumbers(int upperLimit) {
		super();
		this.upperLimit = upperLimit;
	}
	
	public void printNNaturalNumbers() {
		for(int i = 0;i<=this.upperLimit;i++) {
			System.out.print(i + " ");
		}
		System.out.println("");
	}

}
