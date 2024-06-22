package conversionprogram;
import java.text.SimpleDateFormat;
import java.util.Date;
public class String_Date
{
	public static void main(String[] args) throws Exception 
	{
		String s="18/06/2024 4:20:10";
		SimpleDateFormat d=new SimpleDateFormat("dd/MM/yyyy hh:mm:ss");
		System.out.println(d.parse(s));
		
	}

}
