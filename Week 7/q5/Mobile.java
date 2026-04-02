public class Mobile{
    String brand;
    int price;
    
    Mobile(String brand, int price){
        this.brand = brand;
        this.price = price;
    }
    
    public void isAffordable(){
        if(this.price < 20000){
            System.out.println(this.brand + " is affordable");
        }
        else{
            System.out.println(this.brand + " is not affordable");
        }
    }
}