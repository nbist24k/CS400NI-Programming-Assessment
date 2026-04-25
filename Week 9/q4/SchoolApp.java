public class SchoolApp{
    public static void main(String[] args){
        
        Teacher t1 = new Teacher(1001,"John",30000,"Seneca College","Math",10000);
        
        Staff s1 = new Staff(1002,"Robert","Seneca College",300,25);
        
        //Teacher salary
        System.out.println("Teacher Annual Salary: " + t1.calculateAnnualSalary());
        
        //Staff salary
        System.out.println("Staff Salary: " + s1.calculateSalary());
        
        //Satic College Name
        System.out.println("College Name: " + Person.collegeName);
        
        
        
        
    }
}