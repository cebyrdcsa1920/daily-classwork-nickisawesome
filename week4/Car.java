import java.awt.Color;

public class Car
{
    private String model;
    private Color color;
    private int numPassengers;
    private double amountOfGas;
    private final double mpg;

    public Car()
    {
        model = "Mustang";
        color = Color.YELLOW;
        numPassengers = 2;
        amountOfGas = 25.5;
        mpg = 20.5;
    }

    /**
     * Drives the car the given distance. Subtracts gas from the tank.
     *
     * @param distance. The distance driven in miles
     */
    public void drive(double distance)
    {
        amountOfGas -= distance / mpg;
    }

    /**
     * get the amount of gas in the tank
     *
     * @return amount of gas
     */
    public double getAmountOfGas()
    {
        return amountOfGas;
    }

    public String toString()
    {
        return "This is my Mustang";
    }
}