import java.util.Iterator;
import java.util.LinkedList;



public class linkedList {

	public static void main(String[] args) {
	// linkedList is a class. Now i wanted to store String value in linkedList class, create object of linkedList class
		
		LinkedList <String> ll = new LinkedList <String> () ;
		
		//add 
		
		ll.add("Shraddha");
		ll.add("Avneesh");
		ll.add("Trupti");
		
		// print 
		
		System.out.println("content of linkedlist ::" +ll); // content of linkedlist ::[Shraddha, Avneesh, Trupti]
        
		//addfirst
		
		ll.addFirst("Rane");
		
		//addlast
		
		ll.addLast("Suresh");
				
		System.out.println("content of linkedList::"+ll); // content of linkedList::[Rane, Shraddha, Avneesh, Trupti, Suresh]
	 
		//get
		System.out.println(ll.get(0)); //rane
		System.out.println(ll.get(2)); // avneesh
		System.out.println(ll.get(3)); //trupti
		System.out.println(ll.get(4)); //suresh
		
		//set
		System.out.println(ll.set(0, "selenium"));
		System.out.println(ll.set(2, "java"));
		System.out.println(ll.set(3, "C@"));
		
		System.out.println("content  of  linkedlist ::" +ll);  //content  of  linkedlist ::[selenium, Shraddha, java, C@, Suresh]
		
	   //remove
		ll.removeFirst();
		ll.removeLast();
		System.out.println(ll); //[Shraddha, java, C@]
		
		//Q- what are different ways of printing all values of linkedlist
		
	 // print all values of linkedlist - using for loop, advance for loop, iterator, while loop
		
		for (int i=0; i<ll.size (); i++) {
			System.out.println(ll.get(i)); //shraddha java C@
		}
		
		// advance for loop
		for  (String str : ll) {
			System.out.println(str);
		}
	  // using iterator
		
		//  put iterator on ll object  - ll.iterator()  
		// and this iterator will return one iterator reference, so store it some iterator reference and this is String type of reference
		 
		Iterator <String> it = ll.iterator() ;
		
		// use hasNext() method  -means in this iterator if next value is available then print it
		
		while (it.hasNext ()) {
			System.out.println(it.next());
			
		}
		
		//while loop
		
		int num = 0 ;
		while (num < ll.size());
		num++ ;
	}

}
