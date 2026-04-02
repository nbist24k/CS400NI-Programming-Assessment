public class Q1{
    public static void main(String[] args){
        System.out.println("For Loop");
        for(int i = 1; i <= 10; i++){
            System.out.println(i * 2);
        }
        
        int i = 1;
        
        System.out.println("\nWhile loop");
        
        while(i <=10){
           System.out.println(i * 2);
           i++;
        }

        System.out.println("\nDo While loop");
        i = 1;

        do{
           System.out.println(i * 2);
           i++; 
        }while(i <=10);
    }
}