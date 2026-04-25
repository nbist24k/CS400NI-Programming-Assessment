public class Payroll{
    public static void main(String[] args){
        PermanentEmployee permEmp1 = new PermanentEmployee(1001,"John Doe",
                                    15000,800,300);
        ContractEmployee conEmp1 = new ContractEmployee(1002,"Harry Smith",
                                    800,15);
        
        //Display employees info
        permEmp1.displayEmployee();
        conEmp1.displayEmployee();
        
        //display total salary
        System.out.println("Employees salary");
        System.out.printf("%s: $%.2f\n",permEmp1.name,permEmp1.calculateTotalSalary());
        System.out.printf("%s: $%.2f\n",conEmp1.name,conEmp1.calculateTotalSalary());
                                    
    }
}