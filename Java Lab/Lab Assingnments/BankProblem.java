public class BankProblem {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("John Doe", 0.0); // Create a new BankAccount object
        account.deposit(1000); 
        account.withdraw(50); 
    }
}

class BankAccount {
    private String accountHolderName;
    private double balance;

    public BankAccount(String accountHolderName, double balance) {
        this.accountHolderName = accountHolderName;
        this.balance = balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        }
        System.out.println("Current balance in the account: " + balance);
    }

    public void withdraw(double amount) {
        if (balance < amount) {
            System.out.println("Insufficient funds in the account");
            return;
        } else {
            balance -= amount;
        }
        System.out.println("Current balance is: " + balance);
    }
}