import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Account1[] accounts = new Account1[4];

        for (int i = 0; i < 4; i++) {
            System.out.println("Press (1) for creating a Checking Account");
            System.out.println("Press (2) for creating a Savings Account");
            int choice = sc.nextInt();

            if (choice == 1) {
                accounts[i] = new CheckingAccount(100 + i, 5000, 4.5, 1000, 500);
                accounts[i].deposit(1000);
                accounts[i].withdraw(600);
            } else if (choice == 2) {
                accounts[i] = new SavingsAccount(200 + i, 15000, 4.5, "1234567890123456", "2 years");
                accounts[i].deposit(12000);
                accounts[i].withdraw(3000);
            } else {
                System.out.println("Invalid Choice");
                i--;
            }
        }

        System.out.println("\n--- Account Details ---");
        for (Account1 acc : accounts) {
            acc.display();
            System.out.println("------------------------");
        }

        sc.close();
    }
}