/*
2D array: a finite collection of 1D arrays
3D array: a finite collection of 2D arrays
nD array: a finite collection of (n-1)D arrays

2D array declaration syntax:
datatype[][] arrayname = new datatype[m][n];

m,n: can be int constants / variables
m: no. of 1D arrays in the collection (rows)
n: size of each 1D array. (cols)

3D array declaration syntax:
datatype[][][] arrayname = new datatype[m][n][p];

*/
import java.util.Scanner ;

class Array2DDemo
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);

        //dynamic memory allocation
        int[][] marks = new int[3][4];  //3 students * 4 subjects each
        
        System.out.println("Total no. of students / rows: " + marks.length);
        System.out.println("Total no. of subjects / cols in row 0: " + marks[0].length);
        System.out.println("Total no. of subjects / cols in row 1: " + marks[1].length);
        System.out.println("Total no. of subjects / cols in row 2: " + marks[2].length);

        //input loop
        for(int i=0;i<marks.length;i++)
        {
           for(int j=0;j<marks[i].length;j++)
           {
            System.out.println("Enter the number = ");
            marks[i][j]=sc.nextInt();               
           }
        }

        //output
        //outer loop - rows
        for(int i=0 ; i<marks.length ; i++)
        {
            //inner loop - cols
            for(int j=0 ; j<marks[i].length ; j++)
            {
                System.out.print("\t"+marks[i][j]);
            }
            //ne line
            System.out.println();
        }
       
        //dynamic memory deallocation
        marks = null;
    }
}