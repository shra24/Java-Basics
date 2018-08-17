
public class finalisedConcept {
	
	
	public void finalize() {
		System.out.println("finalize method");
	}

	public static void main(String[] args) {
		
		// create two objects
		
		finalisedConcept f1 = new finalisedConcept () ;
		
		finalisedConcept f2 = new finalisedConcept ();
		
		// in java memory, there are two objects , reffred by f1 and f2
		
		f1 = null;
		f2 = null;  // 	now there are two blank objects are available, there is no reference , nobody is 
		// refering these objects . now suppose there are 1000 blank objects are available in java memory
		//  there is concept called 'garbej collector - garbej collector will distoy all the blank
		// objects to free some space in memory - how to call garbej collector ->System.gc() ;
		
		System.gc();
		
		/*purpose of finalize is  - just befor the garbej collector, automatically finalize method is called,
		just to clean up processing of object 
		
		finalize is method
		finally is block
		final is keyword*/
		
		System.out.println(f1);
		System.out.println(f2);
		
		
		

	}

}
