import java.util.Scanner;


class sum
{
    public static void main(String args[])
    {
        int sum=0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        
        int a[];
        a=new int[n];

        for(int i=0; i<a.length ; i++)
        {
            System.out.println("Enter the numbers");
            a[i]=sc.nextInt();
        }
          
        for(int i=0; i<a.length;i++)
        {
          sum+=a[i];
        }
        System.out.println("sum : "+sum);

    }
}