//EVEN WITH COUNT


public class EvenCount {
    public static void main(String[] args) {
        int start = 1; // Starting range (inclusive)
        int end = 100; // Ending range (inclusive)
        int count = 0; // Variable to count odd numbers

        System.out.println("even numbers between " + start + " and " + end + " are:");

        // Iterate through the range and print even numbers
        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                System.out.print(i + " ");
                count++;
            }
        }

        System.out.println("\nTotal count of even numbers: " + count);
    }
}
