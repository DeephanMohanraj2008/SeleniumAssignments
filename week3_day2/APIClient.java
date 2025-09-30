package week3.day2;

public class APIClient {
	
	//Declaring SendRequest method with one parameter
	
	public void sendRequest(String endpoint) {
		System.out.println("Endpoint is:"+endpoint);
	}
	
	//Declaring SendRequest method with three parameters
	public void sendRequest(String endpoint,String requestBody,String requestStatus) {
		System.out.println("Endpoint is:"+endpoint);
		System.out.println("RequestBody is:"+requestBody);
		System.out.println("RequestStatus is:"+requestStatus);
	}
	

	public static void main(String[] args) {
		//Creating object
		APIClient client=new APIClient();
		
		//Doing method overloading. calling method and passing input value
		client.sendRequest("www.facebook.com");
		client.sendRequest("www.google.com", "{}", "Cookie:");

	}

}
