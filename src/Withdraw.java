public class Withdraw implements Transaction {
    private final Bank bank;

    Withdraw(Bank bank) {
        this.bank = bank;
    }

    @Override
    public void execute(double amount) {
        bank.withdraw(amount);
    }
}
