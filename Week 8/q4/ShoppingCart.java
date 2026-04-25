public class ShoppingCart{
    String itemName;
    double itemPrice;
    int quantity;
    
    ShoppingCart(String name, double price, int quantity){
        this.itemName = name;
        this.itemPrice = price;
        this.quantity = quantity;
    }
    
    
    double calculateTotal(){
        return this.itemPrice * this.quantity;
    }
    
    double calculatedDiscountedTotal(double discountPercent){
        return this.calculateTotal() - 
            (discountPercent * 0.01 * this.calculateTotal());
    }
    
    void displayCart(){
        System.out.println("****************************");
        System.out.println("Item: " + this.itemName);
        System.out.println("Price: $" + this.itemPrice);
        System.out.println("Quanity: " +this.quantity);
        System.out.println("****************************");
        System.out.println();
    }
    
    
    
}