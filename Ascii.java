//Java Program to print the ASCII values 
import java.util.*;
public class Ascii
{
     //Driver code
     public static void main(String []args)
     {
        //Take input from the user
        //Create instance of the Scanner class 
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character:  ");
        char ch=sc.next().charAt(0);
        int value=ch;
        System.out.println("Character is "+ch+" and ASCII value is "+value);
     }
}