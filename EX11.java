//EX11 TO ACCEPT EMPLOYEE ID,NAME,JOB AND BASIC SALAREY FROM THE USER THEN FIND OUT GROSS SALERY AND NET SALERY OF EMPLOYEE
//HRA-40%,TA-20%,PF-12%,PT-10%,ET-5%  GROSS=BASIC+HRA+TA+ET  NET=GROSS-PF-PT
import java.util.Scanner;
public class EX11
{
	public static void main(String arg[])
	{
		Scanner input=new Scanner(System.in);
		int ID;
		String NAME,JOB;
		double BS,GS,NS,HRA,TA,PF,PT,ET;
		System.out.println("ENTER EMPLOYEE ID ");
		ID=input.nextInt();
		System.out.println("ENTER EMPLOYEE NAME&JOB ");
		NAME=input.next();
		JOB=input.next();
		System.out.println("ENTER EMPLOYEE BASIC SALERY ");
		BS=input.nextDouble();
		HRA=BS*(40/100);
		TA=BS*0.2;
		PF=BS*0.12;
		PT=BS*0.1;
		ET=BS*0.05;
		GS=BS+HRA+TA+ET;
		NS=GS-PF-PT;
		System.out.printf("GROSS SALARY IS(Rs):%.2f\n",GS);		//%.nf WILL ALLOW ONLY 'n' DIGITS AFTER .THIS IS THE ADVANTAGE OF printf
		System.out.printf("NET SALARY IS(Rs):%.3f\n",NS);
	}
}