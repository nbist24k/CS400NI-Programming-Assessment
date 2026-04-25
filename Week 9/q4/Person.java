public class Person{  
    int id;
    String name;
    double basicSalary;
    static String collegeName;
    
    Person(int id, String name, double salary, String collegeName){   
        this.id = id;
        this.name = name;
        this.basicSalary = salary;
        Person.collegeName = collegeName;
    }
    
    double calculateAnnualSalary(){
        return this.basicSalary * 12;
    }
    
    
    
}