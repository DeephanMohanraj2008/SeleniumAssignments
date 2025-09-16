package week1.day2;

import java.util.Scanner;

public class IsPrime {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     int i,counter=0;
     int j;
     Scanner s=new Scanner(System.in);
     System.out.println("Enter the Number:");
     i=s.nextInt();
     j=(int) Math.sqrt(i);
     if(i==1)
     {
    	 System.out.println("Entered Number is a Composite Number");
     }
     for (int k=2;k<=j;k++)
     {
    	 if(i%k==0)
          {
	      counter=counter+1;
          }
     }
  if(counter==0)
  {
	  System.out.println("Number is Prime");
  }
  else
  {
	  System.out.println("Number is Not Prime");
  }
	}     
	}
