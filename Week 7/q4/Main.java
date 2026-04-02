public class Main{
    public static void Main(String[] args){
        Laptop lap1 = new Laptop("Acer",4, 1200); 
        Laptop lap2 = new Laptop("Asus",16, 2000);
        Laptop lap3 = new Laptop("Dell",10, 1700);
        
        if(lap1.ramSize > 8){
            System.out.println("Laptop 1");
            System.out.println("Brand: "+ lap1.brand + "\nRAM: "
                + lap1.ramSize + "\nPrice: " + lap1.price);
        }
        if(lap2.ramSize > 8){
            System.out.println("\nLaptop 2");
            System.out.println("Brand: "+ lap2.brand + "\nRAM: "
                + lap2.ramSize + "\nPrice: " + lap2.price);
        }
        if(lap3.ramSize > 8){
            System.out.println("\nLaptop 3");
            System.out.println("Brand: "+ lap3.brand + "\nRAM: "
                + lap3.ramSize + "\nPrice: " + lap3.price);
        }
    }
}