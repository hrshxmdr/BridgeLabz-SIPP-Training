class Q1_BankAccount {
    String accountHolder;
    long accountNumber;
    double balance;

    Q1_BankAccount (String accountHolder, long accountNumber) {
        this.accountHolder = accountHolder;
        this.accountNumber = accountNumber;
        this.balance = 0;
    }

    void deposit(double amount) {
        balance += amount;
    }

    void withdraw(double amount) {
        if (balance >= amount) {
            balance -= amount;
        } else {
            System.out.println("Insufficient balance");
        }
    }

    void displayBalance() {
        System.out.println("Account Holder: " + accountHolder + ", Balance: " + balance);
    }

    public static void main(String[] args) {
        Q1_BankAccount  acc = new Q1_BankAccount ("Alice", 9876543210L);
        acc.deposit(1000);
        acc.withdraw(500);
        acc.displayBalance();
    }
}