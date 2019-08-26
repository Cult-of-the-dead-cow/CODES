import java.util.Scanner;

//class definition
 class Time
 {
    private int min;
    private int sec;
     public void set(int m,int s)
     {
         min = m;
         sec = s;
    }
    public void show()
    {
        System.out.print("Time ="+min);
        System.out.print(":"+sec);
    }
}

//main class definition
class ContructorDemo
    {
      Scanner sc=new Scanner(System.in);
            public static void main(String args[])
            {

                int min=0,sec=0;
                Time tobj = new Time();
                tobj.set(min,sec);
                tobj.show();
            }
        }