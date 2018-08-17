
public class smalllestAndLartgestNo {

	public static void main(String[] args) {
	//create one arraylist
		int numbers[] = {-10, 5, 50, 43543, -323 } ;
//  create largest and smallest integer variables 
		// and largest and lowest int will take the numbers from zero the position
		
	int largest = numbers[0];
	int smallest = numbers [0];
	
 // now to iterate numbers write for loop
	
	for (int i = 1; i<numbers.length; i++) {
		if (numbers[i]>largest) {
			largest = numbers[i];
		}
		
		else if (numbers[i]<smallest) {
			smallest = numbers [i];
		}
	}
	
	System.out.println("smallest number is::"+smallest);
	System.out.println("largest number is ::" +largest);
	
	
	}

}
