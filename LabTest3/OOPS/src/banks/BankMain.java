package banks;

public class BankMain {
	public static void main() {
		Bank_A b1 = new Bank_A(1000);
		Bank_B b2 = new Bank_B(1500);
		Bank_C b3 = new Bank_C(2000);
		
		b1.getBalance();
		b2.getBalance();
		b3.getBalance();
	}

}
