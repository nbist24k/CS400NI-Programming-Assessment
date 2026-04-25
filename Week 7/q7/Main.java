public class Main{
    public static void main(String[] args){
        BankAccount b1 = new BankAccount(1,"John Doe", 2000);
        
        BankAccount b2 = new BankAccount(2,"Jane Doe", 3000);
        
        
        // Show initial balances
        b1.showBalance();
        b2.showBalance();

        // Perform transactions
        b1.deposit(500);
        b1.withdraw(300);

        b2.deposit(1000);
        b2.withdraw(500);

        // Show final balances
        b1.showBalance();
        b2.showBalance();
    }
}