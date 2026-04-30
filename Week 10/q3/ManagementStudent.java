public class ManagementStudent extends Student{
    
    ManagementStudent(int rollNum, String name, double marks){
        super(rollNum,name,marks);
    }
    
    @Override
    public String calculateResult(){
        return "Management: " +  super.calculateResult();
    }
    
    //Overloaded method
    public String calculateResult(int graceMarks){
        return (this.getMarks() + graceMarks) >= 45 ? "Passed with Grace" : "Fail";
    }
    
}