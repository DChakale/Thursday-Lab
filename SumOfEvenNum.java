package basicprogram;
import java.util.Scanner;

public class SumOfEvenNum
{
	public static void main(String []args)
	
	{
		Scanner sc=new Scanner(System.in);
		int i,num,sum=0;    
		System.out.println("Enter Number of terms:"); 
		num=sc.nextInt();
		
		for(i=0;i<=num;i+=2)    
		
		{
			sum+=i;              
		}
		
		System.out.println("Sum of even number from 1 to "+num+" is : "  +sum);
	}
	

}
