class pattern11
{
    public static void main(String args[])
    {
        int n= Integer.parseInt(args[0]);

         for(int i=1 ; i<=n ; i++)
        {
            //space loop
            for(int s=1 ; s<=i; s++)
            {
                System.out.print("-");
            }
            //pattern loop
            for(int j=n ; j>=i ; j--)
            {
                System.out.print("*-");
            }
            //new line
            System.out.println();
        }
    }
}