package bank;

public class BankAccount {
	
	double previousTrans;
	double balance;
	String userName;
	int customerID;
	
	public BankAccount(String userName, int customerID) {
		this.userName = userName;
		this.customerID = customerID;
	}

	void deposit(double amount) {
		balance += amount ;
		previousTrans = amount;
			}
	
	void withdraw(double amnt) {
	    if (balance >= amnt) {
	        balance -= amnt;
	    } else {
	        System.out.println("Insufficient funds");
			
		}
	}
		void getPreviousTrans() {
			if (previousTrans > 0) {
				System.out.println("Deposited " + previousTrans);
			}
				else if(previousTrans < 0) {
					System.out.println("Withdrew" + previousTrans);
				}
					else {
						System.out.println("No transaction occured");
					}
		
				}
}