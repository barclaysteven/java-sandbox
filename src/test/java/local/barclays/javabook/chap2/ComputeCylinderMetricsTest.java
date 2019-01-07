package local.barclays.javabook.chap2;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

public class ComputeCylinderMetricsTest {
  private ComputeCylinderMetrics computeCylinderMetrics = new ComputeCylinderMetrics();

  @Test
  public void shouldComputeCylinderArea() {
    double radius = 5.5;
    String expectedArea = "95.0332";

    String results = computeCylinderMetrics.getCylinderArea(radius);

    assertEquals(expectedArea, results);
  }

  @Test
  public void shouldComputeCylinderVolume() {
    double radius = 5.5;
    double length = 12;
    String expectedVolume = "1140.4";

    String results = computeCylinderMetrics.getCylinderVolume(radius, length);

    assertEquals(expectedVolume, results);
  }
}
