//EX8 ON SCANNING STRING AND CHARACTER VALUES
import java.util.Scanner;							//GIVING ADDRESS OF SCANNER CLASS TO COMPILAR
public class EX8									//MAIN CLASS
{
	public static void main(String arg[])
	{
		String name;
		Scanner input=new Scanner(System.in);
		System.out.println("Enter first name ");
		name=input.next();							//SCANNING STRING WITHOUT WHITE SPACES DIRECTLY FROM USER OR OUTPUT SCREEN
		System.out.println("Enter collage name ");
		String college=input.next();				//DECLARING AND SCANNING AT A TIME TO REDUCE STEPS
		System.out.println("Enter intial");
		char I=input.next().charAt(0);				//SCANNING A CHAR DATA TYPE IS DIFFIRENT TO OTHERS
		System.out.println("Hi"+name+" "+I+" "+college);
	}
}