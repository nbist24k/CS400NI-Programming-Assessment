public class HospitalTest{
    public static void main(String[] args){
        
        Patient p1 = new Patient("John Doe", 35, 15, 25.5);
        Patient p2 = new Patient("Jane Doe", 66, 4, 18.5);
        
        p1.displayDetails();
        p2.displayDetails();
    }
}