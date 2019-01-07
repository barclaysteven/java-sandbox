package local.barclays.javabook.chap2;

public class DegreeConversion {
  public String convertCelsiusToFahrenheit(double celsius) {
    double fahrenheit = (9.0 / 5) * celsius + 32;
    String results = String.format("%.02f", fahrenheit);
    return results;
  }

  public String convertFahrenheitToCelsius(double fahrenheit) {
    double celsius = (fahrenheit - 32) * (5.0 / 9);
    String results = String.format("%.02f", celsius);
    return results;
  }
}
