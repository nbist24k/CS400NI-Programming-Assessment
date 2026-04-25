public class ElectricityBill{
    
    String consumerName;
    int unitsConsumed;
    
    public static final int DEFAULT_UNIT_PRICE = 5;
    public static final int REST_UNIT_PRICE = 8;
    
    
    ElectricityBill(String name,int units){
        this.consumerName = name;
        this.unitsConsumed = units;
    }
    
    double calculateBill(){
        if(this.unitsConsumed <=100){
            return this.unitsConsumed * DEFAULT_UNIT_PRICE;
        }
        
        // WHEN UNIT EXCEEDS 100
        return 100 * DEFAULT_UNIT_PRICE + 
            (this.unitsConsumed-100) * REST_UNIT_PRICE;
    }
    
    void displayBill(){
        System.out.println("******************************");
        System.out.println("Bill Details");
        System.out.println("Name: " + this.consumerName);
        System.out.println("Total units consumed: " + 
                    this.unitsConsumed);
        System.out.println("Total Bill: " + this.calculateBill());
        System.out.println("******************************");
        System.out.println();
                    
    }
    
    
    
}