package com.sudheer.makito.makitodemo;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SomeBusinessImpTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		SomeBusinessImp businessImp = new SomeBusinessImp(new DataServiceStub());
		int greatestEle = businessImp.findTheGreatesFromAllData();
		assertEquals(24,greatestEle);
		
	}

}

class DataServiceStub implements DataService{

	@Override
	public int[] retriveAllData() {
		// TODO Auto-generated method stub
		return new int[] {24,6,15};
	}
	
}
