package local.barclays.futures;

import java.util.concurrent.Future;

public class FutureUse {
  public static void main(String[] args) throws Exception {
    FutureExample calculator = new FutureExample();
    Future<Integer> future1 = calculator.calculate(10);
    Future<Integer> future2 = calculator.calculate(100);

    while(!(future1.isDone() && future2.isDone())) {
      System.out.println(
        String.format(
          "future1 is %s and future2 is %s",
          future1.isDone() ? "done" : "not done",
          future2.isDone() ? "done" : "not done"
        )
      );
      Thread.sleep(300);
    }

    Integer result = future1.get();
    Integer result2 = future2.get();
    System.out.println("Result1: " + result + " and Result2: " + result2);
  }
}
