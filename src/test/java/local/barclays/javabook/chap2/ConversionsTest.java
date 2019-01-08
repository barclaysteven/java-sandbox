package local.barclays.javabook.chap2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ConversionsTest {
  private Conversions conversions = new Conversions();

  @Test
  public void shouldConvertCelsiusToFahrenheit() {
    double celsius = 43;
    String expectedResult = "109.40";

    String result = conversions.convertCelsiusToFahrenheit(celsius);

    assertEquals(expectedResult, result);
  }

  @Test
  public void shouldConvertFahrenheitToCelsius() {
    double fahrenheit = 109.4;
    String expectedResult = "43.00";

    String result = conversions.convertFahrenheitToCelsius(fahrenheit);

    assertEquals(expectedResult, result);
  }

  @Test
  public void shouldConvertFeetToMeters() {
    double feet = 16.5;
    String expectedResult = "5.0325";

    String result = conversions.convertFeetToMeters(feet);

    assertEquals(expectedResult, result);
  }

  @Test
  public void shouldConvertPoundsToKilograms() {
    double pounds = 55.5;
    String expectedResult = "25.197";

    String result = conversions.convertPoundsToKilograms(pounds);

    assertEquals(expectedResult, result);
  }

}
