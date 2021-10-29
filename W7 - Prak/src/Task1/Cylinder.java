package Task1;

public class Cylinder extends Circle{
    private double height;

    public Cylinder(){
        super();
        height = 1.0;
    }

    public Cylinder(double height){
        super();
        this.height = height;
    }

    public Cylinder(double height, double radius){
        super(radius);
        this.height = height;
    }

    public double getHeight() {
        return height;
    }

    // A public method for computing the volume of cylinder
    // use superclass method getArea() to get the base area
    public double getVolume()
    {
        return super.getArea()*height;
    }

    @Override
    public double getArea()
    {
        return (2 * Math.PI * super.getRadius() * height) + (2* super.getArea());
    }

    @Override
    public String toString() // in Cylinder class
    {
        return "Cylinder: subclass of " + super.toString() // use Circle's toString()
                + " height=" + height;
    }

}
