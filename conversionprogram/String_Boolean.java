package conversionprogram;

public class String_Boolean
{
	public static void main(String[] args) 
	{
		String s="True";
		String s1="False";
		boolean b=Boolean.parseBoolean(s);
		boolean b1=Boolean.parseBoolean(s1);
		System.out.println(b);
		System.out.println(b1);
		
	}

}
