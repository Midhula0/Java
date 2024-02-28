//ODD WITH COUNT

public class OddCount {
    public static void main(String[] args) {
        int start = 1; // Starting range (inclusive)
        int end = 100; // Ending range (inclusive)
        int count = 0; // Variable to count odd numbers

        System.out.println("Odd numbers between " + start + " and " + end + " are:");

        // Iterate through the range and print odd numbers
        for (int i = start; i <= end; i++) {
            if (i % 2 != 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal count of odd numbers: " + count);
    }
}
