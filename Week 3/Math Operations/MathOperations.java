public class MathOperations{
    public static void main(String[] args){
        int a = 30, b = 10;
        
        System.out.println("1. Arithmetic Operators");
        System.out.println("a + b = " + (a + b));
        System.out.println("a - b = " + (a - b));
        System.out.println("a * b = " + (a * b));
        System.out.println("a / b = " + (a / b));
        System.out.println("a % b = " + (a % b));
        System.out.println();
        
        int x = 10, y=15;
        
        System.out.println("2. Unrary Operators");
        
        System.out.println("Before post-increment: " + x);
        System.out.println("During post-increment: " + (x++)); // Post - increment 
        System.out.println("After post-increment: " + x);
        System.out.println("Before pre-increment: " + y);
        System.out.println("During post-increment: " + (++y)); // Pre - increment 
        System.out.println("After post-increment: " + y);
        System.out.println();
        
        int z = 20; // Assigning the literal
        System.out.println("3. Assignment Operators");
        z += 5;
        System.out.println("z +=5 -> " + z);
        z -=3;
        System.out.println("z -=3 -> " + z);
        z *=2;
        System.out.println("z *=2 -> " + z);
        z /= 2;
        System.out.println("z /=2 -> " + z);
        z %= 11;
        System.out.println("z %=11 -> " + z);
        System.out.println();
        
        System.out.println("4. Relational Operators");
        System.out.println("a == b: " + (a == b));
        System.out.println("a != b: " + (a != b));
        System.out.println("a > b: " + (a > b));
        System.out.println("a < b: " + (a < b));
        System.out.println("a >= b: " + (a >= b));
        System.out.println("a <= b: " + (a <= b));
        System.out.println();
        
        boolean p = false, q = true;
        System.out.println("5. Boolean Operators");
        System.out.println("p && q: " + (p && q));
        System.out.println("p || q: " + (p || q));
        System.out.println("!p: " + (!p));
        System.out.println();
        
        int max = (a > b) ? a : b;
        System.out.println("6. Ternary Operator");
        System.out.println("Max between a & b : " + max);
        
        
        
    }
}