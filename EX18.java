//EX18 ON USER DEFINED METHODS WITH CALUCULATIONS
import java.util.Scanner;
public class EX18
{
	static void natSum(int n)								//FORMAL PARAMETERS //USER DEFINED MEETHOD
	{														//VARIABLES SHOULD BE DECLARED SEPERATELY FOR EVERY METHOD
		n=n*(n-1)/2;
		System.out.println("SUM OF NATURAL NUMBERS IS "+n);
	}
	public static void main(String[]arg)					//MAIN METHOD
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter n VALUE");
		int n=input.nextInt();
		natSum(n);											//ACTUALL PARAMETERS
	}
}