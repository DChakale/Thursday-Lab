package basicprogram;
import java.util.Scanner;

public class MulTable
{
	public static void main(String []args)
	
	{
	   Scanner sc= new Scanner(System.in);
	   int num,temp=1;         
	   System.out.println("Enter a number:");      
	   num =sc.nextInt();
	   System.out.println("The Table of "+num);
	   
	  
	   for(int i=1;i<=10;i++)                     
	   {
		   temp=num*i;
		   System.out.println(num+" * "+i+" = "+temp);  
		   
	   }
    }
}
