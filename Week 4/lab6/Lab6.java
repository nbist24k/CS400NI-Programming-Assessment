import java.util.Scanner;

public class Lab6{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      double markPrice;
      char category;
      double sellingPrice=0.0;
      
      System.out.print("Enter the markPrice: ");
      markPrice= sc.nextDouble();
      sc.nextLine();
      
    
      
      if(markPrice <= 0.0){
        System.out.println("Please enter the correct value for marked price");  
      }
      else{
          System.out.print("Enter the category: ");
          category = sc.next().toUpperCase().charAt(0);
          
          if(category == 'A'){
              sellingPrice = markPrice - (markPrice * 0.6);
          }
    
          else if (category == 'B'){
              sellingPrice = markPrice - (markPrice * 0.4);
          }
          else if(category == 'C'){
              sellingPrice = markPrice - (markPrice * 0.2);
          }
          else if(category == 'D'){
              sellingPrice = markPrice - (markPrice * 0.1);
          }
          else{
              System.out.println("Please enter the correct category.");
          }
          
          if(sellingPrice != 0.0){
              System.out.println("The selling price of " + category + " is: " 
              + sellingPrice);
          }
          
      }
      
      
      
    
      
      
      sc.close();
    }
}