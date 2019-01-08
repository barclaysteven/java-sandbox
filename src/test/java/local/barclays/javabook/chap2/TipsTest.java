package local.barclays.javabook.chap2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class TipsTest {
  private Tips tips = new Tips();
  private double subtotal = 10;
  private double gratuityRate = 15;

  @Test
  public void shouldCalculateTheCorrectTipFor15Percent() {
    String expectedResult = "1.50";

    String result = tips.calculateTip(subtotal, gratuityRate);

    assertEquals(expectedResult, result);
  }

  @Test
  public void shouldCalculateTheCorrectTotal() {
    String expectedResult = "11.50";

    String result = tips.calculateTotal(subtotal, gratuityRate);

    assertEquals(expectedResult, result);
  }

}
