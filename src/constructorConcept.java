
public class constructorConcept {
	
	/*//constructor means - is  class entity to define some class features while creating the object.
	so while crating the object if you want to define some class features in form of global variables or
	objects, in that case we use constructor.
	> constructor look like a function but it is not a function 
	> constructor can not return any value S
	> constructor name should be class name
	if you want to create a constructor of any class - write public and class name (we dont write any return type )
	** we can overload the constructor **
	* >> how to call constructor - moment you create object of class, constructor will be called 
	*
*/
	
	
	public constructorConcept () { // zero parameter constructor 
	System.out.println("zero parameter");
	}
	
	public constructorConcept (int i) {
		System.out.println("single parameter - i");
	}
	
	public constructorConcept ( int i, int j) {
		System.err.println("two parameters");
	}
	
	
	public static void main(String[] args) {
	
		// create object of class
		/*constructorConcept obj = new constructorConcept () ; //calling zero parameter constructor
		constructorConcept obj1 = new constructorConcept (2); //calling single parameter constructor
		constructorConcept obj2 = new constructorConcept (2,4); //calling two parameter constructor
		*/

	}

}
