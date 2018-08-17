
public class missingNumber {

	public static void main(String[] args) {
	// i have one integer array in sequence 1-5, let see number 3 is  missing 
		
		int a[] = {1,2,4,5};
	// now how to find missing number 
		// do total of 1-5 numbers = 1+2+3+4+5 = 15
     // do total  of numbers present in array int a - > 1+2+4+5 = 12
		//now subtract 15 - 12 = 3 ; 3 is missing number 
	// use for loop 
	// first maintain one variable sum =0
		
		int sum = 0;
		for (int i =1; i<a.length ; i ++) { // get all numbers present in array 
			sum = sum + a[i] ; // 12
		}
		
		System.out.println(sum);
	
	// now again define one sum variable sum1 =0
		
		int sum1 = 0 ;
		for (int j = 1 ; j <=5 ; j++) { // get all numbers between 1- 5
			
			sum1 = sum1+j ;
		}
		System.out.println(sum1);
		
		System.out.println("missing number is  " + (sum1-sum));	
		
	}

}
