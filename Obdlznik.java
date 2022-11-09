
/**
 * Write a description of class Obdlznik here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Obdlznik extends stvorec implements j
{
    // instance variables - replace the example below with your own
    private int x;

    /**
     * Constructor for objects of class Obdlznik
     */
    public Obdlznik()
    {
        // initialise instance variables
        x = 0;
    }

    public Obdlznik(int x)
    {
        // initialise instance variables
        this.x = x;
    }


    public Obdlznik(int x, int y)
    {
        // initialise instance variables
        this.x = x;
    }


    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public int sampleMethod(int y)
    {
        // put your code here
        return x + y;
    }
}
