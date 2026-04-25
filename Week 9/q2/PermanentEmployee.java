public class PermanentEmployee extends Employee{
    double houseRentAllowance, dearnessAllowance;
    
    PermanentEmployee(int id, String name, double salary,
                        double hra, double da){
        super(id,name,salary);
        this.houseRentAllowance = hra;
        this.dearnessAllowance = da;
    }
    
    double calculateTotalSalary(){
        double total = super.basicSalary + this.houseRentAllowance +
                        this.dearnessAllowance + super.calculateBonus();
        
        return total;
    }
    
}