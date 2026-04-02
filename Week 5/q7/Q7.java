import java.util.Scanner;

public class Q7{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        boolean isTrue = true;
        
        char choice;
        
        double a, b;
        
        while(isTrue){
            System.out.print("Enter the first number: ");
            a = sc.nextDouble();
          
            System.out.print("Enter the second number: ");
            b = sc.nextDouble();
            System.out.println();
            
            System.out.print("Enter the choices (+,-,*,/) To exit(Just type anythin) : ");
            choice = sc.next().charAt(0);
            
            switch (choice){
                case '+' -> System.out.println("Sum: " + (a+b));
                case '-' -> System.out.println("Subtraction: " + (a-b));
                case '*' -> System.out.println("Multiplication: "+ (a*b));
                case '/' -> System.out.println("Division: " + (a /b));
                default -> {
                    System.exit(0);
                    sc.close();
                }
            }
            
            
        }
        
    }
}