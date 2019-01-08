package local.barclays.javabook.chap2;

import java.util.Scanner;

public class PoundsToKilograms {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double pounds;
    double kilograms;

    System.out.print("Enter a number in pounds: ");
    pounds = input.nextDouble();

    kilograms = pounds * 0.454;

    System.out.println(pounds + " pounds is " + kilograms + " kilograms");
  }
}
