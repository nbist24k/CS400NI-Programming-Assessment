public class ContractEmployee extends Employee{
    int workingDays;
    
    ContractEmployee(int id, String name, double salary,
                        int days){
        super(id,name,salary);
        this.workingDays = days;
    }
    
    double calculateTotalSalary(){
        double total = super.basicSalary * this.workingDays;
        
        return total;
    }
    
}