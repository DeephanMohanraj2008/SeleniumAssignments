package week3.day2;

import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		
		//Declaring Strings and instance variables
		String text1="stops";
		String text2="potss";
		int counter=0;
		
		//Calculating String length
		int text1Length=text1.length();
		int text2Length=text2.length();
		
		//Validating if both string lenghths are equal
		if(text1Length==text2Length)
		{
			System.out.println("Length are equal");
		}
		else
		{
			System.out.println("Length are not equal");
		}
		
		//Converting Strings to Array
		char[]charText1=text1.toCharArray();
		char[]charText2=text2.toCharArray();
		
		//Sorting the Array
		Arrays.sort(charText1);
		Arrays.sort(charText2);
		
		//Checking if each element is same in both Arrays
		for(int i=0;i<=text1Length-1;i++)
		{
			if(charText1[i]==charText2[i])
            {
	        counter=0;
            }
			else
			{
				counter = counter+1;
			}
		}
		
		//Printing the output
		if(counter==0)
		{
			System.out.println("The given string are Anagram");
		}
		else
		{
			System.out.println("The given string are not Anagram");
		}
			
		
		
	}

}
