public class ExamApp{
    public static void main(String[] args){
        ScienceStudent s1 = new ScienceStudent(12,"John",38);
        ManagementStudent m1 = new ManagementStudent(14,"Jane",43);
        
        
        //Display details
        System.out.println(s1);
        System.out.println(s1.calculateResult());
        System.out.println("Science Result (Grace): " + s1.calculateResult(5));
        System.out.println();
        
        System.out.println(m1);
        System.out.println(m1.calculateResult());
        System.out.println("Management Result (Grace): " + m1.calculateResult(5));
    }
}