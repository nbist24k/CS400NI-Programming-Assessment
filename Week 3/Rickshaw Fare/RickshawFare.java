import java.util.Scanner;

public class RickshawFare{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Fare components
        double baseFare = 50.0; // Base fare
        double perKmCharge = 20.0; //Charge per km
        double perMinCharge = 3.0; // Charge per min
        
        System.out.print("Enter distance(in km): ");
        double distance = sc.nextDouble();
        
        System.out.print("Enter time(in min): ");
        double time = sc.nextDouble();
        
        System.out.print("Is the customer local (true/false)?: ");
        boolean isLocal = sc.nextBoolean();
        
        System.out.print("Is the trave during the night (true/false)?: ");
        boolean isNight = sc.nextBoolean();
        
        // Calculating fare
        double totalFare = baseFare + (distance * perKmCharge) + (time * perMinCharge);
        
        // Applying discounts for locals on long distances (>10 KM) (DISCOUNT: 10%)
        double discounts = (isLocal && (distance > 10.00)) ? totalFare * 0.10 : 0.00;
        
        // Applying surcharge for the night travel (SURCHARGE: 15%)
        double surcharge = (isNight) ? totalFare * 0.15 : 0.00;
        
        // Final fare
        double finalFare = totalFare - discounts + surcharge;
        
        System.out.println("Final Fare: Rs." + (int)(finalFare));
        
        sc.close();
    }
}