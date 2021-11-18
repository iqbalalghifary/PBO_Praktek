/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThePaintingShapes;

/**
 *
 * @author Asus
 */
public class Cylinder extends Shape 
{
    private double radius;
    private double height;
    
    public Cylinder(double radius, double height)
    {
        super("Cylinder");
        this.radius = radius;
        this.height = height;
    }
    
    public double area()
    {
        return Math.PI*radius*radius*height;
    }
    
     public String toString()
    {
        String result = super.toString() + " of radius : "+ radius+" of height: "+height;
        return result;
    }
}
