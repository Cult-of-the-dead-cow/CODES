//creating user defined exceptions

import java.util.Scanner;

//step 1: define a class that represents the exception
//step 2: inherit this class from any built in exception class 
class InvalidCorrdinateException extends ArrayIndexOutOfBoundsException
{
    //step 3: optional - set the default error message
    //step 3.1.: define a constructor
    public InvalidCorrdinateException()
    {
        //step 3.2.: call the super class para constructor and pass the default error message 
        super("Invalid Corrdinate Detected!, Both, x and y need to be +ve!");
    }
}

class Coordinate
{
    private int x,y;
    public void set(int a,int b)
    {
        //step 4: detect the problem
        if(a<0)
        {
            //problem with x
            //step 5: explicitly raise the user defined exception
            //throw new ExceptionClassName();
            throw new InvalidCorrdinateException();
        }
        else
        {
            //no problem with x
            x = a;
        }
        
        if(b<0)
        {
            //problem with y
            throw new InvalidCorrdinateException();
        }
        else
        {
            //no problem with y
            y = b;
        }
    }
    public void show()
    {
        System.out.println("Coordinate is ("+x+","+y+")");
    }
}
class UserDefineData
{
    public static void main(String args[])
    {
        try 
        {
            Scanner sc= new Scanner(System.in);
            System.out.print("Enter x: ");
            int x = sc.nextInt();
            System.out.print("Enter y: ");
            int y = sc.nextInt();
            Coordinate obj=new Coordinate();
            obj.set(x,y);
            obj.show();
        }
        catch(InvalidCorrdinateException ex) {
            System.out.println(ex);
        }
    }
}