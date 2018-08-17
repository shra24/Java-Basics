package AbstractionConcept;

/*public class Bank { >> this is normal class but if you want define this class as abstract class, then 
you have to use one keyword abstract
But there is  rule - whenever you want to define abstract class, inside the abstract class atleast one method should
be there which is abstract in nature.
abstract method means - only prototype - only method declaration, no method body 
Advantage abstract class is - you can have multiple abstract methods and non abstract methods but one 
abstract is compulsory 

 */

public abstract class Bank {
	
	// define some variables
	
	int amt = 100 ; // non static variable
	final int rate =10 ; // final variable
	static int loanrate = 5 ; // static variable
	
	public abstract void loan ();  // abstract method -- no method body

	 public void credit () { // this is non abstract method as it is having method body and no abstract keyword is writtern
		 System.out.println("Bank ...credit");
	 }
	 
	 public void debit () {  // non abstract method
		 System.out.println("debit....bank");
	 }
}
 // create one more class - HDFCBank