/*

Output of the Program

a
b c 
d e f
g h i j

*/

class Pattern2
{
	public static void main(String[] args)
	{
		int n =4;
		char s = 'a';
		for (int i = 0;i<n ;i++) 
		{
			for (int j = 0;j<=i ;j++) 
			{
				System.out.print(s+" ");
				int a = s;
				a++;
				s = (char)a;
			}
			System.out.println("");
		}
	}
}