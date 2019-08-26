//import classes
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.io.IOException;

class InputOutputDemo
{
    public static void main (String args[])
    {
        //step 1: catch the IOException
        try {
            //Step 2: declare InputStreamReader object
            //InputStreamReader isr = new InputStreamReader(System.in);
            //Step 3: declare object of BufferedReader 
            //BufferedReader br = new BufferedReader(isr);
            //or
            BufferedReader br = new BufferedReader(new InputStreamReader((System.in)));

            //get the data from the console using:
            //String var = br.readLine();
            System.out.print("Enter your name: ");
            String name = br.readLine();

            System.out.println("Name: "+name);

            System.out.println("Enter the height");
            float height =  Float.parseFloat(br.readLine());
            System.out.print("Height: "+height+" feets");

            System.out.println("Enter your age: ");
            int age= Integer.parseInt(br.readLine());
            System.out.print("Age: "+age);
            
        }   
        catch(IOException ex) {
            System.out.println("IOException. "+ex.getMessage());
        }    
    }
}