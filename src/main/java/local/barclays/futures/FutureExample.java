package local.barclays.futures;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureExample {
  private ExecutorService executor = Executors.newSingleThreadExecutor();

  public Future<Integer> calculate(final Integer input) {
    return executor.submit(() -> {
      Thread.sleep(1000);
      return input * input;
    });
  }
}
