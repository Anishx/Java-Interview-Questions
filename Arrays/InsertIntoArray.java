/* WRITE A PROGRAM TO INSERT AN ELEMENT AT THE SPECIFIED POSITION IN A GIVEN ARRAY */

import java.util.Scanner;

class InsertIntoArray 
{
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
	
	public static void main(String[] args)
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

		System.out.println("Enter the element to add : ");
		int num = sc1.nextInt();

		System.out.println("Enter the position to add the element in: ");
		int pos = sc1.nextInt();

		int[] nar = insertElement(ar,num,pos);

		System.out.println("The Modified array elements are: ");
		for (int i = 0 ;i<nar.length ;i++ ) 
		{
			if(i == nar.length-1)
				System.out.print(nar[i]);
			else
				System.out.print(nar[i]+",");  
		}
		System.out.println();
	}
}