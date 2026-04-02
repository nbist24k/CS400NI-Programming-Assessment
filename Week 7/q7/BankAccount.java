public class BankAccount{
    int accountNumber;
    String name;
    double balance;
    
    
    
    BankAccount(int accNum, String name, double bal){
        this.accountNumber = accNum;
        this.name = name;
        this.balance = bal;
       
    }
    
    public void deposit(double money){
        balance += money;
       System.out.println("Deposited to " + name + " " + money);
    }
    
     public void withdraw(double money){
     if (money > balance) {
            System.out.println("Insufficient balance!");
        } else {
            balance -= money;
            System.out.println("Withdrawn from " + name + " " + money);
        }
      
        
    }
    
    public void showBalance() {
        System.out.println("-------------------------");
        System.out.println("Account Holder: " + name);
        System.out.println("Account Number: " + accountNumber);
        System.out.println("Balance: " + balance);
        System.out.println("-------------------------");
    }
}