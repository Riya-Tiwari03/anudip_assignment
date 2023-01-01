package strings;

import java.util.Scanner;

public class XClass {
	public static void main(String[] args) {
		
		System.out.println("Enter the string: ");
		
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		
		int n = s.length();
		
		char[] st = s.toCharArray();
		
		for(int i = 0; i < n-4; i++) {
			st[i] = 'X';
		}
		
		for(int i = 0; i < n; i++) {
			System.out.print(st[i]);
		}
		
	}
}
