package week1.day2;

import java.util.Scanner;

public class Fibonacci {
public static void main(String[] args) {
	int a[]=new int[20];
	int range,i;
	a[0]=0;
	a[1]=1;
	Scanner num=new Scanner(System.in);
	System.out.println("Enter the Range:");
	range=num.nextInt();
	System.out.println(a[0]);
	System.out.println(a[1]);
	for(i=2;i<=range-2;i++)
	{
	 a[i]=a[i-1]+a[i-2];
	 System.out.println(a[i]);
	}

}
}
