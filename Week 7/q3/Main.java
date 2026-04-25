public class Main{
    public static void main(String[] args){
        Employee emp1 = new Employee(1,"John Doe", 10000);
        Employee emp2 = new Employee(2,"Jake Paul",20000);
        Employee emp3 = new Employee(3,"Pauline Shaw", 7000);
        
        Employee highest = emp1;
      
        if(emp2.salary > highest.salary){
           highest = emp2;
            
        }
        if(emp3.salary  > highest.salary){
            highest = emp3;
        }
        
        System.out.println("Employee Details with Highest Salary:");
        System.out.println("Id: " + highest.id + "\nName:" + 
            highest.name +"\nSalary: $" + highest.salary);

    }
}