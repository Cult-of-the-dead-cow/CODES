/*
Jagged Array is a 2D array where each row can have different number of columns.
*/
import java.util.Scanner;
class JaggedArrayDemo
{
    public static void main(String args[])
    {
        Scanner sc=new Scanner(System.in);

        //declare the jagged array by just supplying the rows and not the columns
        //datatype[][] arrayname  =  new datatype[rows][];
        int[][] arr = new int[3][];

        //declare each row individually
        //arrayname[rowindex] = new datatype[no_of_cols];
        arr[0] = new int[3];
        arr[1] = new int[2];
        arr[2] = new int[4];

        System.out.println("Total no. of rows: " + arr.length);                 //3
        System.out.println("Total no. of  cols in row 0: " + arr[0].length);    //3
        System.out.println("Total no. of  cols in row 1: " + arr[1].length);    //2
        System.out.println("Total no. of  cols in row 2: " + arr[2].length);    //4

        //input
        for(int i=0;i<arr.length;i++)
        {
            for(int j=0; j<arr[i].length ;j++)
            {
                System.out.println("Enter the numbers = ");
                arr[i][j]=sc.nextInt();
            }
        }

        //output
        //outer loop - rows
        for(int i=0 ; i<arr.length ; i++)
        {
            //inner loop - cols
            for(int j=0 ; j<arr[i].length ; j++)
            {
                System.out.print("\t"+arr[i][j]);
            }
            System.out.println();
        }

        //dynamic memory deallocation
        arr = null;
    }   
}