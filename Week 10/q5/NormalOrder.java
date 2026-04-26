public class NormalOrder extends Order{
    
    NormalOrder(int id, String name, double amount){
       super(id,name,amount);
    }
    
    //Override (13% tax)
    @Override
    public double calculateFinalAmount(){
        return super.calculateFinalAmount() + (this.getAmount() * 0.13);
    }
    
    //Overloaded method
    public double calculateFinalAmount(double discountAmount){
        return this.calculateFinalAmount() - discountAmount;
    }
    
    @Override
    public String toString(){
        return "Normal{" + super.toString() + 
            ", Final Amount: $" +  this.calculateFinalAmount() + "}";
    }
    
}