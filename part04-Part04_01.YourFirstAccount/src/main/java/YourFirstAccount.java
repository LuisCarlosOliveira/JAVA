
public class YourFirstAccount {

    public static void main(String[] args) {
        Account testAccount = new Account("Arto's acocount", 100);
        
        System.out.println("Initial state");
        System.out.println(testAccount);
        
        testAccount.deposit(20);
        
        
        System.out.println("End state");
        System.out.println(testAccount);
    }
}
