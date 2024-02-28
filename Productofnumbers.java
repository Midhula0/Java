//PRODUCT OF FIRST 100 NUMBERS
public class Productofnumbers {
    public static void main(String[] args) {
        // Initialize a variable to hold the result
        long result = 1;

        // Multiply the numbers from 1 to 100
        for (int i = 1; i <= 100; i++) {
            result *= i;
        }

        // Print the result
        System.out.println("The product of the first 100 numbers is: " + result);
    }
}
