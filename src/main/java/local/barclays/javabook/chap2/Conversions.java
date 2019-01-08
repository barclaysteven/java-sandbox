package local.barclays.javabook.chap2;

public class Conversions {

  public String convertCelsiusToFahrenheit(double celsius) {
    double fahrenheit = (9.0 / 5) * celsius + 32;
    return String.format("%.02f", fahrenheit);
  }

  public String convertFahrenheitToCelsius(double fahrenheit) {
    double celsius = (fahrenheit - 32) * (5.0 / 9);
    return String.format("%.02f", celsius);
  }

  public String convertFeetToMeters(double feet) {
    double meters = feet * 0.305;
    return String.format("%.04f", meters);
  }

  public String convertPoundsToKilograms(double pounds) {
    double kilograms = pounds * 0.454;
    return String.format("%.03f", kilograms);
  }
}
