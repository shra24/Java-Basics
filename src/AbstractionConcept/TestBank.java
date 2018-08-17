package AbstractionConcept;

public class TestBank {

	public static void main(String[] args) {
	 // create object of HDFCBank
		
		HDFCBank hb = new HDFCBank () ;
		
		hb.credit(); // i can access methods of Bank Class
        hb.debit();
        hb.loan();
        
        
      /*  
        // dynamic polimorphism
        create object of HDFCBank without any reference , but this object can be referred by 
        BankClass interface
        through dynamic polymorphism , we can call all overriden methods and inheritance methods
        *
        *
        */
        
        Bank b = new HDFCBank () ;
        
        b.loan();
        b.debit();
        b.credit();
	
	
	
	}

}
