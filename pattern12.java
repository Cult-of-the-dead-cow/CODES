class pattern12
{
    public static void main(String args[])
    {
        int n= Integer.parseInt(args[0]);

         for(int i=1 ; i<=n ; i++)
        {
            
            //space loop
            for(int s=n-1 ; s>=i ; s--)
            {
                System.out.print(" ");
            }

             //pattern loop
             for(int j=1 ; j<=i ; j++)
             {
                 System.out.print("* ");
             }

             //new line
             System.out.println();

        }

        for(int i=2 ; i<=n ; i++)
        {
            //space loop
            for(int s=2 ; s<i; s++)
            {
                System.out.print(" ");
            }
            //pattern loop
            for(int j=n ; j>=i ; j--)
            {
                System.out.print(" *");
            }
            //new line
            System.out.println();
        }
    }
}