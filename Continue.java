//CONTINUE

import java.util.Scanner;  
public class Continue  
{  
public static void main(String args[])   
{  
int num=10;
//loop start execution form and execute until the condition becomes false  
for(int i=1; i <= num; i++)  
{  
    if(i==5)
    continue;
//prints the entered number      
System.out.println(i);  
}  
}  