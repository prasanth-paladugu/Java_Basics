//HW3 ON COMPOUND INTREST
import java.util.Scanner;
public class HW3
{
	public static void main(String args[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("ENTER PRINCIPLE AMOUNT ");
		double P=input.nextDouble();
		System.out.println("ENTER RATE OF INTREST ");
		double R=input.nextDouble();
		System.out.println("ENTER TIME ");
		double T=input.nextDouble();
		System.out.println("ENTER COMPOUNDS PER YEAR ");
		double N=input.nextDouble();						// FORMULAE FOR COMPOUND INTREST=A-P A=P(1+(R/N))^NT
		double x=(1+((R/100)/N));
		double y=N*T;										// x VALUE IS MULTIPLIED y TIMES
		double p=x;
		pp:													// LABELING THE WHILE LOOP
		while(y>=1)
		{
			if(y==1)
			{
				y--;
				continue pp;								// STOPS THIS ITERATION AND JUMP TO NEXT ITERATION
			}
			p=p*x;
			y--;
		}
		double A=P*p;
		System.out.println("AMOUNT "+A);
		double CI=A-P;
		System.out.println("COMPOUND INTREST IS "+CI);
	}
}
