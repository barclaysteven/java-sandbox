package local.barclays;

import org.testng.annotations.Test;

import static org.testng.Assert.*;

/**
 * Unit test for simple App.
 */
public class AppTest {
  private App app = new App();

  @Test
  public void shouldReturnHelloWorld() {
    String expectedResult = "Hello World";

    String actualResult = app.basicMessage();

    assertTrue(actualResult.contains(expectedResult));
  }
}
