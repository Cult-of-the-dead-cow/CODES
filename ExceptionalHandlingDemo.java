import java.util.Scanner;
import java.util.InputMismatchException;

class ExceptionalHandlingDemo
{
    public static void main(String args[])
    {
        System.out.println("Program Starts");
        int a,b,y;
        Scanner sc= new Scanner(System.in);
        try
        {
            try
            {
                int[] arr = {10,20,30};
                System.out.println(arr[0]);
                System.out.println(arr[8]);
            }
            catch(ArrayIndexOutOfBoundsException ex) 
            {
                System.out.println("Cannot access an array beyind it's size.");
            }

            System.out.println("Enter numbers: ");
            a=sc.nextInt();
            b=sc.nextInt();
            y=a/b;
            System.out.println("Division = "+y);
        }
        catch(ArithmeticException ex)
        {
            System.out.println("Division by 0 is not allowed.");
        }                       
        catch(InputMismatchException ex) 
        {
            System.out.println("Invalid Input given!");
        }
        catch(Exception ex) 
        {
            System.out.println("Exception! "+ex);
        }
        finally
        {
            System.out.println("Inside finally!");
        }
        System.out.println("Program Starts");
    }
}