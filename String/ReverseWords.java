/* 
	WAP to reverse each words in the given string
*/
import java.util.Scanner;
public class ReverseWords
{
	public static String rverseEachWord(String s1)
	{
		String res = "";
		char []ch = s1.toCharArray();
		for(int i = 0;i < ch.length; i++)
		{
			int st = i;// initialize start for word
			while(i<ch.length && ch[i] != ' ')// to seperate word by space
			{
				i++;
			}
			int end = i - 1;// initialize end for word
			while(end >= st)// to reverse the word (read so far)
			{
				res = res + ch[end];
				end--;
			}
			res = res + " ";// additional space for word seperation
		}
		return res;
	}
	public static void main(String[] args)
	{
		System.out.println("Enter the String");
		Scanner sc1 = new Scanner(System.in);
		String a = sc1.nextLine();

		String b = rverseEachWord(a);
		System.out.println(b);
	}
}