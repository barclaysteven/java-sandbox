package local.barclays.threading;

public class TwoThreadsTest {
  public static void main(String[] args) {
    new SimpleTread("Jamaica").start();
    new SimpleTread("Fiji").start();
    new SimpleTread("Utah").start();
  }
}
