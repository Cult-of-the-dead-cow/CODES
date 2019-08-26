import java.util.Scanner;

class average
{
    public static void main(String args[])
    {
        
        int average=0;
        int sum=0;
        //scanning th array size
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of array");
        int n=sc.nextInt();
        int a[];
        a= new int[n];
        

        //printing the numbers 
        for(int i =0; i<a.length; i++)
        {
            System.out.print("Enter the numbers: ");
            a[i]=sc.nextInt();
        }

        //logic for taking the average
        for(int i =0; i<a.length ; i++)
        {
            sum+=a[i];
            average=sum/a[i];
        }

        System.out.println("the sum of numbers is= " +sum);
        System.out.println("the average of numbers is = "+average);
        
        
    }
}