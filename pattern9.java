class pattern9
{
    public static void main(String args[])
    {
            int n=Integer.parseInt(args[0]);
            
            for(int i=1 ; i<=n*2;i+=2)
            {
                
                for(int j=1 ; j<=i ; j++)
                {
                    System.out.print(i);
                   
                }
                System.out.println();
            }
    }
}