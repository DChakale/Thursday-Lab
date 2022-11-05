package basicprogram;
import java.util.Scanner;

public class SumOfEvenNum
{
	public static void main(String []args)
	
	{
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number ");
		num=sc.nextInt();
		
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
			{
				sum=sum+i;
			}
			
		}
		System.out.println("Sum of Even Number ="+sum);
	}
	

}
