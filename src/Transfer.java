public class Transfer implements Transaction {
    private final Bank bank;
    private final String recipientId;

    Transfer(Bank bank, String recipientId) {
        this.bank = bank;
        this.recipientId = recipientId;
    }

    @Override
    public void execute(double amount) {
        bank.transfer(amount, recipientId);
    }
}
