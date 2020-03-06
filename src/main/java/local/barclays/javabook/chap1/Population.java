package local.barclays.javabook.chap1;

public class Population {
  private static final int SECONDS_IN_A_YEAR = 365 * 24 * 60 * 60;
  private static final int BIRTHS_PER_YEAR = SECONDS_IN_A_YEAR / 7;
  private static final int DEATHS_PER_YEAR = SECONDS_IN_A_YEAR / 13;
  private static final int IMMIGRANTS_PER_YEAR = SECONDS_IN_A_YEAR / 45;



  private int getPopulationGrowth() {
    return BIRTHS_PER_YEAR - DEATHS_PER_YEAR + IMMIGRANTS_PER_YEAR;
  }

  public int increasePopulation(int startingPop) {
    return startingPop + getPopulationGrowth();
  }
}
