//real example for class and object
public class Account {
	int acc_no;
	String name;
	float amount;
	public void insert(int a,String n,float amt) {
		acc_no = a;
		name = n;
		amount = amt;
	}
	public void Deposit(float amt) {
		amount = amount +amt; 
		System.out.println(amt +" deposited");
	}
	public void Withdrawal(float amt) {
		if(amount<amt)
			System.out.println("bal is insufficient");
		else
			amount= amount-amt;
			System.out.println(amt + " withdrawn" );    
	}
	public void Checkbalance() {
		System.out.println("bal is " +amount);
	}
	public void Display() {
		System.out.println(acc_no + " " + name + " " +amount);
	}
	

	public static void main(String[] args) {
		Account a = new Account();
		a.insert(4343, "kalai", 1000);
		a.Display();
		a.Checkbalance();
		
		a.Deposit(25000);
		a.Checkbalance();
		a.Withdrawal(1000);
		a.Checkbalance();

	}

}
