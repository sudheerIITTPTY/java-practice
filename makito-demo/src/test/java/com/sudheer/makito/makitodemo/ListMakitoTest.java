package com.sudheer.makito.makitodemo;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import java.util.List;

class ListMakitoTest {

	@Test
	public void testSizeMethod() {
		List listMock = mock(List.class);
		when(listMock.size()).thenReturn(10).thenReturn(20);
		assertEquals(10,listMock.size());
		assertEquals(20,listMock.size());
	}
	@Test
	public void testGetMethodWithSpecificParameter() {
		List listMock = mock(List.class);
		when(listMock.get(0)).thenReturn("SomeString");
		assertEquals("SomeString",listMock.get(0));
		assertEquals(null,listMock.get(1));
	}
	@Test
	public void testGetMethodWithAnyParameters(){
		List mockList = mock(List.class);
		when(mockList.get(Mockito.anyInt())).thenReturn("HelloWorld");
		assertEquals("HelloWorld", mockList.get(11));
		
		
	}
}
