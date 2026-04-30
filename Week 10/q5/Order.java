public class Order{
    private int orderId;
    private String customerName;
    private double amount;
    
    
    Order(int id, String name, double amount){
        this.orderId = id;
        this.customerName = name;
        this.amount = amount;
    }
    
    
    //Getters
    public double getOrderId(){
        return this.orderId;
    }
    
    public String getCustomerName(){
        return this.customerName;
    }
    
    public double getAmount(){
        return this.amount;
    }
    
    //Setters;
    public void setOrderId(int id){
        this.orderId = id;
    }
    
    public void setCustomerName(String name){
        this.customerName = name;
    }
    
    public void setAmount(double amount){
        this.amount = amount;
    }
    
    public double calculateFinalAmount(){
        return this.getAmount();
    }
    
    @Override
    public String toString(){
        return "Order ID: " + this.orderId + ", Name: " + this.customerName +
                ", Amount: $" + this.amount;
    }    
    
}