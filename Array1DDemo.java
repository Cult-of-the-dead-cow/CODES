/*
Array is a sequential memory block that is capable of storing multiple constants of the same data type under
the same name.

Array 1 dimensional

Array Reference variable declaration:
-------------------------------------
datatype[] arrayname;           
or
datatype arrayname[];

Dynamic Memory allocation for the array:
---------------------------------------
arrayname = new datatype[size];

note: the data type of the LHS and RHS have to be same.
size can be an int constant or a variable.

or

datatype[] arrayname = new datatype[size];


new:
->new creates an unnamed array memory block based on the size and the data type.
->then, new assigns the reference of the unnamed array memory to the refeence array var.
this makes the array reference var as the official representative of the unnamed array memory. ie we can access the
unnamed array memory using the array reference var.

->we cannot access the array as a whole. we can only access the array block by block where each block has a unique name.
block name:     arrayname[index]

array dynamic memory deallocation
        //arrayname = null;

->the above statement, assigns null to the array reference var.
->this breaks the link between the unnamed array memory and the array reference variable.
->the java garbage collector detects that the unnamed array memory is now free and then hands over the control of this 
freed up memory to the OS for further use.
->after dynamic memory deallocation, we cannot access the unnamed array memory.
*/
import java.util.Scanner;
class Array1DDemo
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //reference array var declarations
        int[] arr;

        //dynamic memory allocation
        arr = new int[5];
        
        //get the length of the array
        //arrayname.length
        System.out.println("Array Length: "+arr.length);
        
        //input
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print("Enter element: ");
            arr[i] = sc.nextInt();
        }

        

        //output
        for(int i=0 ; i<arr.length ; i++)
        {
            System.out.print("\t"+arr[i]);
        }

        //array dynamic memory deallocation
        //arrayname = null;
        arr = null;
    }
}