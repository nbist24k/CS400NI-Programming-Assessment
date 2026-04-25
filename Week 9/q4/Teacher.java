public class Teacher extends Person{
    String subject;
    double bonus;
    
    Teacher(int id, String name, double salary, String collegeName,String subject,
            double bonus){
        super(id,name,salary,collegeName);
        this.subject = subject;
        this.bonus = bonus;
    }
    
    @Override
    double calculateAnnualSalary(){
        return super.calculateAnnualSalary() + this.bonus;
    }
}