package testMain;

public class RemoveSpecialChar {

	public static void main(String[] args) {

		
		String s = ("@#@#$#$^  shraddha rane 4543 ^(*&(&*") ;
		
		
		String rep = s.replaceAll("[^a-zA-Z0-9]", " ");
		
		System.out.println(rep);
		
		
	}	


}