package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class NumberIntersection {

	public static void main(String[] args) {
		
		//Defining both lists
		List<Integer> number1=new ArrayList<>();
		List<Integer> number2=new ArrayList<>();
		
		//Adding number in 1st list
		number1.add(3);
		number1.add(2);
		number1.add(11);
		number1.add(4);
		number1.add(6);
		number1.add(7);
		
		//Adding number in 2nd list
		number2.add(1);
		number2.add(2);
		number2.add(8);
		number2.add(4);
		number2.add(9);
		number2.add(7);
		
		//Sorting both lists
		
		Collections.sort(number1);
		Collections.sort(number2);
		
		//Find the intersection element and printing
		
		int length=number1.size();
		for(int i=0;i<=length-1;i++)
		{
			if(number1.get(i)==number2.get(i))
			{
				System.out.println("Intersection Number is:"+number1.get(i));
				
			}
		}
		

	}

}
