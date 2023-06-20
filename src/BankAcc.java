import java.util.Scanner;
public class BankAcc {
    private final String name;
    private final String id;
    private final Bank bank;

    BankAcc(String name, String id) {
        this.name = name;
        this.id = id;
        this.bank = new Bank();
    }

    void runMenu() {
        char option = ' ';
        Scanner s = new Scanner(System.in);
        System.out.println("Welcome " + name);
        System.out.println("Your ID: " + id);
        System.out.println();

        while (option != 'e') {
            System.out.println("************");
            System.out.println("Choose an option:");
            System.out.println("a) Check Balance");
            System.out.println("b) Deposit Amount");
            System.out.println("c) Withdraw Amount");
            System.out.println("d) Previous Transaction");
            System.out.println("e) Exit");
            System.out.println("************");

            System.out.print("Enter your choice: ");
            option = s.next().charAt(0);
            System.out.println();

            switch (option) {
                case 'a':
                    System.out.println("Balance: " + bank.getBalance());
                    break;
                case 'b':
                    System.out.print("Enter amount to deposit: ");
                    double depositAmount = s.nextDouble();
                    executeTransaction(new Deposit(bank), depositAmount);
                    break;
                case 'c':
                    System.out.print("Enter amount to withdraw: ");
                    double withdrawAmount = s.nextDouble();
                    executeTransaction(new Withdraw(bank), withdrawAmount);
                    break;
                case 'd':
                    System.out.println("Previous Transaction:");
                    bank.getPrevTrans();
                    break;
                case 'e':
                    System.out.println("Thank you for using our banking services!");
                    break;
                case 'f':
                    System.out.print("Enter amount to transfer: ");
                    double transferAmount = s.nextDouble();
                    System.out.print("Enter recipient's ID: ");
                    String recipientId = s.next();
                    executeTransaction(new Transfer(bank, recipientId), transferAmount);
                    break;
                default:
                    System.out.println("Invalid choice. Please select a valid option.");
                    break;
            }
            System.out.println();
        }
    }

    void executeTransaction(Transaction transaction, double amount) {
        transaction.execute(amount);
    }
}
