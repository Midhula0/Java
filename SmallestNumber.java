//SMALLEST OF 3 NUMBER

public class SmallestNumber {
    public static void main(String[] args) {
        int num1 = 10;
        int num2 = 5;
        int num3 = 8;

        System.out.println("Numbers are: " + num1 + ", " + num2 + ", " + num3);

        int smallest;

        // Compare num1 and num2
        if (num1 < num2) {
            // Compare num1 and num3
            if (num1 < num3) {
                smallest = num1;
            } else {
                smallest = num3;
            }
        } else {
            // Compare num2 and num3
            if (num2 < num3) {
                smallest = num2;
            } else {
                smallest = num3;
            }
        }

        System.out.println("Smallest number is: " + smallest);
    }
}
