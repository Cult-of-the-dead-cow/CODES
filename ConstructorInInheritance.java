class Box
{
    private float l,w,h;
    public float vol;

    public Box()
    {
        System.out.println("Inside default constructor of Box class");
        l=1.0F;
        w=1.0F;
        h=1.0F;
        vol=1.0F;
    }
    public Box(float a, float b, float c)
    {
        System.out.println("Inside parametrised constructor of Box class");
        l=a;
        w=b;
        h=c;
        vol=l*w*h;
    }
    public void show()
    {
        System.out.println("Vol = " +vol);
    }
}

class Box2 extends Box
{
    private float den,mass;
    public Box2()
    {
        System.out.println("Inside default constructor of Box2 class");
        den=1.0F;
        mass=1.0F;
    }
    public Box2(float a, float b, float c,float d)
    {
        //super class para constructor call
        super(a,b,c);       //Box's para constructor
        System.out.println("Inside paramertised constructor of Box2 class");
        den=d;
        mass=den * vol;
    }
    public void show()
    {
            //calling the super class same signature method
            super.show();
            System.out.println("Mass = " +mass);
    }
}

class ConstructorInInheritance
{
    public static void main(String args[])
    {
        //situation 1:
        //declaring an object of the sub class and calling the default constructor
        //observation of situation 1: before the execution of the sub class default constructor, the super class default constructor
        //gets implicitly called / auto called.
        //Box2 obj = new Box2();      //Box()     ->      Box2()

        //situation 2: 
        //declaring an object of the sub class and calling the parameterized constructor
        //observation of situation 2: before the execution of the sub class parameterized constructor, the super class default constructor
        //gets implicitly called / auto called.
       // float d=4.0F;
        //Box2 obj = new Box2(d);        //Box()      ->      Box2(d)

        //Common Observation 1: whenever we declare an object of the sub class the super class default constructor gets implicitly called.
        //Common Observation 2: using the object of teh sub class, the super class parameterized constructor will never get implicitly called.

        //Situation 3: calling the super class parameterized constructor using the object of the sub class (explicitly)
        //step 1: declare object of Sub class
        //step 2: call the para constructor of the sub class
        //step 3: total no. of arguments = no. of args in the super class para constructor + no. of args in the sub class para constructor
        //step 4: receive all these arguments in the sub class para constructor
        //step 5: call the super class para constructor explicitly using the "super" keyword. Note, this has to be the 1st line
        //of the method.
        float a=1.0F, b=2.0f,c=3.0f,d=4.0F;
        Box2 obj = new Box2(a,b,c,d);

        obj.show();     //Box2's show() as the object "obj" belongs to the class Box2
    }
}