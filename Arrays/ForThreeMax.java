/* wap to find first three max numbers */

class ForThreeMax
{
	public static int[] max(int[] a)
	{
		int temp=0;
		int max1=0;
		int max2=0;int max3=0;int index1=0;int index2=1;int index3=2;
		max1=a[0];
		int pos1=0;
		for(int i=1;i<a.length;i++)
		{
			for(int j = i;j<a.length;j++)
			{
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
				}

			}
		}
		return a;
	}
	public static void main(String[] args)
	{
		int ar[]={52,102,147,28,105};
		int[] a = max(ar);
		for (int i = a.length-1;i>a.length-4;i-- ) 
		{
			System.out.println(a[i]);	
		}
	}
}
