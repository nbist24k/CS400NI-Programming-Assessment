public class Main{
    public static void Main(String[] args){
        Employee emp1 = new Employee(1,"John Doe", 5000);
        Employee emp2 = new Employee(2,"Jake Paul",2000);
        Employee emp3 = new Employee(3,"Pauline Shaw", 7000);
        
        
        System.out.println("Employee Details with Highest Salary:");
        if(emp1.salary > emp2.salary && emp1.salary > emp3.salary){
           
            System.out.println("Id: " + emp1.id + "\nName:" + 
            emp1.name +"\nPrice:" + emp1.salary);
        }
        else if(emp2.salary  > emp3.salary){
            System.out.println("Id: " + emp2.id + "\nName:" + 
            emp2.name +"\nPrice:" + emp2.salary); 
        }
        else{
            System.out.println("Id: " + emp3.id + "\nName:" + 
            emp3.name +"\nPrice:" + emp3.salary); 
        } 

    }
}