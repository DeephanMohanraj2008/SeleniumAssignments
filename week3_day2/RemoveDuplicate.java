package week3.day2;

public class RemoveDuplicate {

	public static void main(String[] args) {
		//Declare Variables
		
		String text="We learn Java basics as part of java sessions in java week1";
		int i,j,count;
		
		String[] splitText=text.split(" ");
		int length=splitText.length;
		for(i=0;i<=length-1;i++)
		{
			count=0;
			for(j=0;j<=length-1;j++)
			{
				if(i!=j)
				{				
				if(splitText[i].equalsIgnoreCase(splitText[j]))
				{
					splitText[j]=" ";
					count=count+1;
				}
				if(count>1)
				{
					splitText[i]=" ";
				}
				}

			
		    }
			
		}
		for(i=0;i<=length-1;i++)
		{
			System.out.print(splitText[i]+" ");
		}
		
	}
}
	



