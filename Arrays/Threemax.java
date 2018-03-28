/* wap to find first three max numbers */

class Threemax
{
	public static void main(String[] args)
	{
		int ar[]={52,102,147,28,105};
		max(ar);
	}
	
	public static void max(int[] ar)
	{
		int max1=0;
		int max2=0;int max3=0;int index1=0;int index2=1;int index3=2;
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
				max3=max2;
				index2=i;
			}	
			else if(ar[i]>max3)
			{
				max3=ar[i];
				index3=i;

			}


		}
		System.out.println(max1+" "+max2+" "+max3+" position1= "+index1+" position2= "+index2+"position 3= "+index3 );


	}
	


	


}

