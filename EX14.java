//EX14 ON FOR EACH LOOP
public class EX14
{
	public static void main(String arg[])
	{
		int a[]={1,2,3,4,5};
		//for (int i=0;i<=4;i++)		C METHOD OF WRITING
		//System.out.println(a[i]);
		int s=0;
		for(int t:a)	//ONLY FOR EXTRACTING DATA FROM ARRAYS AND DATA STRUCTURES WITHOUT KNOWING BEGINING AND ENDING LOCATIONS
		{				//NOT USEFUL FOR SAVING DATA
			System.out.printf(t);
			s=s+t;
		}
		System.out.println("SUM OF NUMBERS "+s);
	}
}