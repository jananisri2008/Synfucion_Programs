package numberprograms;

public class DuckNumber 
{
	public static void main(String[] args) 
	{
		int num=0201,r;
		boolean dn=false;
		while(num>0)
		{
			r=num%10;
			if(r==0)
			{
				dn=true;
				break;
     		}
		num=num/10;			
		}
			
			if(dn)
				System.out.println("duck number");
			else
				System.out.println("not duck number");		
		
	}

}
