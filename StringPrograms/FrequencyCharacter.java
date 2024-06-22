package StringPrograms;

public class FrequencyCharacter
{
	public static void main(String[] args) 
	{
		String s="Good Day";
		char ch1='o';
		char ch2='d';
		/*s=s.toLowerCase();*/
		int fre1=0,fre2=0;
		for(int i=0;i<s.length();i++)
		{
			if(ch1==s.charAt(i))
			{
				++fre1;
			}
			else if(ch2==s.charAt(i))
			{
				++fre2;
			}
		}
		System.out.println("Frequency of "+ch1+" is "+fre1);
		System.out.println("Frequency of "+ch2+" is "+fre2);
	}

}
