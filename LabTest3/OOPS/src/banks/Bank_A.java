package banks;

public class Bank_A extends Bank {
	int balance;
	Bank_A(int b){
		this.balance = b;
	}
	@Override
	int getBalance() {
		return balance;
	}

}
