import java.util.Scanner;

public class Q3{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] names = {"Saroj", "Sushant",
        "Ujjwal", "Rabina", "Sandesh"};
        
        for(int i =0; i < names.length; i++){
            System.out.println(names[i]);
        }
        
        System.out.println("Name at index 2: " + names[2]);
        
        names[4] = "Amulya";
        
        System.out.println("Updatd name at index 4: " +  names[4]);
        
        String newName;
        
        System.out.println("Enter a new name: ");
        
        newName = sc.nextLine();
        
        names[0] = newName;
        
        System.out.println("Updated Array: ");
        for(int i =0; i < names.length; i++){
            System.out.println(names[i]);
        }
        
        
        
        
        
        
        sc.close();        
       
    }
}