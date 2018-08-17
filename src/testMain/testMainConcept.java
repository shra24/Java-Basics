package testMain;

public class testMainConcept {
	
	//two main methods having different arguments - main method can be overloaded
	
	/*but if you run this program, then JVM (java version machin) will try to search for exact signature of main method / parameterof main method  i,e 
	main(String [] args) and only this main method will execute
	now, how you will call other main methods???-
	 * inside the  actual main method - call other methods by passing the parameters
	 */

	public static void main(String[] args) { // array parameter - main method -
	System.out.println("print yyy method");
	
	main(10);
	main("hiee");
	
	}
	public static void main(int a) {  // integer parameter
	System.out.println("print xxx method");
		
}
	
	public static void main(String a) {  // string parameter
		System.out.println("print aaaa method");
			
	}
}