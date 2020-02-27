package local.barclays.futures;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.*;

public class FutureAndThreadPool {
  public static void main(String[] args) {
    ExecutorService executorService = Executors.newFixedThreadPool(2);
    List<Future<String>> futureList = new ArrayList<>();

    Map<Integer, Long> sleepTimes = new HashMap<>();
    sleepTimes.put(0, 1000L);
    sleepTimes.put(1, 2000L);
    sleepTimes.put(2, 500L);
    sleepTimes.put(3, 300L);

    for(int i = 0; i < 4; i++) {
      MyCall myCall = new MyCall(sleepTimes.get(i), "Call" + i);
      Future<String> future = executorService.submit(myCall);
      futureList.add(future);
    }

    System.out.println("List size: " + futureList.size());
    processFutureList(futureList);
    executorService.shutdown();
  }

  private static void processFutureList(List<Future<String>> futureList) {
    for (Future<String> future : futureList) {
      String result;
      try{
        result = future.get();
      }
      catch (InterruptedException | ExecutionException e) {
        System.out.println("An Error occurred");
        continue;
      }
      System.out.println("Result is " + result);
    }
  }

  private static class MyCall implements Callable<String> {
    private long sleepTime;
    private String name;

    MyCall(long sleepTime, String name) {
      this.sleepTime = sleepTime;
      this.name = name;
    }

    @Override
    public String call() throws InterruptedException {
      Thread.sleep(sleepTime);
      return "Hello from " + name;
    }
  }
}
