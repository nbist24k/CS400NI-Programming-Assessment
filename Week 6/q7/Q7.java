public class Q7{
    public static void main(String[] args){
         // Create 2x3 array (2 rows, 3 seats per rows)
        String[][] seats = new String[2][3];

        // Fill with sample values
        // Row 1
        seats[0][0] = "Amulya";
        seats[0][1] = "Radhen";
        seats[0][2] = "Raman";

        //Row 2
        //seats[1][0] = "";
        //seats[1][1] = "";
        //seats[1][2] = "";

        // Print table with labels
        System.out.println("Seat\tNames");

        for (int i = 0; i < 2; i++) {
            System.out.print("Seat" + (i + 1) + "\t");


            for (int j = 0; j < 3; j++) {
                if(seats[i][j] == null || seats[i][j].isEmpty()){
                    System.out.print("[empty] ");
                }
                else{
                    System.out.print(seats[i][j] + " ");
                }
                
            }
            System.out.println();
        }
    }
}