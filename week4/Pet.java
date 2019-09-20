import java.awt.Color;

public class Pet
{
    private String species;
    private String name;
    private Color color;
    private int legs;
    private double weight;
    private double amountOfBananas;
    private final double dab;

    public Pet()
    {
        species = "Ape";
        name = "Ray";
        color = Color.BLACK;
        legs = 2;
        weight = 187;
        amountOfBananas = 5;
        dab = 2;
    }
    public void walk(double distance)
    {
        amountOfBananas -= distance / dab;
    }

    public double getAmountOfBananas()
    {
        return amountOfBananas;
    }
}