//EX19 ON USER DEFINED METHODS USING RETURN
import java.util.Scanner;
public class EX19
{
	static int natSum(int n)							//INT REPLACES VOID BECAUSE AN INTEGER VALUE IS RETURNED
	{													//USER DEFINED METHOD
		int s;
		s=n*(n-1)/2;
		return s;										//RETURN THE VALUE TO THE MAIN FUNCTION
	}
	public static void main(String [] arg)				//MAIN METHOD
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter n VALUE");
		int n=input.nextInt();
		System.out.println("Enter x VALUE");
		int x=input.nextInt();
		System.out.println("Enter y VALUE");
		int y=input.nextInt();
		int s=natSum(n);								//CALLING THE METHOD AND STORING THE RETURN VALUE FOR FUTURE USE
		System.out.println("SUM IS "+s);
		System.out.println("SUM IS "+natSum(20));		//ONE METHOD OF CALLING AND DIRECTLY PRINTING THE OUTPUT WITHOUT STORING
		int d=diff(x,y);
		System.out.println("DIFFERENCE IS "+d);
	}
	static int diff(int x,int y)						//USER DEFINED METHOD 2 WE CAN CALL BEFORE OR AFTER THE MAIN METHOD
	{
		int d;
		return d=x-y;									//CALUCULATING AND RETURNING IN SAME STEP
	}
}