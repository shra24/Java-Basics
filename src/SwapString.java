
public class SwapString {

	public static void main(String[] args) {
		
		String a = "hellow" ;
		String b = "Selenium" ;
		/*System.out.println("Before Swapping");
		System.out.println("Value of a is ::" + a);
		System.out.println("Value of b is::" +b);
		System.out.println(a+b);
		System.out.println("^^^^^^^^^^^^^^^^^^^");*/
		
		// 1. append a and b
		a= a.concat(b);   // a = hellowSelenium
		b= a.replace(b, ""); // b= hellow
		a= a.replace(b, "");
		System.out.println(a);
		System.out.println(b);
		
		
	
		
		

	}

}
