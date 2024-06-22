package StringPrograms;

public class CountStringPunctionMark 
{
	public static void main(String[] args)
	{
		String s="Hello!, How Are you? I can't be change.";
		int count=0;
		for(int i=0;i<s.length();i++)
		{
			if(s.charAt(i)==',' || s.charAt(i)=='?' ||s.charAt(i)=='\'' || s.charAt(i)=='.' ||s.charAt(i)=='!')
				count++;
		}
		System.out.print(count);
	}
}
