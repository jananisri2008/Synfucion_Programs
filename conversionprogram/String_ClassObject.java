package conversionprogram;

public class String_ClassObject 
{
	public static void main(String[] args)throws Exception
	{
		Class c=Class.forName("java.lang.String");
		System.out.println(c.getName());
		System.out.println(c.getSuperclass().getName());
		
	}

}
