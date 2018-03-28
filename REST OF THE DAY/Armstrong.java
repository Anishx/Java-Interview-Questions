/*

ARMSTRONG NUMBER
153 = 1^3 + 5^3 + 3^3 

*/
import java.util.Scanner;

class Armstrong
{
	public static int pow(int num, int power)
	{
		int res = 1;
		for (int i =0 ;i<power ;i++ ) 
		{
			res = res*num;	
		}
		return res;
	}
	public static int getcount(int num)
	{
		int power = 0;
		while(num>0)
		{
			power++;
			num = num/10;
		}
		return power;
	}
	public static boolean armstng(int num, int power)
	{
		int sum = 0;
		int t=num;
		while(num>0)
		{
			int rem = num%10;
			sum = sum+pow(rem,power);
			num = num/10;
		}
		if(sum == t)
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number \n");

		int num = sc.nextInt();
		int c1 = getcount(num);

		System.out.println("Power = "+c1);

		boolean res = armstng(num,c1);

		if(res == true)
			System.out.println("IS armstrong");
		else
			System.out.println("IS NOT armstrong");
	}
}