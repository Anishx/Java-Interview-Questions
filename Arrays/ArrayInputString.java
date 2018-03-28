class ArrayInputString 
{
	public static void main(String[] args)
	{
		
		String ar[] = new String[3];

		ar[0] = "java";
		ar[1] = "sql";
		ar[2] = "j2ee";

		System.out.println("size = "ar.length);

		//printing ar array

		System.out.println("The ar array length");
		for (int i = 0 ;i<ar.length ;i++ ) 
		{
			System.out.println("ar["+i+"] ="+ar[i]);	
		}

		//printing args array
		System.out.println("The args array length");
		for (int i = 0 ;i<args.length ;i++ ) 
		{
			System.out.println("args["+i+"] ="+args[i]);	
		}
	}
}