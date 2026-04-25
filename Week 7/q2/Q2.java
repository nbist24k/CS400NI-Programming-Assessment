public class Q2{
    public static void main(String[] args){
        Rectangle rect1 = new Rectangle(4,6);
        Rectangle rect2 = new Rectangle(5,8);
        
        // Display length and breadth of rectangles
        System.out.println("Length of rect1: " + rect1.length+
                 "\nBreadth of rect1: " + rect1.breadth) ;

    
        System.out.println("Length of rect2: " + rect2.length+
                 "\nBreadth of rect2: " + rect2.breadth) ;
                 
        System.out.println();
                 
                 
        // Display area of rectangles
        System.out.println("Area of rect1: " + rect1.length * rect1.breadth);
        System.out.println("Area of rect2: " + rect2.length * rect2.breadth);
    }
}