public class ScienceStudent extends Student{
    
    ScienceStudent(int rollNum, String name, double marks){
        super(rollNum,name,marks);
    }
    
    @Override
    public String calculateResult(){
        return "Science: " +  super.calculateResult();
    }
    
    //Overloaded method
    public String calculateResult(int graceMarks){
        return (this.getMarks() + graceMarks) >= 43 ? "Passed with Grace" : "Fail";
    }
    
}