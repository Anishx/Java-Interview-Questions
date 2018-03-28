import java.util.Scanner;

class ArrayInOut 
{
	public static void main(String[] args)
	{	
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size ");
		int size = sc.nextInt();
		
		for (int i = 0;i<ar.length ;i++ ) 
		{
			System.out.println("Enter the value at"+i+" Position: ");
			ar[i] = sc.nextInt();	
		}

		System.out.println("The elements are: ");
		for (int i = 0;i<ar.length ;i++ ) 
		{
			System.out.println("ar["+i+"] = "+ar[i]);	
		}
	}
}