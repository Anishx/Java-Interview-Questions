/*
WAP TO CONVERT DECIMAL NUMBER TO OCTAL
*/

class DecimalToOctalRec
{
	static int rem = 1;
	static String res = "";

	public static int binary(int num)
	{
		if(num>=1)
		{
			int rem = num % 8;
			res = rem + res ; 
			num = num /8;
			binary(num);
		}
		int y = Integer.parseInt(res);
		return y; 	
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the number->");

		Scanner sc1 = new Scanner(System.in);
		int num = sc1.nextInt();

		int x = binary(num);
		System.out.println("The Binary Representation of "+num+" is = "+x);
	}
}