// Creating the BankSystem class to show the account details
import java.util.Scanner;

// BankAccount - superclass
abstract class BankAccount{
   
    // Attributes
    protected long accountNumber;
    protected int balance;

    // Constructor
    public BankAccount(long accountNumber, int balance){
         this.accountNumber = accountNumber;
         this.balance = balance;
   }

     public abstract void displayAccountType();

}

// SavingsAccount - subclass
class SavingsAccount extends BankAccount{
      
     protected double interestRate;

     // Constructor
     public SavingsAccount(long accountNumber, int balance, double interestRate){
         super(accountNumber, balance);
         this.interestRate = interestRate;
     }

     // Displaying account type
     public void displayAccountType(){
          System.out.println("This account is a savings account");
          System.out.println("Account Number: " + accountNumber);
          System.out.println("Balance:" + balance);
          System.out.println("Interest Rate: " + interestRate);
     }
}

// CheckingAccount - subclasss
class CheckingAccount extends BankAccount{
       
     protected int withdrawalLimit;
 
     // Constructor
     public CheckingAccount(long accountNumber, int balance, int withdrawalLimit){
          super(accountNumber, balance);
          this.withdrawalLimit = withdrawalLimit;
     }

     // Display account type
     public void displayAccountType(){
         System.out.println("Here we are checking the withdrawal Limit of account");
          System.out.println("Account Number: " + accountNumber);
          System.out.println("Balance:" + balance);
         System.out.println("Withdrawal Limit of this account is: " + withdrawalLimit +" rupees per day");
     }
}

// FixedDepositAccount - subclass
class FixedDepositAccount extends BankAccount{
  
    protected int duration;
   
   //Constructor
    public FixedDepositAccount(long accountNumber, int balance, int duration){
        super(accountNumber, balance);
        this.duration = duration;
    }
    
    // Display account type
    public void displayAccountType(){
        System.out.println("This account is a Fixed Deposit account");
         System.out.println("Account Number: " + accountNumber);
          System.out.println("Balance:" + balance);
        System.out.println("Duration of fixed deposit: " + duration);
    }
}

// BankSystem - Main class
public class BankSystem{
    public static void main(String[] args){
       Scanner scanner = new Scanner(System.in); // scanner class to get user's input

       System.out.print("Do you want to start this program: ");
       String space = scanner.nextLine();

       while(space.equals("true")){
           
           // Enter the type of account
           System.out.print("Enter the type of account you want(Savings Account, Checking account, FixedDeposit account or leave the program ");
           String type = scanner.nextLine().toLowerCase();

           if(type.equals("leave")){
              System.out.println("Leave the program");
              break;
           }

           // Getting common detals
           System.out.print("Bank Account: ");
           long accountNumber = scanner.nextLong();
           scanner.nextLine();

           System.out.print("Balance Present: ");
           int balance = scanner.nextInt();
           scanner.nextLine(); // consume new line

           BankAccount bankAccount = null; // Ensure initialization

           switch (type){
              
              case "savings account":
                  System.out.print("Interest Rate: ");
                  int interestRate = scanner.nextInt();
                  scanner.nextLine();
                  bankAccount = new SavingsAccount(accountNumber, balance, interestRate);
  
                  break;
              
               case "checking account":
                  System.out.print("Withdrawl Limit: ");
                  int withdrawlLimit = scanner.nextInt();
                  scanner.nextLine();
                  bankAccount = new CheckingAccount(accountNumber, balance, withdrawlLimit);
                  break;

               case "fixed deposit account":
                  System.out.print("Duration: ");
                  int duration = scanner.nextInt();
                  scanner.nextLine();
                  bankAccount = new FixedDepositAccount(accountNumber, balance, duration);
                  break;
           
               default:
                  System.out.print("Not valid account");
                  continue;
         }

         // Display account details
         System.out.println("\nAccount Details: ");
         bankAccount.displayAccountType();
         System.out.println();
     }

        System.out.print("Do you want to continue(true/false): ");
        space = scanner.nextLine().toLowerCase();
        scanner.close(); // close scanner at the end
}
}
   

// Input:
// Do you want to start this program: true
// Enter the type of account you want(Savings Account, Checking account, FixedDeposit account or leave the program Savings Account
// Bank Account: 3006040522110024
// Balance Present: 20000
// Interest Rate: 20

// Output:
// Account Details:
// This account is a savings account
// Account Number: 3006040522110024
// Balance:20000
// Interest Rate: 20.0

// Input:
// Enter the type of account you want(Savings Account, Checking account, FixedDeposit account or leave the program Checking Account
// Bank Account: 3006040522110024
// Balance Present: 30000
// Withdrawl Limit: 2000

// Output:
// Account Details:
// Here we are checking the withdrawal Limit of account
// Account Number: 3006040522110024
// Balance:30000
// Withdrawal Limit of this account is: 2000 rupees per day

// Input:
// Enter the type of account you want(Savings Account, Checking account, FixedDeposit account or leave the program Fixed Deposit Account
// Bank Account: 3006040522110024
// Balance Present: 40000
// Duration: 1

// Output:
// Account Details:
// This account is a Fixed Deposit account
// Account Number: 3006040522110024
// Balance:40000
// Duration of fixed deposit: 1

// Enter the type of account you want(Savings Account, Checking account, FixedDeposit account or leave the program leave
// Leave the program
// Do you want to continue(true/false): false
