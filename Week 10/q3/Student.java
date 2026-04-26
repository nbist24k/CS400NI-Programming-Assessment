public class Student{
    private int rollNo;
    String name;
    private double marks;
    
    Student(int rollNum, String name, double marks){
        this.rollNo = rollNum;
        this.name = name;
        this.marks = marks;
    }
    
    //Getters
    public int getRollNo(){
        return this.rollNo;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getMarks(){
        return this.marks;
    }
    
    
    //Setters
    public void setRollNo(int rollNo){
        this.rollNo = rollNo;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setMarks(double marks){
        this.marks = marks;
    }
    
    public String calculateResult(){
        return (this.getMarks() >= 40) ? "Passed" : "Failed";
    }
    
    @Override
    public String toString(){
        return "Roll Num: " + this.rollNo + ", Name: " + this.name +
                ", Marks: " +  this.marks + ", Result: " + this.calculateResult();
    }
    
    
    
}