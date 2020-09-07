//EX7 ON SCANNER CLASS FOR ACCEPTING RUN TIME VALUES
import java.util.Scanner;						//TO USE SCANNER CLASS WE SHOULD GIVE THE ADDRESS OF SCANNER CLASS TO COMPILER
public class EX7								//MAIN CLASS
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);	//TO SCAN THE INPUT\DATA FROM OUTPUT SCREEEN\FROM USER
		int x;
		boolean y;
		double z;
		System.out.println("Enter x value ");
		x=input.nextInt();						//SCANING A INT DATA TYPE
		System.out.println("Enter y vaue ");
		y=input.nextBoolean();					//SCANING A BOOLEAN DATA TYPE
		System.out.println("Enter z value ");
		z=input.nextDouble();					//SCANING A DOUBLE DATA TYPE
		System.out.println("x value is "+x);
		System.out.println("y value is "+y);
		System.out.println("z value is "+z);
	}
}