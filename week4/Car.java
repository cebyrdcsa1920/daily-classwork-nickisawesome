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
        numPassengers = 4;
        amountOfGas = 20;
        mpg = 5;
    }

    public Car(String model, Color color, int numPassengers, double amountOfGas, double mpg)
    {
        this.model = model;
        this.color = color;
        this.numPassengers = numPassengers;
        this.amoutOfGas = amountOfGas;
        this.mpg = mpg;
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
    /**
     *
     * Fills up the gas tank
     *
     * @param amount gas to add to tank
     */
    public void fillUpGasTank(double amount)
    {
        amountOfGas += amount;
    }
    public String toString()
    {
        return "This is my Mustang";
    }

}