package StringPrograms;

public class ReverseString 
{
	public static void main(String[] args)
	{
		String s="Happy Day";
		String temp="";
		
		for(int i=s.length()-1;i>=0;i--)
		{
			temp=temp+s.charAt(i);
		}
		System.out.println(s);
		System.out.println(temp);
		
	}

}
