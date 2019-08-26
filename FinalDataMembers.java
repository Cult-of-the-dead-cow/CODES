//final data memberse
/*
->spl. data members
->the final data member declaration is prefixed with the final keyword
->the naming convention for a final data member is UPPERCASE
->we must initialize a final data member at it's declaration time. 
->we cannot alter / change the value of the final data member. we can consume though.
*/

class Test
{
    //final data member declaration
    final public int DATA=100;
}

class FinalDataMembers
{
    public static void main(String args[])
    {
        //object declaration
        Test t1 = new Test();
        System.out.println(t1.DATA);
        //t1.DATA = t1.DATA + 100;      //illegal
        int x = t1.DATA + 100;          //legal
    }
}