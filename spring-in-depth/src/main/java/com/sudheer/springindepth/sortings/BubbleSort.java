package com.sudheer.springindepth.sortings;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Qualifier("bubble")
public class BubbleSort implements SortingAlgorithm {

	@Override
	public int[] sort(int[] numbers) {
		//sorting logic
		return numbers;
	}

}
