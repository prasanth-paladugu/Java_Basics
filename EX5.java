//EX5 ON OPERATORS
public class EX5										//MAIN CLASS
{
	public static void main(String args[])
	{
		int x,y;										//DECLARING VARIABLES
		x=100;											//INTIALIZING VARIABLES
		y=45;
		System.out.println("Sum is "+(x+y));			//ALL OPERATIONS
		System.out.println("Diff is "+(x-y));
		System.out.println("Prod is "+(x*y));
		System.out.println("x/y is "+(x/y));
		System.out.println("Rem is "+(x%y));
		System.out.println("x<y is "+(x>y));
		System.out.println("y<0 is "+(y<0));
		System.out.println("x>=0 or x<=0 "+(x>=0||x<=0));
		System.out.println("y>=0 and y>=50 "+(y>=0&&y>=50));
		System.out.println("2 Times Right Shift of x "+(x>>2));
		System.out.println("5 Times Left Shift of y "+(y<<5));
		System.out.println("x AND y "+(x&y));
		System.out.println("x OR y "+(x|y));
		System.out.println("x XOR y "+(x^y));
		System.out.println("y negation "+(~y));
		System.out.println("x Post Increment "+(x++));	//x IS FIRST PRINTED THEN INCREMENTED
		System.out.println("x Pre Increment "+(++x));	//x IS FIRST INCEMENTED THEN PRINTED
		System.out.println((x>=0?"Postive number":"Negative number")); // IF CONDTION TRUE PRINT FIRST MESSAGE CONDITION FALSE PRINT SECOND MESSAGE

	}
}

