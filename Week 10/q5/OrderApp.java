public class OrderApp{
    public static void main(String[] args){
        NormalOrder n1 = new NormalOrder(1001,"John",50);
        
        PremiumOrder p1 = new PremiumOrder(1002,"Jane",80);
        
        //Display details
        
        System.out.println(n1);
        System.out.println("Final Amount: $" + n1.calculateFinalAmount());
        System.out.println("Final Amount (after discount): $" 
        + n1.calculateFinalAmount(10));
        System.out.println();
        
        System.out.println(p1);
        System.out.println("Final Amount: $" + p1.calculateFinalAmount());
        System.out.println("Final Amount (after discount): $" 
        + p1.calculateFinalAmount(18));
        
    }
}