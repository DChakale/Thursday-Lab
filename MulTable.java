package basicprogram;
import java.util.Scanner;

public class MulTable
{
	public static void main(String []args)
	
	{
	   Scanner sc= new Scanner(System.in);
	   int i, num,temp=1;         //declare variables
	   System.out.println("Enter a number:");      // taking input from user
	   num =sc.nextInt();
	   System.out.println("The Table of "+num);
	   
	  
	   for(i=1;i<=10;i++)                    //running loop from 1 to 10 
	   {
		   temp=num*i;
		   System.out.println(num+" * "+i+" = "+temp);  //display output
		   
	   }
    }
}
