class Palindrome 
{
	public static void med()
	{
		int k=0;
		String s1 = "level";
		int a = s1.length();
		int mid = a/2 ; 
		l=a;
		m=a;
		System.out.println("String length ="+a);
		if(a%2 == 1)
		{
			for (int i = 0; i < a.mid+1; i++ ) 
			{
				if(a.charAt(i)==a.charAt(l))
					k++;
				else
					System.out.println("It isn't a palindrome");
				l--;
			}
			if(k==l-2)
				System.out.println("Palindrome");
		}
		else
		{
			for (int j = 0; j < a.mid-1; j++ ) 
			{
				if(a.charAt(i)==a.charAt(l))
					k++;
				else
					System.out.println("It isn't a Palindrome");
				l--;
			}
		}
		if(k==)




		// char[] c1 = s1.toCharArray();
		// int b = c1.length;
		// System.out.println("The char array ="+b);
	}
	public static void main(String[] args)
	{
		med();		
	}
}