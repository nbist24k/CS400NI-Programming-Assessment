public class  CurrentAccount extends Account{
    
    CurrentAccount(int accNum, String name, double balance){
        super(accNum,name,balance);
    }
    
    //Override 
    @Override
    public double calculateInterest(){
        return super.calculateInterest() + (this.getBalance() * 0.03); // 3% interest
    }
    
    //Overloaded method
    public double calculateInterest(double rate){
        return (this.getBalance() * rate) / 100; // custom interest
    }
    
    @Override
    public String toString(){
        return "Current{" + super.toString() + 
            ", Interest Rate: " + this.calculateInterest() + "}";
    }
    
    
    
    
    
}