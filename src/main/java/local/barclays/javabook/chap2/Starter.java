package local.barclays.javabook.chap2;

import java.util.Scanner;

public class Starter {
  public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int number;
    int remainingNumber;
    int sum = 0;

    System.out.print("Enter a number between 0 and 1000: ");
    number = input.nextInt();

    sum += number % 10;
    remainingNumber = number / 10;
    sum += remainingNumber % 10;
    remainingNumber = remainingNumber / 10;
    sum += remainingNumber;

    System.out.println("The sum of the digits is " + sum);
  }
}
