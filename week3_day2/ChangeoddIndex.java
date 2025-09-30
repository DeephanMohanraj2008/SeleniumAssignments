package week3.day2;

public class ChangeoddIndex {

	public static void main(String[] args) {
		
		//Declare Variables
		String test="changeme";
		int i=0;
		
		//Convert String into array
		char[]text=test.toCharArray();
		
		//Get String length
		int length=test.length();
		
		//Iterate through each element and find the odd element in array and print in upper case letter
		for(i=0;i<length;i++)
		{			
			    if(i%2==0)
			    {
			    	System.out.print(Character.toUpperCase(text[i]));	
			    }		
			    else
			    {
			    	System.out.print(text[i]);	
			    }
			
		}

	}

}
