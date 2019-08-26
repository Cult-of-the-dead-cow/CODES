import java.util.Scanner;

//class definition
class Student
{
    //data member declarations
    private int roll;
    private String name;
    private float m1;
    private float m2;
    private float per=0.0F;     //legal
    //default constructor definition
    public Student()
    {
        System.out.println("\nInside default constructor definition\n");
    }
    //member method definitions
    public void setValues()
    {
        //input
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter roll: ");
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
        System.out.println("Name: "+name);
        System.out.println("Rollno: "+roll);
        System.out.println("Marks 1: "+m1);
        System.out.println("Marks 2: "+m2);
        System.out.println("Per: "+per);
    }
}

//main class definition
class ClassDemo1
{
    public static void main(String args[])
    {
        //object declaration
        Student o=new Student();        //default constructor call
        //o.Student();        //illegal
        //calling member methods
        o.setValues();
        o.calculate();
        o.getValues();
        //o.per = 0.0F;   //illegal as per is private
        //dynamic memory deallocation
        //objectname = null;
        o=null;
        
        Student o1=new Student();
        o1.setValues();
        o1.calculate();
        o1.getValues();
        o1 = null;
    }
}