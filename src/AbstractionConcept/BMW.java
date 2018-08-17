package AbstractionConcept;

// now its BMW's responsibility to call all methods available in Car interface
// mouse over on BMW and click on all unimplemented methods - all car interface's methods will get added here
//can not create object of abstract class
//can not create object of interface
public class BMW implements  Car {

	@Override
	public void start() {
		
		System.out.println("BMW -- start");
	}

	@Override
	public void stop() {
	System.out.println("BMW ====  stop");
		
	}

	@Override
	public void refuel() {
		System.out.println("refuel====BMW");
		
	} 

	
	





}














