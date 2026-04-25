public class Main{
    public static void main(String[] args){
        Employee emp1 = new Employee(3500);
        Employee emp2 = new Employee(5000);
        
        System.out.println("Display basic salary:");
        System.out.println("Emp1 basic Salary: " + emp1.basicSalary);
        System.out.println("Emp2 basic Salary: " + emp2.basicSalary);
        System.out.println();
        
        System.out.println("Show Gross Salary:");
        System.out.println("Emp1 gross Salary: " + 
            emp1.calculateGrossSalary());
        System.out.println("Emp2 gross Salary: " +
            emp2.calculateGrossSalary());
        
        
    }
}