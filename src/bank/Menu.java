package bank;
import java.util.Scanner;

public class Menu extends BankAccount {

    public Menu(String userName, int customerID) {
        super(userName, customerID);
    }

    public void menu() {
    	char option = 0;
    	Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome, " + userName);
        System.out.println("Your ID: " + customerID);
        System.out.println("\n");
        System.out.println("a) Check Balance");
        System.out.println("b) Deposit Amount");
        System.out.println("c) Withdraw Amount");
        System.out.println("d) Previous Transaction");
        System.out.println("e) Exit");
        
        do {
        	 System.out.println("********************************************");
             System.out.println("Choose an option");
             option=scnr.next().charAt(0);
             System.out.println("\n");
             
             switch(option) {
             
             case 'a':
            	 System.out.println("......................");
            	 System.out.println("Balance = " + balance);
            	 System.out.println("\n");
            	break;
            	
             case 'b':
            	 System.out.println("......................"); 
            	 System.out.println("Enter amount to deposit");
            	 System.out.println("......................");
            	 double amount = scnr.nextDouble();
            	 deposit(amount);
            	 System.out.println("\n");
            	 break;
            	 
             case 'c':
            	 System.out.println("......................");
            	 System.out.println("Enter amount to withdraw");
            	 System.out.println("......................");
            	 double amnt = scnr.nextDouble();
            	 withdraw(amnt);
            	 System.out.println("\n");
            	 break;
            	 
             case 'd':
            	 System.out.println("......................");
            	 System.out.println("previous transaction: ");
            	 getPreviousTrans();
            	 System.out.println("......................");
                 System.out.println("\n");
                 break;
                 
             case 'e':
            	 System.out.println("......................");
            	 break;
            	 
           }
        }while(option != 'e');
        
        System.out.println("Thank you for using our banking services") ;
    }


    public static void main(String[] args) {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Welcome to TYM bank!");

        System.out.println("Enter your full name: ");
        String userName = scnr.nextLine();
        int customerID = 0;

        while (customerID != 34324332) {
            System.out.println("Enter your customer ID: ");
            customerID = scnr.nextInt();
            
            if (!userName.equals("Shpetim Gashi") || customerID != 34324332) {
                System.out.println("You have entered an incorrect ID, please try again: ");
            } else {
                Menu obj1 = new Menu(userName, customerID);
                obj1.menu();
            }
        }
    }
}