
public class swapInt {

	public static void main(String[] args) {
		
		int x = 17 ;
		int y =  70 ;
		
		//  1 using third variable 
		
		//int t ;
		
	/*	t = x ; // t is 17
		x = y ;  //  x is 70
		y = t ; // y is 17 
*/		
		// 2. without using third variable - using + operator
		
	/*	x = x+y; // value of x is 87 (17+70)
		y = x-y; // value of y is 17 (87-70)
		x= x-y;  // value of x is 70 (87-17)
*/		
		
	/*	//3. using * operator
		x = x*y ; 
		y = x/y ;
		x= x/y;*/
		
		//4. using Xor ^ operator  bit wise
		
		x= x^y ;
		y = x^y ; 
		x= x^y ;
			
		System.out.println(x);
		System.out.println(y);
		
		

	}

}
