//ArrayCommandLineArguments

class ArrayCommandLine
{
	public static void main(String[] args)
	{
		
		String ar[] = new String[3];

		ar[0] = "java";
		ar[1] = "sql";
		ar[2] = "j2ee";

		//printing ar array
		System.out.println("Size of ar = "+ar.length);
		System.out.println("The ar array length");
		for (int i = 0 ;i<ar.length ;i++ ) 
		{
			System.out.println("ar["+i+"] ="+ar[i]);	
		}

		//printing args array
		System.out.println("Size of Args = "+args.length);
		System.out.println("The args array length");
		for (int j = 0 ;j<args.length ;j++ ) 
		{
			System.out.println("args["+j+"] ="+args[j]);	
		}
	}
}