import java.util.Scanner;
class Power
{ 
	static double res = 1;
	public static double pow(double num,double pwr)
	{
		for (int i = 0 ;i < pwr ;i++ ) 
		{
			res = res * num;	
		}
		return res;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the number: ");
		Scanner sc1 = new Scanner(System.in);
		double n = sc1.nextDouble();

		System.out.println("Enter its power");
		double p = sc1.nextDouble();

		double res = pow(n,p);
		System.out.println("The result is = "+res);
	}
}