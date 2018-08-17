package testMain;

public class DuplicateString {

	public static void main(String[] args) {

		String s [] = {"shraddha", "suresh", "shraddha"};
		
		for (int i = 0; i <s.length; i++) {
			
		for (int j = i+1 ; j<s.length; j++) {
			
			if (s[i].equals(s[i])) {
				
				System.out.println("duplicate is ::" +s);
			}
		}
		}
			

	}

}
