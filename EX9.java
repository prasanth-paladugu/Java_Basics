//EX9 ON SIMPLE INTREST BASED ON GIVEN VARIABLES
import java.util.Scanner;							//GIVING ADDRESS OF SCANNER CLASS TO COMPILER
public class EX9									//MAIN CLASS
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);		//CREATINGA REFERENCE TO SCAN THE DATA FROM USER
		double P,R,SI;								//DECLARING VARIABLES/PROPERTIES
		int T;
		System.out.println("PRINCPLE AMOUNT IS ");
		P=input.nextDouble();
		System.out.println("RATE OF INTREST IS ");
		R=input.nextDouble();
		System.out.println("TIME PERIOD IS ");
		T=input.nextInt();
		SI=P*T*R/100;								//Simple Intrest formulae
		System.out.println("SIMPLE INTREST IS "+SI);
	}
}