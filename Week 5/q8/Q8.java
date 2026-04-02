import java.util.Scanner;

public class Q8{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int num;
        
        System.out.print("Enter the number: ");
        num = sc.nextInt();
        
        System.out.println("Multiplication table of " + num);
        
        for(int i = 1; i <=10; i++){
            System.out.println(num + " * " + i + " = " + (num * i));
        }
                
        
        sc.close();
    }
}