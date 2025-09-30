package week3.day2;

//Element class inheriting Button class which inherits WebElement class

public class Elements extends Button {

	public static void main(String[] args) {
		//Creating Object for Element class
		Elements element=new Elements();
		
		//Calling functions from Button class
		element.submit();
		
		//Calling methods from WebElement Class
		element.click();
		element.setText("Demo");

	}

}
