public class Staff extends Person{
    
    int workingHours;
    double ratePerHour;
    
    Staff(int id, String name, String collegeName, int workingHours,
            double ratePerHour){
        super(id,name,0,collegeName);
        this.workingHours = workingHours;
        this.ratePerHour = ratePerHour;
    }
    
    double calculateSalary(){
        return this.workingHours * this.ratePerHour;
    }
}