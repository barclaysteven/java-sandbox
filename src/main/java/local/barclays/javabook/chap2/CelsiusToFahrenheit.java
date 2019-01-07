package local.barclays.javabook.chap2;

import java.util.Scanner;

public class CelsiusToFahrenheit {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    System.out.print("Enter the degrees in Celsius: ");
    double celsius = input.nextDouble();

    double fahrenheit = (9.0 / 5) * celsius + 32;

    System.out.println(celsius + " Celsius is " + fahrenheit + " Fahrenheit");
  }
}
