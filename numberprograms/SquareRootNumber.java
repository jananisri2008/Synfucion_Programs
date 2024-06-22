package numberprograms;

public class SquareRootNumber
{
	public static void main(String[] args)
	{
		int n=25,sr,temp;
		sr=n/2;
		do {
			temp=sr;
			sr=(temp+(n/temp))/2;
		}
		while((temp-sr)!=0);
		System.out.print(sr);
	}

}
