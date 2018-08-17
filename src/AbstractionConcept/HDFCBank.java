package AbstractionConcept;

/*HDFCBank class should be child of BankClass - use extends keyword
 * whenever you are inheriting any abstract class -means HDFCBank class is child of BankClass
 * and BankClass is Abstract in nature and BankClass has one abstract method = loan method.
 * now its HDFCBank class' resposiblity to define that abstract method in its own body and here loan 
 * method will have its own body. all abstract methods need to be define.
 * and other methods no need to define , directly you can inherit from Bank.javaclass
 * Now, to test these feature, create new class - TestBank
 * 
 * Abstraction means -to hide some implementation logic , and this define by respective child class =  
 * */

public class HDFCBank extends Bank {

	public void loan () {
		System.out.println("HDFC...LOAN Method"); //this is load method which is going to override from abstract BankClass. but HDFC will have own features inside this method 
	}
}
