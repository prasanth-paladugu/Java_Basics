//EX12 ON SWITCH CASE FOR INTEGER COMPARISION
import java.util.Scanner;
public class EX12
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("ENTER AN INTEGER");
		int n=input.nextInt();
		switch(n%2)										//SWITCH DIRECTLY JUMPS TO THE CASE WHICH SHOULD BE EXECUTED
		{
			case 0:System.out.println(" EVEN ");
			break;										//JUMPS OUT  OF SWITCH
			case 1:System.out.println(" ODD ");
			break;
			default:System.out.println(" NOT INTEGER ");//IF NO CASE IS MATCHED IT EXECUTES DEFAULT
		}
	}
}