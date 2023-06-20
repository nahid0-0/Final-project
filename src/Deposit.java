public class Deposit implements Transaction {
    private final Bank bank;

    Deposit(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void execute(double amount) {
        bank.deposit(amount);
    }
}
