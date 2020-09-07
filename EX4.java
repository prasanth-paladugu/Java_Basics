//EX4 ON VARIABLE DECLARATIONS
class EX4										//MAIN CLASS
{
	static int x;								//STATIC DECLATION OF VARIABLE
	int y;
	public static void main(String[]args)
	{
		int n;
		//System.out.println("N value is "+n); local variable should be intialised by user global variable is initialized by JVM
		//System.out.println("Y value is "+y); non static y cannot be used in static method
		System.out.println("X value is "+x);	// x is static and declared globally
	}
}