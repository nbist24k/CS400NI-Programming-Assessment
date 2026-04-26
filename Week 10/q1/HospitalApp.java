public class HospitalApp{
    
    public static void main(String[] args){
        
        Doctor d1 = new Doctor(1001,"Dr.Smith", 65000, "Cardiology",10000);
        
        Nurse n1 = new Nurse(1002,"Jane", 45000,"Night",3000);
        
        //Display details
        System.out.println(d1);
        System.out.println("Doctor Salary: " + d1.calculateSalary());
        System.out.println("Doctor Emergency Salary: " + d1.calculateSalary(4));
        System.out.println();
        
        System.out.println(n1);
        System.out.println("Nurse salary: " + n1.calculateSalary());
        
        
        
    }
    
    
}