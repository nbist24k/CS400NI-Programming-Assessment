public class Result{
    // Marks of three subjects
    double subject1, subject2,subject3;
    
    Result(double s1, double s2, double s3){
        this.subject1 = s1;
        this.subject2 = s2;
        this.subject3 = s3;
    }
    
    public double totalMarks(){
        return this.subject1 + this.subject2 + this.subject3;
    }
    
    public double totalPercentage(){
        return (this.totalMarks()/300) * 100;
    }
    
    public void displayResult(){
        System.out.printf("Total Marks: %.2f\n",this.totalMarks());
        System.out.printf("Total Percentage: %.2f\n",this.totalPercentage());
    }
}