public class Person{
    
    private int id;
    private String name;
    private double baseSalary;
    
    Person(int id, String name,double salary){
        this.id = id;
        this.name = name;
        this.baseSalary = salary;
    }
    
    //Getters
    public int getId(){
        return this.id;
    }
    
    public String getName(){
        return this.name;
    }
    
    public double getBaseSalary(){
        return this.baseSalary;
    }
    
    //Setters
    public void setId(int id){
        this.id = id;
    }
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setBaseSalary(double salary){
        this.baseSalary = salary;
    }
    
    public double calculateSalary(){
       return this.getBaseSalary(); 
    }
    
    //Override toString()
    @Override
    public String toString(){
        return "id=" + id + ", name=" + name;
    }
    
    
    
}