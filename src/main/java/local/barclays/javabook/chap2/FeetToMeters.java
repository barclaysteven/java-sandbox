package local.barclays.javabook.chap2;

import java.util.Scanner;

public class FeetToMeters {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    double feet;
    double meters;

    System.out.print("Enter a value for feet: ");
    feet = input.nextDouble();

    meters = feet * 0.305;

    System.out.println(feet + " feet is " + meters + " meters");
  }
}
