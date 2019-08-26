import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    public static int showHourGlasses(int row, int col, int[][] arr) {
        int sum=0;
        int x=0;
        for(int i=row; i<row+3 ; i++){
            for(int j=col; j<col+3; j++) { 
                if((x==1 && j==col) || (x==1 && j==col+2)) {
                    //System.out.print("  ");
                    continue;
                }
                //System.out.print(arr[i][j]+" ");
                sum = sum + arr[i][j];
            }
            //System.out.println();
            x++;
        }
        return sum;
    }


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int[][] arr = new int[6][6];

        for (int i = 0; i < 6; i++) {
            String[] arrRowItems = scanner.nextLine().split(" ");
            scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

            for (int j = 0; j < 6; j++) {
                int arrItem = Integer.parseInt(arrRowItems[j]);
                arr[i][j] = arrItem;
            }
        }

        for(int i=0;i<6;i++)
        {
            for(int j=0;j<6;j++)
            {
                System.out.print(arr[i][j]+" " );
            }
            System.out.println();
        }
    
        //show all the hourglasses
        int row, col;
        int max=9999;
        for(row = 0 ; row<6-2; row++) 
        {
            for(col=0 ; col<6-2; col++) 
            {
                System.out.println();
                int res = showHourGlasses(row, col, arr);

                ///this code is to store the 1st num in max///
                if(max == 9999) {
                    max = res;
                }
                //////////////////////////////////////////////
                
                if(res > max) {
                    max = res;
                }
                System.out.println("Sum = "+res);
            }
        }

        System.out.println("\nHighest Sum: "+max);
        
        

        scanner.close();
    }
}
