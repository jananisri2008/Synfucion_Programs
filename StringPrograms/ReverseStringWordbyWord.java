package StringPrograms;

public class ReverseStringWordbyWord
{
	public static void main(String[] args)
	{
		String s="Hello! How Are You";
		String temp="";
		String a[]=s.split(" ");
		
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");
		}
		System.out.println();
		for(int i=a.length-1;i>=0;i--)
		{
			temp=temp+a[i]+" ";
		}
		System.out.println(temp);
		
	}

}