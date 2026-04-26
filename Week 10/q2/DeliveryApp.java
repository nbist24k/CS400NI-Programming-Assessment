public class DeliveryApp{
    
    public static void main(String[] args){
        
        BikeDelivery b1 = new BikeDelivery(1001,"John",40,3);
        CarDelivery c1 = new CarDelivery(1002,"Jane",60,10);
        
        //Display details
        System.out.println(b1);
        System.out.println("Bike Payment: $" + b1.calculatePayment());
        System.out.println("Bike Payment (extra): $" + b1.calculatePayment(5));
        System.out.println();
        
        System.out.println(c1);
        System.out.println("Car Payment: $" + c1.calculatePayment());
        System.out.println("Car Payment (extra): $" + c1.calculatePayment(3));
        
        
    }
    
    
    
}