		int y=--x;
		y=y-4;
		for(int i=4;i>=0;i--) //rows
		{
			for(int j=0;j<=i;j++) 
			{
				if(i==0||j==i)
					System.out.print(y);				
				else
					System.out.print(y+"*");
				y++;
			}	
			System.out.println();
			y=y-i;
		}