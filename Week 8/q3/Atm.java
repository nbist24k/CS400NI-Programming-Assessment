public class Atm{
    public static void main(String[] args){
        
        BankAccount b1 =new BankAccount(1001,2000,"John"); 
        
        BankAccount b2 =new BankAccount(1002,10000,"Jane"); 
        
        
        // Bank accounts info before operations 
        b1.displayInfo();
        b2.displayInfo();
        
        //Deposit Operation
        System.out.println("*****************");
        System.out.println("Before depositing certain amount: ");
        System.out.println("B1 balance: " + b1.balance);
        System.out.println("B2 balance: " + b2.balance);
        
        System.out.println("After depositing 100$");
        b1.deposit(100);
        b2.deposit(100);
        
        System.out.println("B1 balance: " + b1.balance);
        System.out.println("B2 balance: " + b2.balance);
        
        System.out.println("*****************");
        System.out.println();
        //Withdraw Operation
        System.out.println("*****************");
        System.out.println("Withdraw Amount: ");
        System.out.println("Withdraw 2500 from b1");
        if(b1.withdraw(2500)){
            System.out.println("Show current balance: " 
            + b1.balance);
        }
        System.out.println();
        System.out.println("Withdraw 500 from b2"); 
        if(b2.withdraw(500)){
            System.out.println("Show current balance: " 
            + b2.balance);
        };
        System.out.println("*****************");
        System.out.println();
        
        // Balance Operation
        System.out.println("*****************");
        System.out.println("Show Balance: ");
        System.out.println("b1 current balance: " + b1.getBalance());
        System.out.println("b2 current balance: " + b2.getBalance());
        System.out.println("*****************");
        
        
        
        
         
        
        
    }
}