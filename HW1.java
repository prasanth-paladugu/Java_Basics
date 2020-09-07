//HW1 ON SWAPPING OF TWO NUMBERS WITHOUT USING THIRD VARIABLE
import java.util.Scanner;
public class HW1
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("Enter a value");
		int a=input.nextInt();
		System.out.println("Enter b value");
		int b=input.nextInt();
		a=a+b;								//Swapping using + and - operators
		b=a-b;
		a=a-b;
		System.out.println("a,b values after SWAPPING \n"+a+" "+b);
		System.out.println("Enter p value");
		int p=input.nextInt();
		System.out.println("Enter q value");
		int q=input.nextInt();
		p=p^q;								//Swapping using XOR(bitwise) operator
		q=p^q;
		p=p^q;
		System.out.println("p,q values after SWAPPING \n"+p+" "+q);
		System.out.println("Enter x value");
		int x=input.nextInt();
		System.out.println("Enter y value");
		int y=input.nextInt();
		x=x*y;								//Swappping using * and / operator
		y=x/y;
		x=x/y;
		System.out.println("x,y values after SWAPPING \n"+x+" "+y);

	}
}