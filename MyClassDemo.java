import java.util.Scanner;

class MyClassDemo{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int a;
		char ch;
		float f;
		String name;
		
		System.out.println("Enter the name  =  ");
		name=sc.nextLine();
		
		System.out.println("Enter the Character  =  ");
		ch=sc.next().charAt(0);
		
		System.out.println("Enter the value of A =  ");
		a=sc.nextInt();
		
		System.out.println("Enter the value of F =  ");
		f=sc.nextFloat();
		
		System.out.println("Name = "+name);	
		System.out.println("Value of A = "+a);	
		System.out.println("Value of F = "+f);	
		System.out.println("Character of ch = "+ch);	
		System.out.println("this is class");	
	}
}