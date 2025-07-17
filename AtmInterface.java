import java.util.*;

class Bank{
    private double balance;
    public void deposit(double amt){
        if(amt < 100){
            System.out.println("Minimum deposit value must be rs.100.0");
            return;
        }else if(amt > 100 && balance == 0){
            balance = amt;
            System.out.println("Debited rs."+amt+" Successfully!");
        }else if(balance > 0) {
            balance += amt;
            System.out.println("Added rs." + amt + " to your balance");
        }
    }

    public void withDraw(double amt){
        if(balance == 0 || balance < amt){
            System.out.println("Insufficient Balance! Try again Later");
            return;
        }else if(balance > amt) {
            balance -= amt;
            System.out.println("Credited rs." + amt + " Successfully!");
            System.out.println("Remaining Balance: rs." + balance);
        }
    }

    public void displayBalance(){
        System.out.println("Available Balance: rs."+balance);
    }
}
public class AtmInterface {
    public static void main(String [] args){
        Bank b = new Bank();
        Scanner sc = new Scanner(System.in);
        System.out.println("********Welcome to ATM Interface********");
        while(true) {
            System.out.println("--Choose any of the option--");
            System.out.println("1. Deposit Amount");
            System.out.println("2. Withdraw Amount");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit Interface");
            System.out.println("Enter Here: ");
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Enter the Amount you want to Deposit:");
                    double amt = sc.nextDouble();
                    b.deposit(amt);
                    break;
                case 2:
                    System.out.println("Enter the Amount you want to withdraw: ");
                    double wdAmt = sc.nextDouble();
                    b.withDraw(wdAmt);
                    break;
                case 3:
                    b.displayBalance();
                    break;
                case 4:
                    System.out.println("Thank You! See You Again!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Option!Try Again!");
                    break;
            }
        }
    }
}
