public class BankAccount{
    
    int accountNumber;
    double balance;
    String name;
    
    
    BankAccount(int accNum, double bal, String name){
        this.accountNumber = accNum;
        this.balance = bal;
        this.name = name;
    }
    
    
    double getBalance(){
        return this.balance;
    }
    
    void deposit(double amount){
        this.balance +=amount;
    }
    
    boolean withdraw(double amount){
        if (amount <=0 || amount > balance){
            System.out.println("Amount invalid");
            return false;
        }
        
        balance -=amount;
        
        return true;
    }
    
    void displayInfo(){
        System.out.println("*****************");
        System.out.println("Account Details: ");
        System.out.println("Account Number: " + this.accountNumber);
        System.out.println("Name: " + this.name);
        System.out.println("Current Balance: " + this.balance);   
        System.out.println("*****************");
        System.out.println();
    }
    
}