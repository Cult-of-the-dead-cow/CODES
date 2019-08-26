/*
interface:
->user defined data type
->like classes, we have interface definitions
->inside an interface definition, we can only declare final data members. we cannot declare regular data members inside an interface
->inside an interface definition, we can only declare a member method. we cannot define a member method inside an interface definition.
->we cannot instantiate an interface, cannot declare it's object using new.

interface definition syntax:
----------------------------
interface InterfaceName
{
    final data_member declaration;
    member_method_declaration();
}

->we can inherit aninterface to a class using the "implements" keyword
->all the sub classes of an interface MUST DEFINE / MUST OVERRIDE all the interface methods. 
->we can inherit from multiple interfaces using the implements keyword.
->We can inherit an interface into another interface using the "extends" keyword

*/

//interface definition
interface IFace1
{
    //final data member declaration
    final int DATA=100;
    //member method declaration
    void fun1();
}

//innterface definition
interface IFace2
{
    void fun2();
}

//innterface definition
interface IFace3
{
    void fun3();
}

//innterface definition
interface IFace4 extends IFace3
{
    void fun4();
}

//class definition
class Test
{
    public void fun5()
    {
        System.out.println("Inside fun5().");
    }
}

//sub class definition
class MyClass extends  Test implements IFace1, IFace2, IFace4 
{
    //overriding the interface method
    public void fun1()
    {
        System.out.println("Inside fun1(). data: "+DATA);
    }
    public void fun2()
    {
        System.out.println("Inside fun2().");
    }
    public void fun3()
    {
        System.out.println("Inside fun3().");
    }
    public void fun4()
    {
        System.out.println("Inside fun4().");
    }
}

class InterfaceDemo
{
    public static void main(String args[])
    {
        //IFace1 obj = new IFace1();        //illegal
        
        MyClass obj = new MyClass();
        obj.fun1();
        obj.fun2();
        obj.fun3();
        obj.fun4();
        obj.fun5();
    }
}