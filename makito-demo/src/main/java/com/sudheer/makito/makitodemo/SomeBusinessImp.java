package com.sudheer.makito.makitodemo;

public class SomeBusinessImp {
	
	private DataService dataService;
	
	public SomeBusinessImp(DataService dataService) {
		this.dataService = dataService;
	}
	
	int findTheGreatesFromAllData() {
		
		int[] data = dataService.retriveAllData();
		int greatest = Integer.MIN_VALUE;
		for(int value:data) {
			if(value>greatest)
				greatest = value;
		}
		return greatest;
		
	}
}
