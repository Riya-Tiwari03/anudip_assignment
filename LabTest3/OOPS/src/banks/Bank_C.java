package banks;

public class Bank_C extends Bank {

	int balance;
	Bank_C(int b){
		this.balance = b;
	}
	@Override
	int getBalance() {
		return balance;
	}

}
