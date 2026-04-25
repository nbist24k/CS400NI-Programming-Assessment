public class Employee{
    int employeeId;
    String name;
    double basicSalary;
    
    Employee(int id, String name, double salary){
        this.employeeId = id;
        this.name = name;
        this.basicSalary = salary;
    }
    
    double calculateBonus(){
        return 0.1 * this.basicSalary;
    }
    
    void displayEmployee(){
        System.out.println("Employee Details");
        System.out.println("Id: " + this.employeeId);
        System.out.println("Name: "  + this.name);
        System.out.println("Salary: $"+ this.basicSalary);
        System.out.println("***************************");
        System.out.println();
    }
}