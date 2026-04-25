public class CurrentAccount extends BankAccount{
    
    double overDraftLimit;
    
    CurrentAccount(int accNum, String name, double balance,double overDraftLimit){
        super(accNum, name, balance);
        this.overDraftLimit = overDraftLimit;
    }
    
    
    boolean withdraw(double amount){
        if(amount <=(super.getBalance() + this.overDraftLimit)){
            this.balance -= amount;
            System.out.println("Withdrawn: $" + amount);
            return true;
        }
        else{
            System.out.println("Withdrawal denied due to overdraft limit!");
            return false;
        }
    }
    
    
}