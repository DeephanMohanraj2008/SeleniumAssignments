package week2.day1;

public class Library {
	
	//Defining addBook Method
	
	public String addBook(String bookTitle)
	{
		System.out.println("Book added Successfully");
		return bookTitle;
	}
	
	//Defining issueBook Method
	
	public void issueBook()
	{
		System.out.println("Book issued successfully");
	}

	public static void main(String[] args) {
	
	//Creating Object
    Library library=new Library();
    
    //Calling the methods
    String title;
    library.issueBook();
    title=library.addBook("Encyclopedia");
    System.out.println(title);
	}
}
