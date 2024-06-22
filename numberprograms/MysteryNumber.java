package numberprograms;

public class MysteryNumber 
{
	public static void main(String[] args) 
	{
		int num=154,i=0;
		String n=String.valueOf(num);
		String n1="";
		for(i=n.length()-1;i>=0;i--)
		{
			n1=n1+n.charAt(i);
		}
		Integer res=Integer.valueOf(n1);
		String res1=n1+i;
		for(i=1;i<=num/2;i++)
		{
			if(res==num)
				System.out.println("mystery number");
			else
				System.out.println("not mystery number");

		}
	}

}
