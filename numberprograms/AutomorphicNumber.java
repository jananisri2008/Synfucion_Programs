package numberprograms;

public class AutomorphicNumber
{
	public static void main(String[] args)
	{
		int n=3,sqr;
		sqr=n*n;
		String num=String.valueOf(n);
		String square=String.valueOf(sqr);
		if(square.endsWith(num))
		System.out.println("automorphic");
		else
			System.out.println("not automorphic");

	}

}
