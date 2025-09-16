package week1.day2;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    int i,rem,output=0;
    System.out.println("Enter the Number:");
    Scanner s=new Scanner(System.in);
    int input=s.nextInt();
    for (i=input;i>0;i=i/10)
    {
    	rem=(i%10);
    	output=output*10+rem;
    }
    if(input==output)
    {
    	System.out.println("Number is Palindrome");
    }
    else
    {
    	System.out.println("Number is Not Palindrome");
    }
    
	}

}
