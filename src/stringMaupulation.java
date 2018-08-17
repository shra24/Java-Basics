
public class stringMaupulation {

	public static void main(String[] args) {
	
	String str = "The rains have started here" ;
	String str1 = "The Rains have started here" ;
// String is collection of different characters and written in double quotes. 
//and first index is start from zero
	// find out the length of this string  >> .length
	System.out.println(str.length());
	
	// what character is present on 5 location or 5 index  - > charAt()
	System.out.println(str.charAt(5));

	// what is index of a  =  > .indexOf() 
	// in string space is also having its own index
	
	System.out.println(str.indexOf('h')); // 1st occurance
	// but if you want to know index of h - here  ==> .indexOf('char', from index));
	
	System.out.println(str.indexOf('h', str.indexOf('h')+1)); // 2nd occurance
	
	// get the index of perticular string - have
	
	System.out.println(str.indexOf("have"));
	
	// what is index of particular string which is not available in this string - then its returns -1
	
	System.out.println(str.indexOf("hellow"));  //-1  means this string is not available 
	
	//string comparison - check whether two strings are same or not  -- > .equals
	System.out.println(str.equals(str1)); // this is case sensitive
	
	// if you want to ignore the case sensitive  ==> .equalsIgnoreCase ()
	
	System.out.println(str.equalsIgnoreCase(str1));
	
	//subString --means a small string from this biggest string 
	// suppose you want to fetch rains  ==> .subString metho
	
	System.out.println(str.substring(3,8));
	
	// trim - this method will remove before space and after space
	
	String s ="        shraddha     rane         " ;
	
	System.out.println(s.trim());
	
	// replace method - 
	String date = "01-09-2000" ;
	
	System.out.println(date.replace("-", "/")); // old char to new char
	
	//split  method 
	
	String test = "Hello_World_Test_Selenium" ;  // spit this string
	
	 // test.split("_")   //  underscore will removed and save in string array variables 
	
	String testval [] = test.split("_") ;
	
	// now to print all values of testval , use for loop
	
	for (int i =0; i< testval.length; i ++) {
		
		System.out.println(testval [i]);
	}
	
	// Concatenation method
	
	String s2 = "care" ;
	System.out.println(s2.concat("A"));
	
	String x = "hello";
	String y = "Selenium" ;
	
	int a = 100;
	int b = 200;
	
System.out.println(x+y); // helloSelenium
System.out.println(a+b); // 300
System.out.println(x+y+a+b); //helloSelenium100200

			
	

	
		
	
		
		
		
		
		
		
		
		
		
		
		
	}

}
