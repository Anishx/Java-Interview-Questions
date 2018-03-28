//wap to find the first maximum number in a given array 

class FirstMax 
{
	public static String max(int[] ar)
	{
		int index = 0;
		int max = ar[0];
		for (int i = 1;i<ar.length ;i++ ) 
		{
			if(ar[i]>max)
			{
				max = ar[i];
				index = i;
			}	
		}
		String y=""+max+" the position value is "+index;
		return y;
	}
	public static void main(String[] args)
	{
		int[] ar = {58,56,25,2,102,30};
		String x = max(ar);
		System.out.println("The max = "+x);

	}
}