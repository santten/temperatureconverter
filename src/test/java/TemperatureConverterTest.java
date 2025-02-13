import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class TemperatureConverterTest {
    private final TemperatureConverter c = new TemperatureConverter();

    @Test
    public void testFahrenheitToCelsius(){
        assertEquals(15.72, c.fahrenheitToCelsius(60.3), 1);
        assertEquals(-28.89, c.fahrenheitToCelsius(-20), 1);

    }

    @Test
    public void testCelsiusToFahrenheit(){
        assertEquals(68, c.celsiusToFahrenheit(20), 1);
        assertEquals(109.4, c.celsiusToFahrenheit(43), 1);
        assertEquals(-4, c.celsiusToFahrenheit(-20), 1);
    }

    @Test
    public void testIsExtremeTemperature(){
        assertTrue(c.isExtremeTemperature(-50.5));
        assertTrue(c.isExtremeTemperature(70.23));
        assertFalse(c.isExtremeTemperature(10));
    }
}