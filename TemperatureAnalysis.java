// Space Complexity: O(n)
// Time Complexity: O(n)

import java.util.Scanner;

public class TemperatureAnalysis {
    public static void main(String[] args) {
        // Create a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Step 1: Input the number of days (array size)
        System.out.print("Enter the number of days: ");
        int numDays = scanner.nextInt();

        // Data structure: array to store temperature values
        double[] temperatures = new double[numDays]; // Array to hold temperatures for each day

        // Initialize a variable to store the sum of temperatures
        double sum = 0;

        // Step 2: Input temperature values
        for (int i = 0; i < numDays; i++) {
            System.out.print("Enter the temperature for day " + (i + 1) + ": ");
            temperatures[i] = scanner.nextDouble();  // Store each temperature in the array
            sum += temperatures[i];                 // Accumulate the sum to calculate average
        }

        // Step 3: Calculate the average temperature
        // Algorithm: Calculate average by dividing the sum of elements by the number of elements
        double averageTemperature = sum / numDays;
        System.out.println("Average Temperature: " + averageTemperature);

        // Step 4: Count how many days have temperatures above the average
        int daysAboveAverage = 0;

        // Algorithm: Iterate over the array to compare each temperature with the average
        for (double temp : temperatures) {
            if (temp > averageTemperature) {
                daysAboveAverage++; // Increment the count if temperature is above the average
            }
        }

        // Step 5: Output the result
        System.out.println("Number of days above average temperature: " + daysAboveAverage);

        // Close the scanner to prevent resource leak
        scanner.close();
    }
}
