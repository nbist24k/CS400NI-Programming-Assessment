public  class Vehicle{
    int vehicleId;
    String brand;
    double basePrice;
    
    Vehicle(int vehicleId, String brand, double basePrice){
        this.vehicleId = vehicleId;
        this.brand = brand;
        this.basePrice = basePrice;
    }
    
    void displayVehicleInfo(){
        System.out.println("Vehicle Details");
        System.out.println("ID: " + this.vehicleId);
        System.out.println("Brand: " + this.brand);
        System.out.println("Base Price: $" + this.basePrice);
    }
    
    double calculateTax(){
        return 0.1 * basePrice;
    }
      
}