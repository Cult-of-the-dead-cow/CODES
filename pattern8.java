class pattern8
{
    public static void main(String args[])
    {
        int n = Integer.parseInt(args[0]);
        
        //outer loop - rows
        for(int i=n ; i>0 ; i--)
        {
           
            //inner loop - cols
            for(int j=0 ; j<i ; j++ )
            {
                //display
                System.out.print(i);
              
            }
            //line break
            System.out.println();
        }
    }
}