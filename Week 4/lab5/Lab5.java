import java.util.Scanner;

public class Lab5{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int num;
      
      System.out.print("Enter the number: ");
      num = sc.nextInt();
      
      if(num % 3 == 0){
          if (num % 5 == 0){
               System.out.println("Number is divisible by 3 and 5.");
          }
          else{
            System.out.println("Number is not divisible by both 3 and 5.");
          }   
      }

      else{
          System.out.println("Number is not divisible by both 3 and 5.");
      }
      
      
      sc.close();
    }
}