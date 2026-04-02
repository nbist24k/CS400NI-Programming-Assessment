import java.util.Scanner;
public class Lab1{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int marks;
        System.out.println("Enter the student marks: ");
        marks = sc.nextInt();
        
        if(marks >= 50){
            System.out.println("Passed");
        }
        else{
           System.out.println("Failed"); 
        }
        
        sc.close();
        
    }
}