public class Account{
    private int accountNo;
    private String holderName;
    private double balance;
    
    Account(int accNum, String name, double balance){
        this.accountNo = accNum;
        this.holderName = name;
        this.balance = balance;
    }
    
    //Getters
    public int getAccountNo(){
        return this.accountNo;
    }
    
    public String getName(){
        return this.holderName;
    }
    
    public double getBalance(){
        return this.balance;
    }
    
    //Setters
    public void setAccountNo(int accNum){
        this.accountNo = accNum;
    }
    
    public void setName(String name){
        this.holderName = name;
    }
    
    public void setBalance(double balance){
        this.balance = balance;
    }
    
    // Default interest 0
    public double calculateInterest(){
        return 0;
    }
    
    @Override
    public String toString(){
        return "Account Number: " + this.accountNo + ", Holder Name: " + 
                this.holderName + ", Balance: " + this.balance;
    }
    
    
    
    
}