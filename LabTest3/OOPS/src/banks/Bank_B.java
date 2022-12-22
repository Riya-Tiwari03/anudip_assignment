package banks;

public class Bank_B extends Bank {

	int balance;
	Bank_B(int b){
		this.balance = b;
	}
	@Override
	int getBalance() {
		return balance;
	}

}
