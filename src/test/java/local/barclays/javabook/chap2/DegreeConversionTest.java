package local.barclays.javabook.chap2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class DegreeConversionTest {
  private DegreeConversion degreeConversion = new DegreeConversion();

  @Test
  public void shouldConvertCelsiusToFahrenheit() {
    double celsius = 43;
    String expectedResult = "109.40";

    String result = degreeConversion.convertCelsiusToFahrenheit(celsius);

    assertEquals(expectedResult, result);
  }

  @Test
  public void shouldConvertFahrenheitToCelsius() {
    double fahrenheit = 109.4;
    String expectedResult = "43.00";

    String result = degreeConversion.convertFahrenheitToCelsius(fahrenheit);

    assertEquals(expectedResult, result);
  }
}
