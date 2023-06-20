public class BankApp {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter your name & ID to access your bank account:");
        String name = s.nextLine();
        String id = s.nextLine();
        BankAcc obj1 = new BankAcc(name, id);
        obj1.runMenu();
    }
}
