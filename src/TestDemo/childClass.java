package TestDemo;

public class childClass {
	
	
	
	
	public static void main (String [] args) {
		
		division();
	}

public  static void division () {
	int  i=  10;
	try {
		System.out.println("inside try block ");
		int k= i/0 ;
	}
	catch(ArithmeticException e ) {
		
		System.out.println("divide by zero");
	}
	
	
	finally {
		System.out.println("execute this code even after exception");
	}
}

}