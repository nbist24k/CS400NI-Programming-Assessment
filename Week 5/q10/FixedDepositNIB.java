import java.util.Scanner;

public class FixedDepositNIB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        final double FEE_RATE = 0.005; // 0.5%
        char choice = 'y';

        System.out.println("======================================");
        System.out.println(" Nepal Investment Bank FD Calculator");
        System.out.println("======================================");

        while (choice == 'y' || choice == 'Y') {
            double P, annualRate, monthlyRate, A, fee, finalAmount;
            int years, months;

            // Principal input
            do {
                System.out.print("\nEnter deposit amount (Minimum Rs. 1000): ");
                P = sc.nextDouble();

                if (P < 1000) {
                    System.out.println("Deposit must be at least Rs. 1000.");
                }
            } while (P < 1000);

            // Annual rate input
            do {
                System.out.print("Enter annual interest rate (8 to 12): ");
                annualRate = sc.nextDouble();

                if (annualRate < 8 || annualRate > 12) {
                    System.out.println("Interest rate must be between 8% and 12%.");
                }
            } while (annualRate < 8 || annualRate > 12);

            // Duration input
            do {
                System.out.print("Enter duration in years (Maximum 5 years): ");
                years = sc.nextInt();

                if (years < 1 || years > 5) {
                    System.out.println("Duration must be between 1 and 5 years.");
                }
            } while (years < 1 || years > 5);

            //Calculations
            monthlyRate = annualRate / 12 / 100;
            months = years * 12;

            // Monthly compound interest formula
            A = P * Math.pow((1 + monthlyRate), months);

            fee = A * FEE_RATE;
            finalAmount = A - fee;

            // Output
            System.out.println("\n---------- FD Details ----------");
            System.out.printf("Principal (P)           : Rs. %.2f%n", P);
            System.out.printf("Annual Rate             : %.2f%%%n", annualRate);
            System.out.printf("Monthly Rate            : %.5f%n", monthlyRate);
            System.out.printf("Years                   : %d%n", years);
            System.out.printf("Months                  : %d%n", months);
            System.out.printf("Maturity Amount (A)     : Rs. %.2f%n", A);
            System.out.printf("Processing Fee Rate     : %.3f%n", FEE_RATE);
            System.out.printf("Processing Fee          : Rs. %.2f%n", fee);
            System.out.printf("Final Amount Received   : Rs. %.2f%n", finalAmount);
            System.out.println("-------------------------------");

            // Repeat
            System.out.print("\nDo you want to calculate another FD? (y/n): ");
            choice = sc.next().charAt(0);
        }

        System.out.println("\nThank you for using the FD Calculator.");
        sc.close();
    }
}