public class Car extends Vehicle{
    int numberOfDoors;
    String fuelType;
    
    Car(int vehicleId, String brand, 
        double basePrice,int numOfDoors, String fuelType){
            super(vehicleId,brand,basePrice);
            this.numberOfDoors = numOfDoors;
            this.fuelType = fuelType;
        }
        
    void displayVehicleInfo(){
        super.displayVehicleInfo();
        System.out.println("Number of doors: " + this.numberOfDoors);
        System.out.println("Fuel Type: " + this.fuelType);
        System.out.println("****************************");
        System.out.println();
    }
    

    double calculateFinalPrice(){
        return super.basePrice + 
            super.calculateTax() +(0.05 * super.basePrice);
    }
    

}