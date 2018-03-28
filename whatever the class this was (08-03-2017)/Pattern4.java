/*
1
2*3
4*5*6
7*8*9*10
11*12*13*14*15

11*12*13*14*15
7*8*9*10
4*5*6
2*3
1
*/

class Pattern4
{
	public static void main(String[] args)
	{
		int x=1;
		for (int i = 0 ;i<=4;i++) 
		{
			for (int j=0;j<=i;j++) 
			{
				if(i==0||j==i)
					System.out.print(x);				
				else
					System.out.print(x+"*");
				x++;
			}	
			System.out.println();
		}
// the reverse pattern
		x = 11;
		for (int i = 4 ; i >= 0 ; i--) 
		{
			for (int j = i ; j >= 0 ; j--) 
			{
				if(j>0)
					System.out.print(x+"*");				
				else
					System.out.print(x);	
				x++;
			}
			System.out.println();	
			x = x-(2*i)-1;
			//System.out.println("the i value is = "+i+"the x value ="+x);
		}
	}
}