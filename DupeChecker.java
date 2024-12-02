import java.util.Scanner;

public class DupeChecker {

    // Eliminate Duplicates from the list 
    public static int[] eliminateDuplicates(int[] list) {
        int[] distinctList = new int[list.length];
        int i = 0; // Index for distinctList

        // Add numbers to distinctList if not already present
        for (int num : list) {
            // If the number is not already in distinctList, add it
            if (linearSearch(distinctList, num) == -1) {
                distinctList[i] = num;
                i++;
            }
        }

        // Create final array with distinct numbers
        int[] finalList = new int[i];
        for (int j = 0; j < i; j++) {
            finalList[j] = distinctList[j];
        }

        return finalList;
    }

    // Check if a number is in the array
    public static int linearSearch(int[] array, int key) {
        for (int i = 0; i < array.length; i++) {
            if (key == array[i]) {
                return i; 
            }
        }
    // Return -1 if not found
        return -1; 
    }

    // Print array with a given number of elements per line
    public static void printArray(int[] array, int numberPerLine) {
        for (int i = 0; i < array.length; i++) {
            System.out.printf("%2d ", array[i]);
            if ((i + 1) % numberPerLine == 0) {
                System.out.println(); 
            }
        }
        System.out.println(); 
    }

    // Main method to run the program
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Array to store ten integers
        int[] numbers = new int[10];

        // Prompt user for input
        System.out.print("Enter ten numbers: ");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt(); 
        }

        // Get the distinct numbers by eliminating duplicates
        int[] distinctNumbers = eliminateDuplicates(numbers);

        // Display the result
        System.out.print("The distinct numbers are: ");
        printArray(distinctNumbers, 10); 
    input.close();
    }
}

// Pseudocode
// Function eliminateDuplicates(list):
    // Create an empty list for distinct elements
    // For each number in the input list:
        // If the number is not already in the distinct list:
            // Add the number to the distinct list
    // Return the distinct list

// Function linearSearch(array, key):
    // For each element in the array:
        // If the element equals the key:
            // Return the index
    // Return -1

// Function printArray(array, numberPerLine):
    // For each element in the array:
        // Print the element with formatting
        // If the number of printed elements reaches numberPerLine:
            // Print a new line

// Main:
    // Prompt the user to enter 10 numbers
    // Store the numbers in an array
    // Call eliminateDuplicates to get distinct numbers
    // Print the distinct numbers
