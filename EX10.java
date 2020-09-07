//EX10 TO ACCEPT AN INPUT VALUE IN MM FROM USER THEN CALCULATE NUMBER OF KM,M,CM AND MM
import java.util.Scanner;
public class EX10
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		int KM,M,CM,MM,n;
		System.out.println("ENTER n VALUE IN MM ");
		n=input.nextInt();
		KM=n/1000000;								//1KILO METER=10,00,000MILI METERS
		n=n%1000000;
		M=n/1000;									//1METER=1,000MILI METERS
		n=n%1000;
		CM=n/10;									//1CENTI METER=10MILI METERS
		MM=n%10;
		System.out.println("KM "+KM);
		System.out.println("M "+M);
		System.out.println("CM "+CM);
		System.out.println("MM "+MM);
	}
}