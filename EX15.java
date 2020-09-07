//EX15 ON LABELIING LOOPS(GIVING NAME TO LOOPS)
import java.util.Scanner;
public class EX15
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		System.out.println("ENTER ANY VALUE ");
		int n=input.nextInt();
		int i=0;
		int j=0;								// j=1 IN WHILE LOOP
		pandu:									// NAMEING OR LABELING A LOOP
		for(i=0;i<=n;i++)						// DECLARING A FOR LOOP
		{
			if(i==2 || i==4|| i==6 || i==8)
			{
				continue pandu;					//CONTINUE STOPS THE CURRENT ROUND AND JUMPS TO PANDU(LABEL)
			}
			System.out.println("i="+i);
		}
		prasanth:								// NAMEING OR LABELING A LOOP
		while(j<n)								// DECLARING A WHILE LOOP //IF j=1 THEN j<=n
		{
			j++;								//IF j=1 HERE NO j++
			if(j==5 || j==3|| j==5 || j==9)
			{
				continue prasanth;				//CONTINUE STOPS THE CURRENT ROUND AND JUMPS TO PANDU(LABEL) //IF j=1 THEN j++
			}
			System.out.println("j="+j);			//IF j=1 THEN j++ HERE ALSO
		}
	}
}