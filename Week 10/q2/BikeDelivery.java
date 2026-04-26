public class BikeDelivery extends DeliveryPartner{
    
    double incentivePerOrder;
    

    BikeDelivery(int id,String name,double pay,double incentivePerOrder){
        super(id,name,pay);
        this.incentivePerOrder = incentivePerOrder;
    }
    
    //Override calculatePayment()
    @Override
    public double calculatePayment(){
        return super.calculatePayment() + this.incentivePerOrder;
    }
    
    //Overloaded method
    public double calculatePayment(int extraOrders){
        return this.calculatePayment() + (this.incentivePerOrder * extraOrders);
    }
    
    @Override
    public String toString(){
        return "BikeDelivery{" + super.toString() + ",payment=$"+ 
                this.calculatePayment() + "}";
    }
    
    
}