import java.util.Scanner;
public class GradeEvaluations{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter the grade: ");
        int grade = sc.nextInt();
        
        String result = (grade >= 40) ? "Pass" : "Fail"; // Ternary operation
        
        System.out.println("Final Result:\t" + result);
        
        sc.close();
    }
}