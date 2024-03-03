//2nd largest in array

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
 

class Seclargest {

    public static void main(String[] args)

    {
 

        // Initializing the array

        Integer array[] = { 1, 2, 3, 4, 5 };
 

        // Sorting the array in descending order

        Arrays.sort(array, Collections.reverseOrder());
 

        // Printing the elements

        System.out.println(Arrays.toString(array));
        
        System.out.println(array[1]);
    }
}

