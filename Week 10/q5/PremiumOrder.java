public class PremiumOrder extends Order{
     
    
    PremiumOrder(int id, String name, double amount){
       super(id,name,amount);
    }
    
    //Override (5% tax 5% premium charge)
    @Override
    public double calculateFinalAmount(){
        return super.calculateFinalAmount() + (this.getAmount() * 0.05) +
                (this.getAmount() * 0.05);
    }
    
    //Overloaded method
    public double calculateFinalAmount(double discountAmount){
        return this.calculateFinalAmount() - discountAmount;
    }
    
    @Override
    public String toString(){
        return "Premium{" + super.toString() + 
            ", Final Amount: $" +  this.calculateFinalAmount() + "}";
    }
    
}