package week3.day2;

public class ReverseOddWords {

	public static void main(String[] args) {
		//Declare Variables		
		String test="I am a software tester";
		int i;
		char[] text;
		
		//Splitting the String into arrays based on blank space
		String[] splitText=test.split(" ");
		
		//Calculating length of array
	    int length=splitText.length;
	    
	    //Iterating through each element in array
	    for(i=0;i<=length-1;i++)
	    {
	    	//Print the even element as it is based on array index
	    	if(i%2==0)
	    	{
	    		System.out.print(" "+splitText[i]+" ");
	    	}
	    	//reverse odd element and print it
	    	else
	    	{
	    		text=splitText[i].toCharArray();
	    		int charLength=text.length;
	    		for(int j=charLength-1;j>=0;j--)
	    		{
	    			System.out.print(text[j]);
	    		}
	    	}
	    }
	}

}
