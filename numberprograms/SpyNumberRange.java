package numberprograms;

public class SpyNumberRange 
{
	public static void main(String[] args) 
	{
		int r,sum=0,pro=1;
		for(int i=1;i<1000;i++)
		{
			int temp=i;
			sum=0;
			pro=1;
			while(i!=0)
			{
				r=i%10;
				sum=sum+r;
				pro=pro*r;
				i=i/10;
			}
			if(sum==pro)
				System.out.print(temp+" ");
			i=temp;
		}
		
	}

}
