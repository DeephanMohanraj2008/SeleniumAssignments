package week3.day1;

import java.lang.reflect.Array;
import java.util.Arrays;

public class FindDups {

	public static void main(String[] args) {
		
		//InitializeArray
		int[] num= {2,5,7,7,5,9,2,3};
		
		//Get Array Length		
		int j=num.length;
		
		//Sort Array
		Arrays.sort(num);
		
		//Iterate through Array and find duplicates
		
		for(int i=0;i<j-1;i++)
		{
			if(num[i]==num[i+1])
			{
				System.out.println(num[i]);
			}
		}

	}

}
