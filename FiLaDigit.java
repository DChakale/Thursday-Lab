package basicprogram;
import java.util.Scanner;

public class FiLaDigit
{
	public static void main(String []args)
	{
		int Num,FiDigit,LaDigit;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter any Number");
		Num=sc.nextInt();
		FiDigit=Num;
		while(FiDigit>=10)
		{
			FiDigit=FiDigit/10;
		}
		LaDigit=Num%10;
		System.out.println("First Digit Of The Entred Number "+Num+" = "+FiDigit);
		System.out.println("Last Digit Of The Entred Number "+Num+" = "+LaDigit);
	}
	
}
