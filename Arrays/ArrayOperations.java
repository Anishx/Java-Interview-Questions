class ArrayOperations
{
//---------------------------------------------------------------------------
	public static int[] insertElement(int[] ar,int element,int position)
	{
		if(position > ar.length)
		{
			System.out.println("Cannot add element");
			return ar;
		}
		else
		{
			int[] nar = new int[ar.length+1];
			nar[position] = element;
			for (int i = 0;i<position;i++ ) 
			{
				nar[i] = ar[i];	
			}
			for (int i = position+1; i<nar.length;i++ ) 
			{
				nar[i] = ar[i-1];	
			}
			return nar;
		}
	}
//---------------------------------------------------------------------------
	public static int[] deleteElement(int[] ar,int element,int position)
	{
		if(position > ar.length)
		{
			System.out.println("Cannot add element");
			return ar;
		}
		else
		{
			int[] nar = new int[ar.length-1];
			nar[position] = element;
			for (int i = 0;i<position;i++ ) 
			{
				nar[i] = ar[i];	
			}
			for (int i = position+1; i<nar.length;i++ ) 
			{
				nar[i] = ar[i+1];	
			}
			return nar;
		}
	}
//---------------------------------------------------------------------------
	public static int[] ReplaceElement(int ar[], int element,int position)
	{
			nar[position] = element;
			nar[i] = ar[i];
			return nar;
	}
//---------------------------------------------------------------------------
	public static int[] createArray()
	{
		Scanner sc1 = new Scanner(System.in);

		System.out.println("Enter the size : ");	
		int size = sc1.nextInt();

		int[] ar = new int[size];

		System.out.println("Enter the array elements are: ");
		for (int i = 0 ;i<size ;i++ ) 
		{
			ar[i] = sc1.nextInt();
		}
		return ar;
	}
//---------------------------------------------------------------------------
	public static void PrintArray(int[] ar)
	{
		System.out.println("The array elements are : ");
		for (int i = 0 ;i < ar.length ;i++ ) 
		{
		 	System.out.println(ar[i]);	
		} 
	}
//---------------------------------------------------------------------------
	public static void main(String[] args)
	{
		int[] ar = createArray();

		System.out.println("Enter the Operation to be performed on the array:");

		for (; ; ) 
		{
			System.out.println("A - Insert , B- Delete , C - Replace, D - Exit");
			char choose = sc1.nextChar();
			switch(choose)
			{
				case 'A'://insert
					     System.out.println("Enter the element to add : ");
				   		 int num = sc1.nextInt();
		  				 System.out.println("Enter the position to add the element in: ");
						 int pos = sc1.nextInt();

						 nar = insertElement(ar,num,pos);
						 PrintArray(nar);
						 break;
				

				case 'B'://delete
						 System.out.println("Enter the element to add : ");
				   		 int num = sc1.nextInt();
		  				 System.out.println("Enter the position to add the element in: ");
						 int pos = sc1.nextInt();
						 PrintArray(nar);
						 nar = deleteElement(ar,num,pos);

				case 'C'://replace
						 
						 

				

				case 'D':exit(0);

				default :
			}	
		}
	}
}