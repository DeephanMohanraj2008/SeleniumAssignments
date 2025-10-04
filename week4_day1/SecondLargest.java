package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SecondLargest {

	public static void main(String[] args) {
		
		//Declaring List
		List<Integer> numbers=new ArrayList<>();
		
		//Adding numbers in list
		numbers.add(3);
		numbers.add(2);
		numbers.add(11);
		numbers.add(4);
		numbers.add(6);
		numbers.add(7);
		
		//Calculating list size
		int length=numbers.size();
		
		//Sorting List
		Collections.sort(numbers);
		
		//Printing second largest number
	    int secondLargest=numbers.get(length-2);
		System.out.println("Second Largest Number is:"+secondLargest);

	}

}
