import java.awt.Color;

public class Benz
{
    private String model:
    private Color color;
    private int numSeats;
    private double amountOfGas;
    private final double mpg;

    public Benz()
    {
        model = "Mercedes-Benz SL Class";
        color = Color.BLACK;
        numSeats = 5;
        amountOfGas = 33
        mpg = 20
    }

    public Benz(String model, Color color, int numSeats, double amountOfGas, double mpg)
    {
        this.model = model;
        this.color = color;
        this.numSeats = numSeats;
        this.amountOfGas = amountOfGas;
        this.mpg = mpg;
    }

    public void drive(double distance)
    {
        amountOfGas -= distance / mpg;
    }

    public double getAmountOfGas()
    {
        return amountOfGas;
    }

    public void fillUpGasTank(double amount)
    {
        amountOfGas += amount;
    }

    public String toString()
    {
        return "This is Alissa Benz";
    }

}