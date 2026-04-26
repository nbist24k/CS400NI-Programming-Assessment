public class Doctor extends Person{
    String specialization;
    double consulationFee;
    
    Doctor(int id, String name, double baseSalary, String specialization,
            double fee){
         super(id,name,baseSalary);
         this.specialization = specialization;
         this.consulationFee = fee;
    }
    
    //Override calculateSalary()
    @Override
    public double calculateSalary(){
        return super.calculateSalary() + this.consulationFee;
    }
    
    // Overloaded method
    public double calculateSalary(int emergencyCases){
        return this.calculateSalary() + (500 * emergencyCases);
    }
    
    @Override
    public String toString(){
        return "Doctor{" + super.toString() + ", specialization=" 
                + this.specialization + ", salary=" + this.calculateSalary() + "}";
    }
}