package labtest;
import java.util.*;
public class GreatestNumber {
	
	static void greatestNumber(int a, int b, int c) {
		if(a > b) {
			if(a > c) {
				System.out.println(a);
			}
			else {
				System.out.println(c);
			}
		}
		else {
			if(b > c) {
				System.out.println(b);
			}
			else {
				System.out.println(c);
			}
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int x = sc.nextInt();
		System.out.println("Enter second number: ");
		int y = sc.nextInt();
		System.out.println("Enter third number: ");
		int z = sc.nextInt();
		
		greatestNumber(x, y, z);
	}

}
