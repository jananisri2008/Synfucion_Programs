package StringPrograms;

public class ChangeLowerUpperCase
{
	public static void main(String[] args)
	{
		String s="Hello";
		/*char c=s.charAt(0);
		char toUpperCase=(char)(c-32);
			System.out.println(s.toLowerCase());
		char toLowerCase=(char)(c+32);
			System.out.println(s.toUpperCase());*/
		s=s.toLowerCase();
		System.out.println(s);
		s=s.toUpperCase();
		System.out.println(s);
		
	}

}
