public class Patient{
    String patientName;
    int age;
    int  daysAdmitted;
    double dailyCharge;
    
    Patient(String name, int age, int days, double charge){
        this.patientName = name;
        this.age = age;
        this.daysAdmitted = days;
        this.dailyCharge = charge;
    }

    double calculateTotalBill(){
        double totalBill = this.daysAdmitted * this.dailyCharge;
        
        // 10% discount applied if the days 
        // admitted are greater than 7
        if(this.daysAdmitted > 7){
            totalBill -= 0.1*totalBill;
        }
        
        return totalBill;
    }
    
    
    void displayDetails(){
        System.out.println("****************************");
        System.out.println("Patient Details");
        System.out.println("Name: " + this.patientName);
        System.out.println("Age: " + this.age);
        System.out.println("Admitted Days: " + this.daysAdmitted);
        System.out.println("Daily Charge: " + this.dailyCharge);
        System.out.println("Total Bill: " + this.calculateTotalBill());
        System.out.println("****************************");
        System.out.println();
    }
    
    
    
    
}