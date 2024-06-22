package StringPrograms;

public class ReverseString_Whileloop
{
	public static void main(String[] args)
	{
		String s="Happy Day";
		System.out.print(s);
		System.out.println();
		int i=s.length();
		while(i>0)
		{
			System.out.print(s.charAt(i-1));
			i--;
		}
	}
}
