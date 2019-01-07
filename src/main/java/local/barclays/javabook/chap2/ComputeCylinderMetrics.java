package local.barclays.javabook.chap2;

public class ComputeCylinderMetrics {
  public String getCylinderArea(double radius) {
    double area = computeArea(radius);
    return String.format("%.04f", area);
  }

  private double computeArea(double radius) {
    return radius * radius * Math.PI;
  }

  public String getCylinderVolume(double radius, double length) {
    double area = computeArea(radius);
    double volume = area * length;
    return String.format("%.01f", volume);
  }
}
