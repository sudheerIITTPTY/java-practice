package com.sudheer.makito.makitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;

public class SomeBusinessImpMockTest {

	@Test
	public void testFindTheGreatestFromAllData() {
		
		DataService dataServiceMock = mock(DataService.class);
		//dataServiceMock.retriveAllData() => new int[] {25,12,3};
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {25,12,3});
		SomeBusinessImp someBusiness = new SomeBusinessImp(dataServiceMock);
		int result = someBusiness.findTheGreatesFromAllData();
		assertEquals(25,result);
	}
	@Test
	public void testFindTheGreatestFromAllDataForOne() {
		
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {13});
		SomeBusinessImp someBusiness = new SomeBusinessImp(dataServiceMock);
		int result = someBusiness.findTheGreatesFromAllData();
		assertEquals(13,result);
	}
	@Test
	public void testFindTheGreatestFromAllDataForTwo() {
		
		DataService dataServiceMock = mock(DataService.class);
		when(dataServiceMock.retriveAllData()).thenReturn(new int[] {13,30});
		SomeBusinessImp someBusiness = new SomeBusinessImp(dataServiceMock);
		int result = someBusiness.findTheGreatesFromAllData();
		assertEquals(30,result);
	}

}