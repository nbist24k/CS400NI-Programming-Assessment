public class SavingAccount extends BankAccount{
    
    double interestRate;
    
    SavingAccount(int accNum, String name, double balance,double interestRate){
        super(accNum, name, balance);
        this.interestRate = interestRate;
    }
    
    
    double calculateInterest(){
        double interest = (super.getBalance() *this.interestRate)/100;
        
        return interest;
    }
    
}