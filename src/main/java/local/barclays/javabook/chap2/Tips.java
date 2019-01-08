package local.barclays.javabook.chap2;

public class Tips {

  public String calculateTip(double subtotal, double gratuityRate) {
    return String.format("%.02f", tip(subtotal, gratuityRate));
  }

  private double tip(double subtotal, double gratuityRate) {
    return subtotal * (gratuityRate / 100.0);
  }

  public String calculateTotal(double subtotal, double gratuityRate) {
    return String.format("%.02f", subtotal + tip(subtotal, gratuityRate));
  }
}
