public class Tentoten 
{
	public static void inc(int a)
	{
		if(a<10)
		{
			System.out.print(a+",");
			a++;
			inc(a);
		}
	}
	public static void dec(int b)
	{
			if(b>0)
			{
				System.out.print(b+",");
				b--;
				dec(b);
			}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		dec(9);
		inc(2);
	}

}
