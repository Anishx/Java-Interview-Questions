/* wap to find the first two max numbers and their indexin a given array*/

class Twomax
{
	public static void main(String[] args)
	{
		int[] ar={52,102,150,27,105};
		max(ar);
	}
	public static void max(int[] ar)
	{
		int max1=0;
		int max2=0;int index1=0;int index2=1;
		max1=ar[0];int pos1=0;
		for(int i=1;i<ar.length;i++)
		{
			if(ar[i]>max1)
			{
				max2=max1;
				max1=ar[i];
				index1=i;

			}
			else if(ar[i]>max2)
			{
				max2=ar[i];
				index2=i;
			}	


		}
		System.out.println(max1+" "+max2+" position1= "+index1+" position2= "+index2 );


	}
	
}