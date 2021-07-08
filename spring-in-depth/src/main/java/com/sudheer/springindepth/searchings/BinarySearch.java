package com.sudheer.springindepth.searchings;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.sudheer.springindepth.sortings.SortingAlgorithm;

@Component
public class BinarySearch {
	
	@Autowired
	@Qualifier("bubble")
	//@Qualifier("quick")
	private SortingAlgorithm quickSort;
	
	public int search(int numbers[],int target) {
		//sort
		int[] sortedNumbers = this.quickSort.sort(numbers);
		//search
		System.out.println(quickSort);
		//return
		return 10;
	}

}
