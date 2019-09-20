import java.awt.Color;

public class Tank
{
    private String model:
    private Color color;
    private int numSeats;
    private int numOfWeapons;
    private int missles;
    private double amountOfGas;
    private final double mpg;

    public Tank()
    {
        model = "BT-2";
        color = Color.BROWN;
        numSeats = 3;
        numOfWeapons = 1
        missles = 5
        amountOfGas = 500;
        mpg = 5;
    }

    public Tank(String model, Color color, int numSeats, int numOfWeapons, double amountOfGas, double mpg)
    {
        this.model = model;
        this.color = color;
        this.numSeats = numSeats;
        this.numOfWeapons = numOfWeapons;
        this.amountOfGas = amountOfGas;
        this.mpg = mpg;
    }

    public void shoot(int missles)
    {
        missles -= missles - 1
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
        return "This is my Tank ";
    }
}