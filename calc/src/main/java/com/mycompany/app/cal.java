import java.util.Scanner;

public class cal
{
	public static void main(String args[])
	{
		float a,b,res;
		char choice;
		//System.out.println("enter your choice");
		Scanner scan=new Scanner(System.in);

		do
		{
			System.out.println("1. ADD TWO NUMBER");
			System.out.println("2. SUB TWO NUMBER");
			System.out.println("3. MUL TWO NUMBER");
			System.out.println("4.EXIT");
			System.out.println("Enter your choice : ");
			choice=scan.next().charAt(0);
			switch(choice){
				case '1' :  System.out.print("Enter Two Number : ");
							a=scan.nextFloat();
							b=scan.nextFloat();
							res=a+b;
							System.out.println("Result = " + res);
							break;
				case '2' : 	System.out.print("Enter Two Number : ");
							a=scan.nextFloat();
							b=scan.nextFloat();
							res=a-b;
							System.out.println("Result = " + res);
							break;		
				case '3' : 	System.out.print("Enter Two Number : ");
							a=scan.nextFloat();
							b=scan.nextFloat();
							res=a*b;
							System.out.println("Result = " + res);
							break;
				case '4' :  System.exit(0);
							break;

				default :   System.out.print("INVALID CHOICE!!\n");
							break;						
			}
			System.out.print("\n-------------------------------\n");
		}while(choice != 2);

	}
}