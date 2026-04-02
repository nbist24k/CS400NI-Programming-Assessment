import java.util.Scanner;

public class Q9{
    public static void main(String[] args){
       Scanner sc = new Scanner(System.in);
       
       int num,reversedNum=0;
       System.out.print("Enter a positive integer: ");
       num = sc.nextInt();
       
       
       
       while(num != 0){
           reversedNum= reversedNum * 10 + (num%10);
           num/=10;
       }
       
       System.out.println("Reversed Number: " + reversedNum);
       
       sc.close();
    }
}