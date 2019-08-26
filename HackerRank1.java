import java.io.InputStreamReader;
import java.io.BufferReader;
import java.io.IOException;
Import java.io.IOException;
class HackerRank1
{
    public static void main(String args[])
    {
        try{
            BufferReader br= new BufferReader(new InputStreamReader(System.in));
            int n=Integer.parseInt(br.readLine());
            for(n=0; n<=5;i++)
            {
                String str = br.readLine();

                //split the string
                String[] strarr = str.split(" ");
                //get the size of the ArrayList
                int listsize = strarr[0];
                //check size of teh arraylist eneterd
                if(listsize != 0) {
                    //traverse through the data entered
                    for(int i=1 ; i<strarr.length; i++) {
                        //get the data
                        int val = Integer.parseInt( strarr[i] );
                        //append in the ArrayList
                        
                    }
                }
            }
            
        }
        catch(IOException ex) {

        }
    }
}