import java.util.Scanner;

public class Lab3{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      int num;
      
      System.out.print("Enter the number: ");
      num = sc.nextInt();
      
      if( num == 0){
          System.out.println("Number is zero.");
      }
      else if(num < 0){
          System.out.println("Number  is negative.");
      }
      else{
          System.out.println("Number  is positive.");
      }
      
      
      sc.close();
    }
}