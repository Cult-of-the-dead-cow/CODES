/*
Constructors:
->spl. member methods
->name of the constructos = same as class
->we cannot return anything from a constructor. no return data type. not even void.
->diff. types of constructors:
    ->default constructor: constructor with no arguments
    ->parameterized constructor: constructor with arguments
->constructor has to be public only
->we cannot call a constructor like a regular member method.
->the constructor member method gets auto called when we instantiate a class (when we declare
an object of the class using new)
->for an object, a constructor will only be called once, at the time of object declaration.

*/

//class definition
 class Time
 {
    private int min;
    private int sec;
    //default constructor definition
    public Time() {
        System.out.println("Inside Default COnstructor!");
    }
    //parameterized constructor definition (2 int args)
    public Time(int m,int s)
    {
        System.out.println("Inside Parameterized COnstructor with 2 int args!");
        min = m + (s/60);
        sec = s % 60;
   }
   //parameterized constructor definition (1 int arg)
   public Time(int s)
   {
        System.out.println("Inside Parameterized COnstructor with 1 int arg!");
        min = s / 60;
        sec = s % 60;
   }
    public void set(int m,int s)
     {
         min = m + (s/60);
         sec = s%60;
    }
    public void show() {
        System.out.print("Time ="+min);
        System.out.println(":"+sec);
    }
}

//main class definition
class ContructorDemo2
    {
            public static void main(String args[])
            {
                Time tobj = new Time();     //object declaration //default constructor call
                //tobj.Time();        //illegal
                tobj.set(10,60);
                tobj.show(); 
                
                Time tobj2 = new Time();    //object declaration //default constructor call
                tobj2.show();

                Time tobj3 = new Time(7,35);    //object declaration //para constructr call (2 args)
                tobj3.show();

                Time tobj4 = new Time(126);     //object declaration //para constructor call (1 arg)
                tobj4.show();
            }
        }