import java.util.Scanner;

public class Q4{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        int[] studentScores={10, 20, 30, 40, 50};
        
        int sum=0;
        double average=0.0;
        
        
        for(int i =0; i<studentScores.length;i++){
            System.out.println(studentScores[i]);
        }
        
        for(int i =0; i<studentScores.length;i++){
            sum+=studentScores[i];
        }
        
        System.out.println("Sum of all numbers: " + sum);
        
        average = sum / studentScores.length;
        
        System.out.println("Average of all numbers: " + average);
        
        
        System.out.println("Dyanmic Part: ");
        
        int [] dynamicScores = new int[5];
        int newScore;
        
        for(int i = 0; i < dynamicScores.length;i++){
            System.out.println("Enter the new score: ");
            newScore = sc.nextInt();
            dynamicScores[i] = newScore;
        }
        
        int max = dynamicScores[0];
        int min = dynamicScores[0];
        
        
        
         for(int i =0; i<dynamicScores.length;i++){
            if (dynamicScores[i] > max){
                max = dynamicScores[i];
            }
            if (dynamicScores[i] < min){
                min = dynamicScores[i];
            }
        }
        
        System.out.println("Max score: " + max);
        System.out.println("Min score: " + min);
    
        System.out.println("Updated Scores: ");
        for(int i =0; i<dynamicScores.length;i++){
            System.out.println(dynamicScores[i]);
        }
        
        sc.close();
        
        
        
        
    }
}