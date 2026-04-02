public class Q6{
    public static void main(String[] args){
         // Create 2x2 array (2 students, 2 subjects)
        int[][] marks = new int[2][2];

        // Fill with sample values
        // Student 1
        marks[0][0] = 80; // Nepali
        marks[0][1] = 75; // English

        // Student 2
        marks[1][0] = 90; // Nepali
        marks[1][1] = 85; // English

        // Print table with labels
        System.out.println("Student\tNepali\tEnglish");

        for (int i = 0; i < 2; i++) {
            System.out.print("S" + (i + 1) + "\t");

            int total = 0;

            for (int j = 0; j < 2; j++) {
                System.out.print(marks[i][j] + "\t");
                total += marks[i][j];
            }

            // Print total for each student
            System.out.println("Total: " + total);
        }
    }
}