//EX13 ON SWITCH CASE FOR STRING COMPARISION
import java.util.Scanner;
public class EX13
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("ENTER PASSWORD");
		String PASSWORD=input.next();
		switch(PASSWORD)
		{
			case "pandu":System.out.println(" PASSWORD CORRECT ");
			break;
			default:System.out.println(" PASSWORD IN-CORRECT ");
		}
	}
}