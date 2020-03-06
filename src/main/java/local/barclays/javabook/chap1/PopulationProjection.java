package local.barclays.javabook.chap1;

public class PopulationProjection {
  public static void main(String[] args) {
    Population pop = new Population();
    int startingPopulation = 312032486;

    System.out.println("Starting Population: " + startingPopulation);

    for (int i = 1; i <= 10; i++) {
      startingPopulation = pop.increasePopulation(startingPopulation);
      System.out.println("Year " + i + " population growth: " + startingPopulation);
    }
  }
}
