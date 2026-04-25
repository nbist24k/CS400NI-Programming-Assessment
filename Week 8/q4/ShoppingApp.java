public class ShoppingApp{
    public static void main(String[] args){
        ShoppingCart cart1 = new ShoppingCart("Chocolate",12.99, 25);
        ShoppingCart cart2 = new ShoppingCart("Potato Chip", 8.99, 10);
        
        
        // Display Cart Details
        
        cart1.displayCart();
        cart2.displayCart();
        
        // Calculate total price
        System.out.println("****************************");
        System.out.println("Total Price of each items: ");
        System.out.println("Cart1: " + cart1.calculateTotal());
        System.out.println("Cart2: " + cart2.calculateTotal());
        System.out.println("****************************");
        System.out.println();
        
        //Calculate Discounted Total Price
        System.out.println("****************************");
        System.out.println("Total price after 20% discount for each items: ");
        System.out.println("Cart1: " + cart1.calculatedDiscountedTotal(20));
        System.out.println("Cart2: " + cart2.calculatedDiscountedTotal(20));
        System.out.println("****************************");
    }
}