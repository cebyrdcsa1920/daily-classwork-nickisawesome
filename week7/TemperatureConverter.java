public class TemperatureConverter
{
    private double temperature;
    private boolean isCelsius;

    public TemperatureConverter(double celsius)
    {
        temperature = celsius;
        isCelsius = true;
    }

    public void converterToF()
    {
        if(isCelsius)
        {
            temperature = temperature*9/5+32;
        }
    }

    public String toString()
    {
        String result = "The current temperature is" +temperature "degrees";
        if (isCelsuis)
        {
            result += "Celsuis"
        }
        else
        {
            result += "Fahrenheit";
        }
        return result;
    }
}