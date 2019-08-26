import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class HackerRank2
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        ArrayList<List> collection= new ArrayList<List>();
        
        for(int i=0; i<n;i++)
        {
            List<Integer> temp= new ArrayList<Integer>();
                int x= sc.nextInt();                            //rows
            
                if(x!=0)
                {
                    for(int j=0;j<x;j++)
                        {
                            int y=sc.nextInt();                 //columns
                            temp.add(y);
                        }
                }
                else 
                {
                    System.out.println("Error");
                }

                collection.add(temp);
        }
        

        for(List list: collection)
        {
            for(Object list1: list )
            {
                System.out.println(list);
            }
        }
    }
}