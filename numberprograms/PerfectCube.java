package numberprograms;

public class PerfectCube 
{
	public static void main(String[] args) 
	{
		int num=125;
		int root=(int)Math.cbrt(num);
		if(num==root*root*root)
			System.out.println("perfect cube");
		else
			System.out.println("not pefect cube");
		
	}

}
