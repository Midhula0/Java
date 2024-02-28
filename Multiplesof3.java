//MULTIPLY OF 3 UPTO 100

public class Multiplesof3
{  
public static void main(String args[])   
{  
int number=100;  
System.out.print("List of numbers multiplies 3 from 1 to "+number+": ");  
for (int i=1; i<=number; i++)   
{  
//logic to check if the number is multiplies by 3 or not 
//if i%3 is  equal to zero, the number is multiplied by 3  
if (i%3==0)   
{  
System.out.print(i + " ");  
}  
}  
}  
}