


//-----------------BUZZ NUMBER-----------------------

/*class PerfectNumber

{
    public static void main(String args[]){
    int num = Integer.parseInt(args[0]);
    System.out.println(num);
   
       
       
        if(num%10==7||num%7==0)
        {
            System.out.println("buzz number");
        }
       
        else{
            System.out.println("Not a buzz number");
        }
    }

}*/


//------------------------------------EXCEPTION HANDLING -----------------------------------

class PerfectNumber
{
    public static void main(String args[])
    {
        
        int num=0,i,a,c=0;
        for(i=0;i<args.length;i++)
        {
            try 
            {
                 a= Integer.parseInt(args[i]);


            }
            catch(NumberFormatException ex)
            {
                num=num+1;
                System.out.println("inavlid data "+args[i]);
                continue;
            }
            c=c+1;
        }
        System.out.println("valid elemets "+c);
        System.out.println("invalid elemets "+num);
        
      /*  catch(Exception ex)
        {
            System.out.println(ex);
        }*/
    
    }
}



