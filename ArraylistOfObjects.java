import java.util.ArrayList;
import java.util.Scanner;

//class definition
class  Student
{
    //data members
    private int roll;
    private String name;
    //member methods
    public void set(int r, String n) {
        roll = r;
        name = n;
    }
    public void show() {
        System.out.println("\nStudent Details:\nRoll: "+roll+"\tName: "+name);
    }
}

class ArraylistOfObjects
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //declare an ArrayList of Student type
        ArrayList<Student> allstudents = new ArrayList<Student>();

        //get the number of students
        System.out.print("Enter number of students: ");
        int totalstudents = sc.nextInt();

        //input
        for(int i=0 ; i<totalstudents; i++) {
            System.out.println("\nEnter Student "+i+"'s record: ");
            //get data from user
            System.out.print("Enter roll: ");
            int r = sc.nextInt();
            System.out.print("Enter name: ");
            String n = sc.next();
            //create a temp object
            Student tempobj = new Student();
            //fill data into the temp object
            tempobj.set(r, n);
            //add this temp object in the ArrayList
            allstudents.add(tempobj);
        }

        //output
        for(Student tobj: allstudents) {
            tobj.show();
        }

    }
}