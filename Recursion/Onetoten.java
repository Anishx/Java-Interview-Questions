
public class Onetoten 
{
	static int count = 0;
	public static void ten()
	{	
		if(count < 11)
		{
			System.out.println(count);
			count++;
			ten();
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ten();
	}

}
