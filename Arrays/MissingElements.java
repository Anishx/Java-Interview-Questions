//wap to find missing elements in a given array 

class MissingElements 
{
	public static void missing(int[] a)
	{
		for(int i =0 ; i<a.length-1;i++)
		{
			for (int k = a[i]+1 ;k<a[i+1] ;k++ ) 
			{
				System.out.println(k);
			}
		}
	}
	public static void main(String[] args)
	{
		int[] a = {23,28,30,45,41};
		missing(a);
	}
}