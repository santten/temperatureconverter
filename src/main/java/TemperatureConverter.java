public class TemperatureConverter {
    public TemperatureConverter() {}

    public double fahrenheitToCelsius(double f){
        return (f - 32) * ((double) 5 /9);
    }

    public double celsiusToFahrenheit(double c){
         return (c * ((double) 9 / 5)) + 32;
    }

    public boolean isExtremeTemperature(double c){
        return 50 < c || c < -40;
    }
}
