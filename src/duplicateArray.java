import java.util.HashSet;
import java.util.Set;

public class duplicateArray {

	public static void main(String[] args) {
	
	//how to find duplicate string / duplicate integer in array 
		
		String names[] = {"Java", "C#", "JavaScript", "Python", "Java", "Ruby","Python" } ;
// so here is one to many mapping , compare each element 
		for (int i = 0 ; i<names.length ; i++) {
			for (int j = i+1; j<names.length; j++) { // this is one to many mapping
			
				if (names[i].equals(names[j])) {   // comparing both 
					
					System.out.println("duplicate element ::"   +names[i]);
				}
				
			}
		}
		
		// 2nd option is using HashSet - time complexity is  O(n) solution
/* HashSet is part of java collection and property of HastSet is it stores unique values
 * create one Set object and in this Set object we are going to save String.Set 
 * Set is an interface and HastSet is class available in JavaUtil
 * This HashSet is implementing Set interface 		
*/
		Set<String> store = new HashSet<String>();
		for (String name : names) {  // advance for loop - iterate from names
			if (store.add(name) == false) {
		}
		
		System.out.println("dublicate element is "+ name);
	}
	}
}
