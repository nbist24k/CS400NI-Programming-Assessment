public class SavingsAccount extends Account{
    
    SavingsAccount(int accNum, String name, double balance){
        super(accNum,name,balance);
    }
    
    //Override 
    @Override
    public double calculateInterest(){
        return super.calculateInterest() + (this.getBalance() * 0.08); // 8% interest
    }
    
    //Overloaded method
    public double calculateInterest(double rate){
        return (this.getBalance() * rate) / 100; // custom interest
    }
    
    @Override
    public String toString(){
        return "Savings{" + super.toString() + 
            ", Interest Rate: " + this.calculateInterest() + "}";
    }
    
    
    
    
    
}