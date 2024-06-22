package numberprograms;

public class XylemPhloem
{
	public static void main(String[] args) 
	{
		int n=17156,temp,m=0,e=0;
		temp=n;
		while(temp!=0)
		{
			if(temp==n || temp<10)
				m=m+temp%10;
			else
				e=e+temp%10;
			temp=temp/10;
		}
		if(m==e)
			System.out.println("xylem");
		else
			System.out.println("phloem");
	}

}
