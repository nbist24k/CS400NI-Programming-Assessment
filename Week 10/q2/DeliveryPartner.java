public class DeliveryPartner{
    
    private int partnerId;
    private String name;
    private double basePay;
    
    DeliveryPartner(int id,String name,double pay){
        this.partnerId = id;
        this.name = name;
        this.basePay = pay;
    }
    
    //Getters
    public int getPartnerId(){
        return this.partnerId;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getBasePay(){
        return this.basePay;
    }
    
    //Setters
    public void setPartnerId(int id){
        this.partnerId = id;
    }
    
    
    public void setName(String name){
         this.name = name;
    }
    
    public void setBasePay(double pay){
        this.basePay = pay;
    }
    
    //Calculate Payment
    public double calculatePayment(){
        return this.getBasePay();
    }
    
    @Override
    public String toString(){
        return "Id=" + this.partnerId + ",Name=" + name + ",Base Pay="+
                this.basePay;
    }
    
    
}