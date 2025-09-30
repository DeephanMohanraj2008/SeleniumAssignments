package week3.day2;

public class ReverseString {

	public static void main(String[] args) {
		
		//Declare String
		String text="TestLeaf";
		
		//Convert to char
		char[] text2=text.toCharArray();
		
		//get Length
		int len=text.length();
		
		//print in reverse
		for(int i=len-1;i>=0;i--)
		{
			System.out.print(text2[i]);
		}

	}

}
