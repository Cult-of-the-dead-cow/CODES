
package hackerrank1;

import java.util.ArrayList;
import java.util.Collections;

//implement the class with Comparable

class Student implements Comparable<Student>{
    private int roll,age;
    private String name;
    public Student(int a , int b , String c)
    {
        roll = a;
        name = c;
        age = b;
    }
    public void show()
    {
        System.out.print("\nName : "+name);
        System.out.print("\tAge : "+age);
        System.out.println("\tRollNo. : "+roll);
    }

    //override tthe compareTo()
    @Override
    public int compareTo(Student o) {
        //if the current obejct (this) and the argument object (o) are equal - return 0
        //if the current obejct (this) > the argument object (o)  - return +1
        //if the current obejct (this) < the argument object (o)  - return -1
        if(this.age == o.age) 
            return 0;
        else if(this.age > o.age)
            return 1;
        else 
            return -1;
    }
}

public class ComparableDemo {
    public static void main(String args[]) {
        ArrayList<Student> arrlist = new ArrayList<Student>();
        
        arrlist.add(new Student(100, 20, "Tarun"));
        arrlist.add(new Student(101, 15, "Amit"));
        arrlist.add(new Student(102, 19, "Sumit"));
        arrlist.add(new Student(103, 16,"Anil"));
        
        Collections.sort(arrlist);
        
        for(Student tempobj: arrlist) {
            tempobj.show();
        }
    }
}

//siddharth@nictchd.in