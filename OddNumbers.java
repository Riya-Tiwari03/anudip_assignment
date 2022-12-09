package labtest;

public class OddNumbers {

	// the method below here finds the odd numbers between two  given integers
	static void findOddNumbers(int a, int b) {
		// checks for odd numbers between given integers
		for(int i  = a; i <= b; i++) {
			if(i % 2 != 0) {
				System.out.println(i);
			}
		}
	}
	
	
	// this method below is the main function to call for the function to find odd numbers
	public static void main(String[] args) {
		
		System.out.println("Odd numbers between 1 and 20 are as follows: ");
		// calling the method to find off numbers
		findOddNumbers(1, 20);
	}
	
}
