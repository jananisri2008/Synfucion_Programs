package StringPrograms;
import java.util.Arrays;
public class Anagram 
{
	public static void main(String[] args)
	{
		String s1="man",s2="name";
		
		s1=s1.toLowerCase();
		s2=s2.toLowerCase();
		
			char[]s1Array=s1.toCharArray();
			char[]s2Array=s2.toCharArray();
			
			Arrays.sort(s1Array);
			Arrays.sort(s2Array);
			
			if(Arrays.equals(s1Array,s2Array))
			{
				System.out.println("anagram");
			}
			else
			{
				System.out.println("not anagram");
					
			}
		}
		
	}

