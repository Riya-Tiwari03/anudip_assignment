package labtest;
import java.util.*;
public class Operations {

	// below is a method to perform the operation selected by the user
	static void operations(int a, int b, int number){
		float ans = 0f;
		switch(number) {
		
		// performs addition
		case 1: ans = a + b;
				System.out.println(ans);
				break;
				
		// performs substraction		
		case 2: ans = a - b;
				System.out.println(ans);
				break;
				
		// performs multiplication
		case 3: ans = a * b;
				System.out.println(ans);
				break;
		
		//performs division
		case 4: ans = a / b;
				System.out.println(ans);
				break;
				
		// performs modulo operation		
		case 5: ans = a % b;
				System.out.println(ans);
				break;
		}
	}
	
	// main function which is used to take user input and call the operations method
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// choosing which operation to be performed
		System.out.println("Enter the option of operation you want to perform: ");
		System.out.println("1. +");
		System.out.println("2. -");
		System.out.println("3. *");
		System.out.println("4. /");
		System.out.println("5. %");
		int num = sc.nextInt();
		
		// entering first number
		System.out.println("Enter the first number: ");
		int a = sc.nextInt();
		// entering second number
		System.out.println("Enter the second number");
		int b = sc.nextInt();
		// sends the output
		System.out.println("The output of the operation is: ");
		operations(a, b, num);
	}

}
