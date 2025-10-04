package week4.day1;

//Defining class which implements DatabaseConnection interface

public class DemonstratingInterface implements DatabaseConnection {
	
	//Defining methods from interface
	
	public void connect() {
		System.out.println("Connect");
		
	}

	public void disconnect() {
		System.out.println("Disconnect");
		
	}

	public void executeUpdate() {
		System.out.println("Execute Update");
		
	}


	public static void main(String[] args) {
		//Creating Object
		DemonstratingInterface demo=new DemonstratingInterface();
		
		//Calling methods
		demo.connect();
		demo.disconnect();
		demo.executeUpdate();
	}

	
}
