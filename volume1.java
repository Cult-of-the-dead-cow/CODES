class Cone
{
    private float r;
    private float h;
    private float vol;
    public void set(float a,float b)
    {
        r = a;
        h = b;
    }
    public void calculateVol()
    {
        vol=(3.14F*r*r*h)*1.0F/3.0F;
    }
    public void show()
    {
        System.out.println("Volume of cone is : "+vol);
    }
}

class Cylinder
{
    private float r;
    private float h;
    private float vol;
    public void set(float a,float b)
    {
        r = a;
        h = b;
    }
    public void calculateVol()
    {
        vol=3.14F*r*r*h;
    }
    public void show()
    {
        System.out.println("Volume of cylinder is : "+vol);
    }
}

class volume1
{
    public static void main(String args[])
    {
        //Cone
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