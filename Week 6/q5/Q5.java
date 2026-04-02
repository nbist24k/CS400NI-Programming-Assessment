import java.util.Scanner;


public class Q5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String[] districtNames = {"Morang","Kathmandu",
                                    "Kaski","Sindhuli"};
        
        for(int i = 0; i < districtNames.length; i++){
            System.out.println((i+1) + " " + districtNames[i]);
        }
        
        String newName;
        
        
        for(int i =0; i< districtNames.length;i++){
            System.out.println("Enter the new district name: ");
            newName = sc.nextLine();
            districtNames[i] = newName;
        }
        
        System.out.println("Updated district names: ");
        for(int i = 0; i < districtNames.length; i++){
            System.out.println((i+1) + " " + districtNames[i]);
        }
        
        
                                    
        sc.close();                                
        }
}