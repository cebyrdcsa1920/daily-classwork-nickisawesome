import java.awt.Color;

public class House
{
    private String model;
    private Color color;
    private int numRooms;
    private double numBathrooms;

    public House()
    {
        model = "loft";
        color = Color.BLUE;
        numRooms = 7;
        numBathrooms = 3.5;
    }
    public String toString()
    {
        return "This is my loft";
    }
}