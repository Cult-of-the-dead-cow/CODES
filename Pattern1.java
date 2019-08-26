class Pattern1
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        
        //outer loop - rows
        for(int i=1 ; i<=n ; i++)
        {
            //inner loop - cols
            for(int j=1 ; j<=i ; j++)
            {
                //display
                System.out.print("*");
            }
            //line break
            System.out.println();
        }
    }
}