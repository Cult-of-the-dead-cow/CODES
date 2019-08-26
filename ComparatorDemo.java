
package hackerrank1;

import java.util.*;

class Student1
 {
    private int roll,age;
    private String name;
    public int getRoll()
    {
        return roll;
    }
    public int getAge() {
        return age;
    }
    public String getName()
    {
        return name;
    }
    public Student1(int a , int b , String c)
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
 }

//define a class for a compaitor
//implement this class from the Comparator interface
class AgeComparator implements Comparator<Student1>{

    ///override the Comparator's method 
    @Override
    public int compare(Student1 o1, Student1 o2) {
        //if the current obejct (this) and the argument object (o) are equal - return 0
        //if the current obejct (this) > the argument object (o)  - return +1
        //if the current obejct (this) < the argument object (o)  - return -1
        if(o1.getAge() == o2.getAge()) {
            return 0;
        }
        else if(o1.getAge() > o2.getAge()) {
            return 1;
        }
        else 
        {
            return -1;
        }
    }
    
    
}

class RollComparator implements Comparator<Student1>{
        

        @Override
        public int compare(Student1 o1, Student1 o2) {
            if(o1.getRoll() >o2.getRoll())
            {
                return 1;
            }
            else if(o1.getRoll()==o2.getRoll())
            {
                return 0;
            }
            else
            {
                return -1;
            }
        }
    }

class NameComparator implements Comparator<Student1>{
        

        @Override
        public int compare(Student1 o1, Student1 o2) {
            int res = o1.getName().compareTo(o2.getName());
            if(res==0)
            {
                return 0;
            }
            else if(res>0)
            {
                return 1;
            }
            else
            {
                return -1;
            }
        }
    }


public class ComparatorDemo 
{
public static void main (String args[])
{
 ArrayList<Student1> arraylist= new ArrayList<Student1>();
  arraylist.add(new Student1(25,19,"Ishu Thakur"));
  arraylist.add(new Student1(02,17,"Lina Andersson"));
  arraylist.add(new Student1(56,20,"Sunny"));
  
  for(Student1 temp: arraylist)
  {
      temp.show();
  }
  
  Collections.sort(arraylist, new NameComparator());
  
  for(Student1 temp: arraylist)
  {
      temp.show();
  }
          
}
}