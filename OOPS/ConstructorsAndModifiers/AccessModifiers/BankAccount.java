public class BankAccount {
    public int accountNumber;
    protected String accountHolder;
    private double balance;

    public BankAccount(int accNo, String holder, double balance) {
        this.accountNumber = accNo;
        this.accountHolder = holder;
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double bal) {
        this.balance = bal;
    }
}

class SavingsAccount extends BankAccount {
    public SavingsAccount(int accNo, String holder, double balance) {
        super(accNo, holder, balance);
    }

    public void showInfo() {
        System.out.println("Acc No: " + accountNumber + ", Holder: " + accountHolder);
    }
}
