// banking system
class Bankaccount {
    private String accountNumber;
    private double balance;

    public Bankaccount(String accountNumber, double initialBalance) {
        this.accountNumber = accountNumber;
        this.balance = initialBalance;
    }
    //setter 
    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }
    public void setBalance(double balance) {
              this.balance = balance;
       
    }
//getter 
    public double getBalance() {
        return balance;
    }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("what do you think you are doing? Deposit amount  must be in +  not in -. who created account for you?.so try again with a positive amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;

        } else {
            System.out.println("you dont have enough balance to withdraw or  you fool  trying with - number or o. can you give someone a negative amount? please try again with a positive amount and less than your balance.");
        }
    }
}
class SavingsAccount extends Bankaccount {
    private double interestRate;

    public SavingsAccount(String accountNumber, double initialBalance, double interestRate) {
        super(accountNumber, initialBalance);
        this.interestRate = interestRate;
    }

  public void addinterest() {
        double interest = getBalance() * interestRate / 100;
        deposit(interest);
        System.out.println("Interest added: " + interest);
    }
    @Override
    public void withdraw(double amount) {
        double balance = getBalance() -1000;
        if (amount > 0 && amount <= balance) {
            setBalance(getBalance() - amount);
            System.out.println("Withdrawal successful. New balance: " + getBalance() + " you cannot withdraw less than 1000 from your savings account.");
        } else {
            System.out.println("you dont have enough balance to withdraw  you can withdra this balance only "+ balance + " or  you fool  trying with - number or o. can you give someone a negative amount? please try again with a positive amount and less than your balance.");
        }
        }
    }


public class BankSystem {
    public static void main(String[] args) {
        Bankaccount account =new SavingsAccount("2568233242", 50000 , 5.6);
    account.deposit(500);
        System.out.println("Balance after deposit: " + account.getBalance());
        
        account.withdraw(300);
        System.out.println("Balance after withdrawal: " + account.getBalance());
        
        ((SavingsAccount) account).addinterest();
        System.out.println("Balance after interest added: " + account.getBalance());
        
        account.withdraw(1000); // This should fail due to the 1000 minimum balance rule   
}
}