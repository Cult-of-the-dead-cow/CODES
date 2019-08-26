import java.util.Scanner;
class Student
{
    //data member declarations
    private int roll;
    private String name;
    private float m1;
    private float m2;
    private float per;
    //member method definitions
    public void setValues()
    {
        System.out.println("Enter Student Information: ");
        //input
        Scanner sc = new Scanner(System.in);
        System.out.print("\nEnter roll: ");
        roll = sc.nextInt();
        System.out.print("Enter name: ");
        name = sc.next();
        System.out.print("Enter Marks 1: ");
        m1 = sc.nextFloat();
        System.out.print("Enter Marks 2: ");
        m2 = sc.nextFloat();
    }
    public void calculate() 
    {
        per = (m1+m2)/180F*100F;
    }
    public void getValues()
    {
        System.out.println("\nStudent Information:");
        System.out.println("Name: "+name);
        System.out.println("Rollno: "+roll);
        System.out.println("Marks 1: "+m1);
        System.out.println("Marks 2: "+m2);
        System.out.println("Per: "+per);
    }
}
class ArrayOfObjects
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);

        //get array size
        System.out.print("Enter no. of students: ");
        int n = sc.nextInt();

        //declaring an array of objects
        //datatype[] arrayname = new datatype[size];
        Student[] arr = new Student[n];

        //instantiate all the objects individually
        /*arr[0] = new Student();
        arr[1] = new Student();
        arr[2] = new Student();*/
        for(int i=0 ; i<n ; i++) {
            arr[i] = new Student();
        }

        //input
        for(int i=0 ; i<n ; i++) {
            arr[i].setValues();
            arr[i].calculate();
        }

        //output
        for(int i=0 ; i<n ; i++) {
            arr[i].getValues();
        }

    }
}