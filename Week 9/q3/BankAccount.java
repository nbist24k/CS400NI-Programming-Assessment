public class BankAccount{
    int accountNumber;
    String accountHolderName;
    double balance;
    
    BankAccount(int accNum, String name,double balance){
        this.accountNumber = accNum;
        this.accountHolderName = name;
        this.balance = balance;
    }
    
    void deposit(double amount){
        if(amount > 0){
            this.balance +=amount;
            System.out.println("Deposited: $" + amount);
        }
    }
    
    double getBalance(){
        return this.balance;
    }
    
    
}