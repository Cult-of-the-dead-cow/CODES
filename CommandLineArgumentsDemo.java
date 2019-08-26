/*
Command Line Arguments:
->is a method to take user input at the time of running a java program at the command line.
->when we pass CLA a String array gets auto created and initialzied with the same value as the passed CLA. the 
size of this array = the no. of CLA passed.


Type COnversion (String to int):
--------------------------------
intvar = Integer.parseInt( Stringvar );

Integer: a built in class that represents the int
parseInt(): a built in method that converts a String to int


Type COnversion (String to float):
--------------------------------
floatvar = Float.parseFloaat( Stringvar );

Float: a built in class that represents the float
parseFloat(): a built in method that converts a String to float



Type COnversion (String to Double):
--------------------------------
doublevar = Double.parseDouble( Stringvar );

Double: a built in class that represents the double
parseDouble(): a built in method that converts a String to double

*/

class CommandLineArgumentsDemo
{
    public static void main(String args[])
    {
        String fname = args[0];
        String lname = args[1];
        int age    = Integer.parseInt(args[2]);
        float height =  Float.parseFloat(args[3]);
        
        System.out.println("Name ="+fname+" "+lname);
        System.out.println("Age ="+age+" years");
        System.out.println("Height ="+height+" cms");
 
    }
}