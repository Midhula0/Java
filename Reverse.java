//REVERSE A NUMBER
import java.util.*;
public class Reverse
{  
   public static void main(String[] args) 
   {  
       
       Scanner sc = new Scanner(System.in);  
       System.out.println("Enter the number: ");  
       int num=sc.nextInt();
       int r,sum=0;
       int temp=num;    
       while(num>0)
       {    
       r=num%10;    
       sum=(sum*10)+r;    
       num=num/10;    
       }    
           
        System.out.println("The Reversed number is:  "+sum);    
        
  }  
} 
