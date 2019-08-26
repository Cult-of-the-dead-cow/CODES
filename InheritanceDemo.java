abstract class Shape
{
    public float r,h,vol;
   
    public void set(float a, float b)
    {
        r=a;
        h=b;
    }
    
    public void show()
    {
        System.out.println("Volume : "+vol);
       
    }

    public abstract void calculateVol();

}
class Cone extends Shape
{
   
    public void calculateVol()
    {
        vol=(3.14F*r*r*h)*1.0F/3.0F;
    }
    
}
class Cylinder extends Shape
{

    public void calculateVol()
    {
        vol=3.14F*r*r*h;
    }

}
class InheritanceDemo
{
    public static void main(String args[])
    {
        //Shape sh1 = new Shape();  //illegal
        Cone cn1 = new Cone();
        cn1.set(1.0F, 2.0F);
        cn1.calculateVol();
        cn1.show();

        Cylinder cy1 =new Cylinder();
        cy1.set(1.0F, 2.0F);
        cy1.calculateVol();
        cy1.show();
    }
}