//hexa decimal to decimal 
import java.util.Scanner;

class Hexatodecimal 
{
	public static int Hexatodec(String num)
	{
		int res = 0;
		int count = 0;
		//string
		int len = num.length()-1;
		//2aD
		while(len>=0)
		{
			char n = num.charAt(len);
			int ch = (int)n;
			if(ch >=65 && ch <=70)
			{
				res = res + (ch-55)*Pow(16,count++);
			}	
			else if(ch>=97 && ch<=102)
			{
				res = res + (ch-87)*Pow(16,count++);
			}
			else if(ch>=48 && ch<=87)
			{
				res = res + (ch-48)*Pow(16,count++);
			}
			else
			{}
			len--;
		}
		return res;
	}

	public static int Pow(int x , int y)
	{
		int sum = 0; 
		while(y>=0)
		{
			sum = y * x;
			y--;
		}
		return sum;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the hexa number");
		//2aD
		Scanner sc1 = new Scanner(System.in);
		String s 	= sc1.next(); 

		long x = Hexatodec(s);
		System.out.println(x);	
	}
}