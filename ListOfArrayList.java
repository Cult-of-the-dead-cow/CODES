import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

class ListOfArrayList
{
    public static void main(String args[])
    {
        /*
        //Declare Object  of List interface
        List<String> list1 = new ArrayList<String>();

        //append items
        list1.add("One");
        list1.add("Two");
        list1.add("Three");

        System.out.println("\nList contents: ");
        for(String temp: list1) {
            System.out.println(temp);
        }
        */

        //store the marks of multiple students in multiple subjects
        Scanner sc = new Scanner(System.in);

        //get the total n.. of students
        System.out.print("Enter total no. of students: ");
        int totalsudents = sc.nextInt();

        //create an ArrayList of List type
        ArrayList<List> collection = new ArrayList<List>();

        //iterate through the no. of students
        for(int i=0 ; i<totalsudents; i++) {
            
            //declare a temp. list
            List<Integer> templist = new ArrayList<Integer>();
            //get the no. of subjecs of the current student
            System.out.print("Enter total no. of subejcts of student "+i+": ");
            int totalsubjectsofcurrentstudent = sc.nextInt();

            //traverse the subjects
            for(int j=0 ; j<totalsubjectsofcurrentstudent; j++)
            {
                //get marks 
                System.out.print("Enter Marks: ");
                int m = sc.nextInt();
                //append this in the temp list
                templist.add(m);
            }

            //append this templist in the min list
            collection.add(templist);    
        }

        //output
        for(List list2: collection)
            {
                for(Object s: list2)
                {
                    System.out.print(s.toString()+"\t");
                }
                System.out.println();
            }
    }
}