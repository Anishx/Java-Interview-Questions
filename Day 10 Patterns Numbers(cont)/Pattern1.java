/* 



*/
class Pattern1 
{
	public static void main(String[] args)
	{
		int n =3;
		for (int rows = 0; rows<n ;rows++ ) 
		{
			int count = 1;
			for(int sp = 0;sp<n-1-rows;sp++ )
			{
				System.out.print("  ");
			}
			for (int col = 0;col<=2*rows ;col++ ) 
			{
				if (rows>col) {
					System.out.print(count+++" ");
				}
				else
					System.out.print(count--+" ");
			}
			System.out.println("");
		}
		for (int rows = 0; rows<n ;rows++ ) 
		{
			int count = 1;
			for(int sp = n-1-rows;sp>=0;sp-- )
			{
				System.out.print("  ");
			}
			for (int col = 2*rows;col>0 ;col-- ) 
			{
				if (rows>col) {
					System.out.print(count+++" ");
				}
				else
					System.out.print(count--+" ");
			}
			System.out.println("");
		}
	}
}