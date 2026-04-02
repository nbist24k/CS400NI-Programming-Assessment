import java.util.Scanner;

public class Lab7{
    public static void main(String[] args){
      Scanner sc = new Scanner(System.in);
      
      double markPrice;
      char category;
      double sellingPrice=0.0;
      
      System.out.print("Enter the markPrice: ");
      markPrice= sc.nextDouble();
      sc.nextLine();
      
      
      if(markPrice <=0.0){
         System.out.println("Please enter the correct value for marked price");  
      }
          else{
               System.out.print("Enter the category: ");
               category = sc.next().toUpperCase().charAt(0);
          
          switch (category){
              case 'A' -> sellingPrice = markPrice - (markPrice * 0.6);
              case 'B' -> sellingPrice = markPrice - (markPrice * 0.4);
              case 'C' -> sellingPrice = markPrice - (markPrice * 0.2);
              case 'D' -> sellingPrice = markPrice - (markPrice * 0.1);
              default ->  System.out.println("Please enter the correct category.");
          }
          
          
          if(sellingPrice != 0.0){
              System.out.println("The selling price of " + category + " is: " 
              + sellingPrice);
              }
            
            
     }
      
      sc.close();
    }
}