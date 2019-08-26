//Step 1: import the Scanner built in class
import java.util.Scanner;

class UserInputDemo1
{
	public static void main(String args[])
	{
		//Step 2: declare Scanner object
		//Scanner scannerobject = new Scanner(System.in);
		Scanner sc = new Scanner(System.in);
		
		//String input
		//String var = scannerobject.nextLine();
		System.out.print("Enter your name: ");
		String name = sc.nextLine();
		
		//integer input
		//int var = scannerobject.nextInt();
		System.out.print("Enter your age: ");
		int age = sc.nextInt();
		
		//float input
		//float var = scannerobject.nextFloat();
		System.out.print("Enter your height: ");
		float height = sc.nextFloat();
		
		System.out.println("NAME ="+name);
		System.out.println("NAME ="+age);
		System.out.println("NAME ="+height);
	}
}