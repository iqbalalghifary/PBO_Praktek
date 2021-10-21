package Aggregation;

public class Titik {
    private float X,Y;
    public Titik(float x, float y)
    {
        X = x;
        Y = y;
    }

    public void posisiTitik()
    {
        System.out.println( "[" + X + "," + Y + "]" );
    }
}
