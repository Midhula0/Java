//BREAK

import java.util.Scanner;  
public class Break  
{  
public static void main(String args[])   
{  
Scanner sc = new Scanner(System.in);  
System.out.print("Enter number: ");       
//reading a number t  
int num=sc.nextInt();  
//loop start execution form and execute until the condition becomes false  
for(int i=1; i <= num; i++)  
{  
    if(i==5)
    break;
//prints the entered number      
System.out.println(i);  
}  
}  
}  