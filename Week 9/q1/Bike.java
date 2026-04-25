public class Bike extends Vehicle{
    int engineCapacity;
    
    
    Bike(int vehicleId, String brand, 
        double basePrice,int capacity){
            super(vehicleId,brand,basePrice);
            this.engineCapacity = capacity;
        }
        
    void displayVehicleInfo(){
        super.displayVehicleInfo();
        System.out.println("Engine Capacity: " + this.engineCapacity +" CC");
        System.out.println("****************************");
        System.out.println();
    }
    
    double calculateFinalPrice(){
        return super.basePrice + 
            super.calculateTax();
    }
    

}