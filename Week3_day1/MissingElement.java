package week3.day1;

import java.util.Arrays;

public class MissingElement {

	public static void main(String[] args) {
		
		//initialize Array and instance variables
		int[] num= {1,4,3,2,8,6,7};
		int i,j=0;
		
		//Sort Arrays
		Arrays.sort(num);
		
		//Iterate each element to find missing number
		for (i=0;i<num.length-1;i++)
		{
			j=i+1;
			if(num[i]!=j)
			{
				System.out.println("Missing number is:"+j);
				break;
			}
				
		}

	}

}
