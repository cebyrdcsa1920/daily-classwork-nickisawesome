import java.awt.Color;

public class Ferrari
{
    private String model:
    private Color color;
    private int numSeats;
    private double mph;

    public Ferrari()
    {
        model = "2019 Ferrari 488 Spider";
        color = Color.BLUE;
        numSeats = 4;
        mph = 330
    }

    public Ferrari(String model, Color color, int numSeats, double mph)
    {
        this.model = model;
        this.color = color;
        this.numSeats = numSeats;
        this.mph = mph;
    }

    public String toString()
    {
        return "This is Ray Ferrari";
    }
}