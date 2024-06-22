package numberprograms;

public class DuckNumberRange
{
	public static void main(String[] args) {
		
	for(int i=1;i<100;i++)
	{
		int temp=i;
		boolean dn=false;
		while(temp>0)
		{
			int r=temp%10;
			if(r==0)
			{
				dn=true;
				break;
			}
			temp=temp/10;
		}
		if(dn)
			System.out.print(i+" ");
	}

	}
}
