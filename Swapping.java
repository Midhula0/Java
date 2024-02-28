//SWAPPING OF 2 NUMBERS

import java.util.*;
public class Swapping
{
	public static void main(String[] args) {
	   Scanner s =new Scanner(System.in);
	   int x=s.nextInt();
	   int y=s.nextInt();
	   System.out.println("BEFORE SWAPPING: "+x);
	   System.out.println("BEFORE SWAPPING: "+y);
	   int temp=x;
	   x=y;
	   y=temp;
	   System.out.println("AFTER SWAPPING: "+x);
	   System.out.println("AFTER SWAPPING: "+y);
	}
}
