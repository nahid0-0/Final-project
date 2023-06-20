public class Bank {
    private double bal;
    private double prevTrans;

    void deposit(double amount) {
        if (amount > 0) {
            bal += amount;
            prevTrans = amount;
        } else {
            System.out.println("Invalid amount. Transaction amount must be positive.");
        }
    }

    void withdraw(double amount) {
        if (amount > 0 && bal >= amount) {
            bal -= amount;
            prevTrans = -amount;
        } else if (amount > 0 && bal < amount) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Invalid amount. Withdrawal amount must be positive.");
        }
    }

    void getPrevTrans() {
        if (prevTrans > 0) {
            System.out.println("Deposited: " + prevTrans);
        } else if (prevTrans < 0) {
            System.out.println("Withdrawn: " + Math.abs(prevTrans));
        } else {
            System.out.println("No transaction occurred");
        }
    }

    double getBalance() {
        return bal;
    }

    void transfer(double amount, String recipientId) {
        if (amount > 0 && bal >= amount) {
            bal -= amount;
            prevTrans = -amount;
            System.out.println("Transferred " + amount + " to recipient with ID: " + recipientId);
        } else if (amount > 0 && bal < amount) {
            System.out.println("Insufficient balance");
        } else {
            System.out.println("Invalid amount. Transfer amount must be positive.");
        }
    }
}
