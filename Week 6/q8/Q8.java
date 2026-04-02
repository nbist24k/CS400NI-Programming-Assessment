public class Q8{
    public static void main(String[] args){
       
        String[] categories = {"Fiction", "Nepali"};

        // Inline initialization (as required)
        String[][] titles = {
            {"Lord of the Rings"},
            {"Karnali Blues"}
        };

        double[][] prices = {
            {560.2586},
            {750.0345}
        };

        System.out.println("Category\t\tNames\t\t\tPrice");

        // Nested loop (required for 2D arrays)
        for (int i = 0; i < categories.length; i++) {

            for (int j = 0; j < titles[i].length; j++) {

                System.out.printf("%s\t\t", categories[i]);

                // Safe null check
                if (titles[i][j] == null || titles[i][j].isEmpty()) {
                    System.out.print("[empty]\t\t");
                } else {
                    System.out.printf("%-24s", titles[i][j]);
                }

                System.out.printf("%.2f\n", prices[i][j]);
            }
        }
        
        
        
        
    }
}