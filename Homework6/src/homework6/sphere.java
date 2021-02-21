/*
 Class Sphere
 Part of Homework #6 Package
 */
package homework6;

/*
 * This code written by : Azka S. Firdaus
 * Friday, 11 September 2020
 */
public class sphere {
    private float r;
    
    public sphere(float radius)
    {
        r = radius;
    }
    
    public float diameter()
    {
        return 2*r;
    }
    
    public double circumference()
    {
        return Math.PI*r;
    }
    
    public double surfaceArea()
    {
        return Math.PI*Math.pow(2*r, 2);
    }
    
    public double volume()
    {
        return (4.0/3)*Math.PI*Math.pow(r,3);
    
    }
}
