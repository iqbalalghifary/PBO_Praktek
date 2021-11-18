/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ThePaintingShapes;

abstract public class Shape 
{
    private String shapeName;
    
    public Shape (String shapeName)
    {
        this.shapeName = shapeName;
    }
    
    public abstract double area();

    public  String toString()
    {
        String result = "Shape Name : "+this.shapeName;
        return result;
    }
}
