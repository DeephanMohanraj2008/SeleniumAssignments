package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingElement {

	public static void main(String[] args) {
		//Declaring List
		List<Integer> numbers=new ArrayList<>();
		
		//Adding numbers in list
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(10);
		numbers.add(6);
		numbers.add(8);
		
		//Getting List Size
		int count=numbers.size();
		
		//Sorting the list
		Collections.sort(numbers);
		
		//Printing the missed numbers in list
		System.out.println("Missing Numbers are:");
		for(int i=0;i<=count-2;i++)
		{
			int number1=numbers.get(i);
			int number2=numbers.get(i+1);
			if((number1+1)!=(number2))
			{
				System.out.println(number1+1);
			}
		}
		
	}

}
