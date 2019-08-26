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
        if(sec>60)
        {
            sec=sec/60;
            min=min+sec;
            System.out.print("Time ="+min);
        System.out.print(":"+sec);
        
        }
        else
        {
        System.out.print("Time ="+min);
        System.out.print(":"+sec);
        }
    }

}

//main class definition
class ContructorDemo2
    {
            public static void main(String args[])
            {
                Scanner sc=new Scanner(System.in);
                System.out.print("Enter min: ");
                int m = sc.nextInt();
                System.out.print("Enter sec: ");
                int s = sc.nextInt();
                Time tobj = new Time();
                tobj.set(m,s);
                tobj.show();
            }
        }