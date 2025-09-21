package week2.day1;

public class LibraryManagement {

	public static void main(String[] args) {
		//Creating Object of Library Class
		 Library library=new Library();
		 
		//Calling the methods of Library class
		 String title;
		 library.issueBook();
		 title=library.addBook("Encyclopedia");
		 System.out.println(title);
	}

}
