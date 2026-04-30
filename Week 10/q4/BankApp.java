public class BankApp{
    public static void main(String[] args){
        SavingsAccount sa = new SavingsAccount(1001,"John",22000);
        CurrentAccount ca = new CurrentAccount(1002,"Jane",50000);
        
        //Display details
        System.out.println(sa);
        System.out.println("Savings Interest: " + sa.calculateInterest());
        System.out.println("Savings Interest (Custom Rate): " 
                            + sa.calculateInterest(7));
        System.out.println();                  
        
        System.out.println(ca);
        System.out.println("Current Interest: " + ca.calculateInterest());
        System.out.println("Current Interest (Custom Rate): " 
                            + ca.calculateInterest(2));
                
    }
}