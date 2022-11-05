package basicprogram;
import java.util.Scanner;

public class Factoria
{
	public static void main(String []args)
	{
		int Num,temp=1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter A Number");
		Num=sc.nextInt();
		
		for(int i=1;i<=Num;i++)
		{
			temp=temp*i;
		}
		System.out.println("Factorial Of Enterd Number "+Num+" = "+temp);
	}

}
