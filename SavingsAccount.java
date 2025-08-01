public class SavingsAccount extends Account1 {
    private String cardNumber;
    private String duration;

    public SavingsAccount(int id, double balance, double annualInterestRate, String cardNumber, String duration) {
        super(id, balance, annualInterestRate);
        this.cardNumber = cardNumber;
        this.duration = duration;
    }

    public double getCreditBalance() {
        return getBalance() * 3;
    }

    @Override
    public void withdraw(double amount) {
        if (amount <= getBalance()) {
            setBalance(getBalance() - amount);
        } else {
            System.out.println("Cannot withdraw more than the balance.");
        }
    }

    @Override
    public void deposit(double amount) {
        if (amount > 10000) {
            amount += amount * 0.01; // 1% bonus
        }
        setBalance(getBalance() + amount);
    }


    public void display() {
        System.out.println("This is a Savings Account");
        System.out.println("Account ID: " + getId());
        System.out.println("Balance: $" + getBalance());
        System.out.println("Monthly Interest: $" + getMonthlyInterestAmount());
        System.out.println("Date Created: " + getDateCreated());
        System.out.println("Card Number: " + cardNumber);
        System.out.println("Card Expiry: " + duration);
        System.out.println("Credit Balance: $" + getCreditBalance());
    }
}
