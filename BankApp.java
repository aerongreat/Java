import java.util.Scanner;

public class BankApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of accounts: ");
        int numAccounts =scanner.nextInt();

        int[][] accounts = new int[numAccounts][2];

        for (int i = 0; i < numAccounts; i++) {
            System.out.print("Enter account number for account " + (i + 1) + ": ");
            accounts[i][0] = scanner.nextInt();
            System.out.print("Enter balance amount for account " + (i + 1) + ": ");
            accounts[i][1] = scanner.nextInt();
        }
        System.out.print("Enter account number to display balance: ");
        int accountNumber = scanner.nextInt();
        int balance = getBalance(accounts, accountNumber);
        if (balance != -1) {
       System.out.println("Account not found.");
        } else {
          System.out.println("Account Balance: " + balance);
        }

        scanner.close();
    }

    public static int getBalance(int[][] accounts, int accountNumber) {
        for (int i = 0; i < accounts.length; ) {
            if (accounts[i][0] == accountNumber) {
                return accounts[i][1];
            }
        }
        return -1;
    }
}