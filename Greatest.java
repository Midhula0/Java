//GREATEST OF THREE NUMBERS
import java.util.*;
public class Greatest
{
	public static void main(String[] args) {
	    int a,b,c;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number: ");
		a=s.nextInt();
		b=s.nextInt();
		c=s.nextInt();
		if(a>b)
		{
		    System.out.println("a is greater");
		}
		else if(b>c){
		    System.out.println("b is greater");
		}
		else{
		    System.out.println("c is greater");
		}
		
	}
}
