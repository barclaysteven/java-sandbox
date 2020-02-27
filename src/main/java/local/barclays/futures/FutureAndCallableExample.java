package local.barclays.futures;

import java.util.concurrent.*;

public class FutureAndCallableExample {
  public static void main(String[] args) throws InterruptedException, ExecutionException {
    ExecutorService executorService = Executors.newSingleThreadExecutor();

    Callable<String> callable = () -> {
      //perform some computation
      System.out.println("Entered Callable");
      Thread.sleep(1000);
      return "Hello from Callable";
    };

    System.out.println("Submitting Callable");
    Future<String> future = executorService.submit(callable);
    System.out.println("Do something else while callable is getting executed");

    System.out.println("Task Completed! Retrieving the result");
    String result = future.get();
    System.out.println(result);

    executorService.shutdown();
  }
}
