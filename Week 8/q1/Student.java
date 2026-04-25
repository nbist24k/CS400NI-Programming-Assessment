public class Student{
    int id;
    String name;
    String address;
    long phoneNumber;
    static String collegeName;
    
    Student (int id, String name, String address,
            long phoneNumber, String collegeName){
    
            this.id = id;
            this.name = name;
            this.address = address;
            this.phoneNumber = phoneNumber;
            Student.collegeName = collegeName;
    }
    
    
    void displayInfo(){
        System.out.println("*******************");  
        System.out.println("Student Details: "); 
        System.out.println("ID :" + this.id);
        System.out.println("Name :" + this.name);
        System.out.println("Address :" + this.address);
        System.out.println("Phone Number :" + this.phoneNumber);
        System.out.println("College Name :" + collegeName);
        System.out.println("*******************");
    }
    
    
}