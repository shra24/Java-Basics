package AbstractionConcept;

public interface Car {
	
	
	
	public void start () ; // in interface method body is not allowed coz methods are abstract in nature
	public void stop ();    // only method declaration 
	public void refuel ();
		// these 3 are abstract methods - means we not going to define any business logic inside the methods
		//just blue print we have defined without implemetation of any logic
		//Now to implements these features / methods , create one class - BMW
	// BMW is child of Car interface then use implemetns keyword
		
		//at the interface level, we are not going to see any kind of implementation logic hence
	//this is called as 100% abstraction, just method prototype is define
	// in interface only final and static variables can defined
		
		

}
