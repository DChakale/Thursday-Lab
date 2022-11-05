package basicprogram;
import java.util.Scanner;

public class SumOfOddNum
{
	public static void main(String []args)
	{
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a Number");
		num=sc.nextInt();
		
		for(int i=0;i<=num;i++)
		{
			if(i%2==1)
			{
				sum=sum+i;
			}
		}
		System.out.println("Sum of Odd Number ="+sum);
	}

}
