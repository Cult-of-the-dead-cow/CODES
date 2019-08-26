/*
method overloading:
->in OOP, we can define multiple methods with the same name but with different definitions
->this is only possible when we meet the method overloading rules:
    1. compiler matches the name of the method in the call and the definition
    2. compiler matches the number of arguments in the call and the definition.
    3. compiler matches the data type of arguments in the call and the definition.
    4. compiler matches the calling object of the method
*/

import java.util.Scanner;

class Test
{
    //method definition with 1 int argument
    public int area(int side)
    {
        return side * side;
    }
    //methd definition with 2 int arguments
    public int area(int len, int wid)
    {
        return len * wid;
    }
    //method definition with 1 float argument
    public float area(float r) 
    {
        return 22.0F/7.0F*r*r;
    }
}

class Student
{
    public void fun()
    {
        System.out.println("Inside Student's fun()");
    }
}

class Teacher
{
    public void fun()
    {
        System.out.println("Inside Teacher's fun()");
    }
}

class MethodOverloadingDemo
{
    public static void main(String args[])
    {

        Student sobj = new Student();

        Teacher tobj = new Teacher();

        sobj.fun();     //method: fun()     calling object: sobj    class of calling obj: Student

        tobj.fun();     //method: fun()     calling object: tobj    class of calling obj: Teacher

        Scanner sc = new Scanner(System.in);
        Test obj = new Test();

        //square
        System.out.print("Enter side of square: ");
        int side = sc.nextInt();
        int ar1 = obj.area(side);
        System.out.println("Area of square: "+ar1);

        //rectangle
        System.out.print("Enter Length of rectangle: ");
        int len = sc.nextInt();
        System.out.print("Enter Width of rectangle: ");
        int wid = sc.nextInt();
        int ar2 = obj.area(len, wid);
        System.out.println("Area of rectangle: "+ar2);

        //circle
        System.out.print("Enter radius of circle: ");
        float r = sc.nextFloat();
        float ar3 = obj.area(r);
        System.out.println("Area of Circle: "+ar3);
    }
}