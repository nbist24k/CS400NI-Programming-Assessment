public class Nurse extends Person{

    String shift;
    double extraAllowance;
    
    Nurse(int id, String name, double salary,String shift, double allowance){
        super(id,name,salary);
        this.shift = shift;
        this.extraAllowance = allowance;
    }
    
    //Override calculateSalary()
    @Override
    public double calculateSalary(){
        return super.calculateSalary() + this.extraAllowance;
    }
    
    
    @Override
    public String toString(){
        return "Nurse{" + super.toString() + ", shift="  + this.shift + ", salary="
                + this.calculateSalary() + "}";
    }
    
    
    
    
}