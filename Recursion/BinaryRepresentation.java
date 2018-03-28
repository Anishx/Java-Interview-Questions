/*

represent binary number
int bin = 0b101

0b followed by 0s and 1s
//where b can be UPPERCASE or LOWERCASE
------------------------------------------------------
OCTAL 
------------------------------------------------------
int oct = 031

Should start with 0 

------------------------------------------------------
HEXADECIMAL
------------------------------------------------------
int hex = 0xD;

Should start with 0x 
example
	0xD ---  >  A TO F

where x can be UPPERCASE or LOWERCASE

*/
class BinaryRepresentation 
{
	public static void main(String[] args)
	{
		//decimal 
		int dec = 10;
		System.out.println("dec = "+ dec);
		
		//binary 
		int bin = 0b101;
		System.out.println("binary = "+bin);

		//octal
		int oct = 031;
		System.out.println("Octal = "+ oct);

		//hexadecimal 
		int hex = 0xD;
		System.out.println("hexadecimal = "+ hex); 
	}
}