//PRIME NUMBERS

public class Prime {
    public static void main(String[] args) {
        int start = 2; // Starting range (inclusive)
        int end = 100; // Ending range (inclusive)

        System.out.println("Prime numbers between " + start + " and " + end + " are:");

        // Iterate through the range and check for prime numbers
        for (int i = start; i <= end; i++) {
            boolean isPrime = true;
            if (i == 1) {
                isPrime = false;
            } else {
                for (int j = 2; j <= Math.sqrt(i); j++) {
                    if (i % j == 0) {
                        isPrime = false;
                        break;
                    }
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
