public class BankApp{
    public static void main(String[] args){
        SavingAccount savAcc = new SavingAccount(1001,"Nirajan", 3000,13);
        
        CurrentAccount currAcc = new CurrentAccount(1002,"John",5000,2000);
        
        // Saving Account
        savAcc.deposit(300);
        System.out.println("Saving Balance: $" + savAcc.getBalance());
        System.out.println("Interest: $" + savAcc.calculateInterest());
        System.out.println("*****************************");
        
        //Current Account
        currAcc.deposit(700);
        currAcc.withdraw(6000); // works due to overdraft limit
        currAcc.withdraw(2000); // exceeds the limit
        
        System.out.println("Current Balance: $"+currAcc.getBalance());
        
        
    }
}