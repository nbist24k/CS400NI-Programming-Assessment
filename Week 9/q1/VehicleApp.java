public class VehicleApp{
    public static void main(String[] args){
        Car car1 = new Car(1001,"BMW",28999.99,2,"Petrol");
        Bike bike1 = new Bike(1002,"Harley Davidson",
                    45000.99,1200);
                    
        
        // Display vehicle info
        car1.displayVehicleInfo();
        bike1.displayVehicleInfo();
        
        // Calculate Tax
        System.out.printf("Tax on %s: $%.2f\n", car1.brand,car1.calculateTax());
        System.out.printf("Tax on %s: $%.2f\n",bike1.brand,bike1.calculateTax());
        System.out.println("****************************\n");
        
        //Final Price of vehicles
        System.out.println("Final Prices of:");
        System.out.printf("%s: $%.2f\n",car1.brand, car1.calculateFinalPrice());
        System.out.printf("%s: $%.2f\n",bike1.brand, bike1.calculateFinalPrice());
        System.out.println("****************************\n"); 
        
    }
}