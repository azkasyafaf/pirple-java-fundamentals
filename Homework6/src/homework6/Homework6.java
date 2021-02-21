/*
 Homework #6
 The Fundamentals of Java
 Chapter 6 - Basic OOP
 */
package homework6;
import java.util.*;

/*
 * This code written by : Azka S. Firdaus
 * Friday, 11 September 2020
 */
public class Homework6 {

    public static void main(String[] args) {
        Scanner reader = new Scanner(System.in);
        float radius;
        
        System.out.println("        Sphere Geometry Calculator");
        System.out.println("-----------------How to Use-----------------");
        System.out.println("Type your desired radius and the program will");
        System.out.println("calculate all the geometry.");
        System.out.println("---------------------------------------------");
        System.out.print("Enter the radius : ");
        
        radius = reader.nextFloat();
        sphere r = new sphere(radius);
        
        System.out.println("\n------------Result------------");
        System.out.println("Diameter        : " + r.diameter());
        System.out.println("Circumference   : " + r.circumference());
        System.out.println("Surface Area    : " + r.surfaceArea());
        System.out.println("Volume          : " + r.volume());
    }
    
}
