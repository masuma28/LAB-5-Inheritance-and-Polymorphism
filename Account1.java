
            import java.util.Date;

            public abstract class Account1 {
                private int id = 0;
                private double balance = 0.0;
                private double annualInterestRate = 0.0;
                private Date dateCreated;

                public Account1() {
                    dateCreated = new Date();
                }

                public Account1(int id, double balance, double annualInterestRate) {
                    this.id = id;
                    this.balance = balance;
                    this.annualInterestRate = annualInterestRate;
                    dateCreated = new Date();
                }

                public int getId() {
                    return id;
                }

                public void setId(int id) {
                    this.id = id;
                }

                public double getBalance() {
                    return balance;
                }

                public void setBalance(double balance) {
                    this.balance = balance;
                }

                public double getAnnualInterestRate() {
                    return annualInterestRate;
                }

                public void setAnnualInterestRate(double annualInterestRate) {
                    this.annualInterestRate = annualInterestRate;
                }

                public Date getDateCreated() {
                    return dateCreated;
                }

                public double getMonthlyInterestRate() {
                    return annualInterestRate / 12;
                }

                public double getMonthlyInterestAmount() {
                    return balance * getMonthlyInterestRate() / 100;
                }

                public abstract void withdraw(double amount);

                public abstract void deposit(double amount);

                public void display() {
                }
            }

