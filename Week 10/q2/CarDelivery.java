public class CarDelivery extends DeliveryPartner{
    
    double fuelAllowance;
    

    CarDelivery(int id,String name,double pay,double fuelAllowance){
        super(id,name,pay);
        this.fuelAllowance = fuelAllowance;
    }
    
    //Override calculatePayment()
    @Override
    public double calculatePayment(){
        return super.calculatePayment() + this.fuelAllowance;
    }
    
    //Overloaded method
    public double calculatePayment(int extraOrders){
        return this.calculatePayment() + (extraOrders * 100); // bonus per order
    }
    
    @Override
    public String toString(){
        return "CarDelivery{" + super.toString() + ",payment=$"+ 
                this.calculatePayment() + "}";
    }
    
    
}