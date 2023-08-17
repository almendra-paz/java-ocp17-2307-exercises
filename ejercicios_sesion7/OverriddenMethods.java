public class OverriddenMethods{
	public static void main(String args[]){
		Account a = new DummyAccount(100.00);
		a.printBalance();
	}
}
class Account{
	double balance = 0.0;
	Account(double balance){
		this.balance = balance;
		//this.printBalance();
	}	
	void printBalance(String message){
		System.out.println("OKOK");
	}

	public void printBalance(){
		System.out.println("balance account");
	}
}
class DummyAccount extends Account{

	DummyAccount(double b){
		super(b);
	}	
	public void printBalance(){
		System.out.println("DummyAccount balance");
	}

	public void printBalance(int suma){
		System.out.println("No Suma");
	}
}