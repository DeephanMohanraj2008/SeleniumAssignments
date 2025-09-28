package week3.day1;

import java.util.Arrays;

public class FindIntersection {

	public static void main(String[] args) {
		
		//Initialize Arrays
		int[] array1= {3,2,11,4,6,7};
		int[] array2= {1,2,8,4,9,7};
		
		//Sort Arrays
		Arrays.sort(array1);
		Arrays.sort(array2);
		
		//Iterate through Array to find the matching element
		for(int i=0;i<=array1.length-1;i++)
		{
			for(int j=0;j<=array1.length-1;j++)
			{
				if(array1[i]==array2[j])
				{
					System.out.println("Matching Number is: "+array1[i]);
				}
			}
		}

	}

}
