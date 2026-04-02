public class Q5{
    public static void main(String[] args){
        int rows = 5;
        for (int i = 1; i <= rows; i++) {
            // 1. Print leading spaces
            for (int j = i; j < rows; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print(k);
            }
            System.out.println();
        }
    }
}