package basicprogram;
import java.util.Scanner;

public class PerfectNum
{
	public static void main(String[] args) 
	{
		int num,sum=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter range to check perfect numbers");
		num=sc.nextInt();
		System.out.println("perfect numbers between 1 to "+num);
		for (int i=1; i<num ;i++ )
		{
			sum=0;
		 for(int j=1;j<i;j++)
		  {
			  if(i%j==0)
			   {
				sum=sum+j;
		     	}	
			
		  }
			if(sum==i)
			{
				System.out.println("Perfect numbers = "+sum);
			}			
		}				
	}
}
