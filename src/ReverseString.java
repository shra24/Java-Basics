
public class ReverseString {

	public static void main(String[] args) {
		
		String s = "selenium" ;
		// get length of  this string 
		int len = s.length();  // start from zero index  - length is 8
	    //  using  for loop  - we have to reverse the string then we have start index from 7
		
		// above the for loop , maintain one  blank reverse variable to store the reverse string 
		
		String rev  = " " ;
		
		for (int i=len-1 ; i>=0 ; i--) {
		
		//	s.charAt(i) ;  // use one method  charAt() - this gives the character available on every index
			
		// and then append this with rev string 
			
			rev = rev+ s.charAt(i); // 0+m = m
			
		}  // now out of the for loop  print the rev   // dont print inside  the for loop
		
		System.out.println(rev);
			
		
		// using StringBuffer class - it is java class 
		
		// create object of StringBuffer class  and pass String s 
		
		StringBuffer sf = new StringBuffer (s);
		
		// in StringBuffer - reverse function is available coz it is mutable class   
		// in string class dont have reverse function but stringBuffer has a reverse function 
		
		System.out.println(sf.reverse());
	
		
		
		

	}

}
