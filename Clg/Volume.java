public class Volume
{

    public double cylinder(double rad, int h)
    {
        double cyl= 3.14*rad*rad*h;
        return cyl;
    }
    public double cone()
    {
        double c= 1/3 * cylinder(0, 0);
        return c;
    }
}
public class volume{
    public static void main(String args[]){

    Volume obj;
        
    double radius, height;
    System.out.println(obj.cylinder(12.5,4));
    System.out.println(obj.cone());
    
}
}