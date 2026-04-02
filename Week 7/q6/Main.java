public class Main{
    public static void Main(String[] args){
        Result r1 = new Result(65.75,78.55,85.95);
        Result r2 = new Result(89.91,91.25,95.5);
        
        // First Result
        double firstResultMarks = r1.totalMarks();
        double firstResultPercentage = r1.totalPercentage();
        System.out.println("First Result");
        r1.displayResult();
        
         // Second Result
        double secondResultMarks = r2.totalMarks();
        double secondResultPercentage = r2.totalPercentage();
         System.out.println("\nSecond Result");
        r2.displayResult();
        
    }
}