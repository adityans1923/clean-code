package examples.portfolio;

import java.util.Arrays;
import java.util.List;

public class PortfolioTester {

  public static void main(String[] args) {
    Portfolio portfolio = new Portfolio();

    portfolio.setStocks(getListOfStocks());

    System.out.println("Total value of portfolio is: " + portfolio.getMarketValue());
  }

  private static List<Stock> getListOfStocks() {
    return Arrays.asList(
      new Stock("1", "Google", 10),
      new Stock("2", "Microsoft", 10)
    );
  }
}
