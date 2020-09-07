//HW2 TO ACCEPT AN INPUT VALUE IN SECONDS FROM USER THEN CALCULATE NUMBER OF HOURS,MINUTES AND SECONDS
import java.util.Scanner;
public class HW2
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		int H,M,S,n;
		System.out.println("ENTER n VALUE IN SECONDS ");
		n=input.nextInt();
		H=n/3600;									//1HOUR=3600SECONDS
		n=n%3600;
		M=n/60;										//1MINUTE=60SECONDS
		S=n%60;
		System.out.println("HOUR'S "+H+" MINUTE'S "+M+" SECOND'S "+S);
		//System.out.println("MINUTES'S "+M);
		//System.out.println("SECOND'S "+S);
	}
}