package week4.day1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class SortingCollection {

	public static void main(String[] args) {
		//Declare List
		List<String>company=new ArrayList<String>();
		
		//Add values in the list
		company.add("HCL");
		company.add("Wipro");
		company.add("Aspire Systems");
		company.add("CTS");
		
		//Get list size
		int count=company.size();
		
		//Sort the list
		Collections.sort(company);
		
		//Print the list in reverse order
		for(int i=count-1;i>=0;i--)
		{
			System.out.println(company.get(i));
		}	

	}

}
