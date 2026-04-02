import java.util.Scanner;

public class Lab9{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
       
        double gpa;
        char gradeScale;
        double gpaToGrade=0.0;
        boolean isEligible = false;
        
        System.out.print("Enter the GPA(0.0 - 4.0): ");
        gpa = sc.nextDouble();
        
        if(gpa < 0.0 ||  gpa > 4.0){
            System.out.println("Please enter the correct value for the gpa");
        }
        else{
            //gpaToGrade = gpa * GRADESCALE;
            
           // System.out.println("The grade is : " + gpaToGrade);
           
           if  (gpa >= 3.7){
                gradeScale = 'A';   
                isEligible = true;
           }
           else if (gpa > 3.0 || gpa < 3.7){
               gradeScale = 'B';
           }
           else if(gpa > 2.0 || gpa < 3.0){
               gradeScale= 'C';
           }
           
           else if(gpa > 1.0 || gpa < 2.0){
               gradeScale = 'D';
           }
           else {
               gradeScale = 'E';
           }
           
           
           System.out.println("The grade is: " + gradeScale);
           
           if(isEligible){
               System.out.println("You are eligible for scholarship");
           }
           
        }
                
        
        sc.close();
    }
}