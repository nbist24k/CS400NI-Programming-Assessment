public class Employee{
    double basicSalary;
    
    Employee(double salary){
        this.basicSalary = salary;
    }
    
    double calculateGrossSalary(){
        double grossSalary = 0;
        grossSalary = this.basicSalary + 0.2 * this.basicSalary;
        return grossSalary;
    }
    
    
    
    
}