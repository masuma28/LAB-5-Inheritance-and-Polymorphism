public class CheckingAccount extends Account1 {
    private double overdraft;
    private double mindepo;

    public CheckingAccount(int id, double balance, double annualInterestRate, double overdraft, double mindepo) {
        super(id, balance, annualInterestRate);
        this.overdraft = overdraft;
        this.mindepo = mindepo;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance() + overdraft) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Withdrawal exceeds overdraft limit.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount >= mindepo) {
            setBalance(getBalance() + amount);
        } else {
            System.out.println("Deposit must be at least the minimum deposit amount.");
        }
    }

    @Override
    public void display() {
        System.out.println("This is a Checking Account");
        System.out.println("Account ID: " + getId());
        System.out.println("Balance: $" + getBalance());
        System.out.println("Monthly Interest: $" + getMonthlyInterestAmount());
        System.out.println("Date Created: " + getDateCreated());
    }
}