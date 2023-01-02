package Exceptions;

public class InvalidMailIDException {
public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			// declare the email variable
			String Email;
			// taking the user input
			System.out.print("Enter an Email : ");
			Email = sc.nextLine();
			try {
				if(Pattern.matches("^[A-Za-z0-9+_.-]+@[A-Za-z0-9.-]+$",Email )) {
					System.out.println("Email is Correct : "+Email);
				}else {
					throw new MailIdException("Email is not Correct : "+Email);
				}
			}catch(MailIdException e) {
				System.out.println(e.getMessage());
			}
			

		}
}
