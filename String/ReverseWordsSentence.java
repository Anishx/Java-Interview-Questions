/* 
	WAP to reverse the words in a given string
*/
import java.util.Scanner;
public class ReverseWordsSentence
{
	public static String rverseWord(String s1)
	{
		String res = "";
		char []ch = s1.toCharArray();
		for(int i = ch.length-1;i >= 0 ; i--)//travelling reverse so 'st' is end and 'end' is starting point of word
		{
			int st = i;// initialize end point of last word
			while(i >= 0 && ch[i] != ' ')// to seperate word by space
			{
				i--;
			}
			int end = i + 1;// initialize start point of last word
			while(end <= st)// add word (read so far)
			{
				res = res + ch[end];
				end++;
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

		String b = rverseWord(a);
		System.out.println(b);
	}
}