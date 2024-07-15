import java.util.Scanner;
/**
* write a Java program in the one you have to take the input as Indian currency note value like 10,20,50,100,2000
  and at the end of program, you have to calculate the sum of the currency note value like 
  the total amount is.....
*/
public class CurrencyCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store the allowed denominations
        int[] denominations = {10, 20, 50, 100, 500, 2000};

        // Array to store the count of each denomination
        int[] counts = new int[denominations.length];

        System.out.println("Enter the number of currency notes for each denomination.");
        for (int i = 0; i < denominations.length; i++) {
            System.out.print("Number of " + denominations[i] + " rupee notes: ");
            counts[i] = scanner.nextInt();
        }

        // Calculate the total sum
        int totalSum = 0;
        for (int i = 0; i < denominations.length; i++) {
            totalSum += denominations[i] * counts[i];
        }

        // Output the total value
        System.out.println("The total value of the notes is: " + totalSum + " rupees.");

        scanner.close();
    }
}
