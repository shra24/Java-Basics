
public class reverseInteger {

	public static void main(String[] args) {
		
		//1 st solution  = 
		
		int num = 123456; // we want reverse of num - 654321
		// now declare one reverse variable with zero value so that we can append/add the reverse number to this variable
		
		int rev = 0 ;
		
		// create while loop and declare num variable  should not be zero
		// means , start the loop from num is not equal to zero and end the loop when num is equal to zero 
		
		
		while (num != 0) {
			rev = rev*10 + num% 10 ;
			num = num/10;
			
   }
		System.out.println("reverse no. is " +rev);
		

	
	//2 using StringBuffer method 
		
		/*create new string buffer object and have to pass String variable but we have int variable hence use one method
		String.valueoff();  and we use reverse function and print it --this is one line code
	
	*/
	
		
		long num1 = 98765 ;
			
		System.out.println(new StringBuffer(String.valueOf(num1)).reverse());
		
		
		
	}

}
