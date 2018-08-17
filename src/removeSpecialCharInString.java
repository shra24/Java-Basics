
public class removeSpecialCharInString {

	public static void main(String[] args) {
		
		//how would you remove special characters in String 
		
		String s = "$$latin string 980989088" ;
		
		String s1 =  "32645647   !@#!@#!@#$^%$ shraddha AVNEESH  truPTI 90809890 8908 " ;
		
		String s2 = "@@@####$$ selenium ###### java $$$$$$$	TESTNG";
		
		// for this we are using - Regular Expression and Regular Expression write in square bracket
		//> in string we want all alphabets - small and capital letters
		//>in sting we want all numbers from 0-9
		// hence we write  -- > > [a-zA-Z0-9]
		// apart from this everything remove from the string    ==>> for not use ^
		// hence we write --->> [^a-zA-Z0-9]
	// now use one method --->> replaceAll
		
		s.replaceAll("[^a-zA-Z0-9]", ""); //  " "  -- >> replace with nothing 
		
		System.out.println(s);
		
		s1.replaceAll("[^a-zA-Z]", "");
		
		System.out.println(s1);

		s2.replaceAll("[^a-zA-Z0-9]","" );
		System.out.println(s2);
	}

}
