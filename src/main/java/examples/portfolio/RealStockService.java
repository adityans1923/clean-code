package examples.portfolio;

public class RealStockService implements StockService {

  @Override
  public double getPrice(Stock stock) {
    // assuming that the stock service is making a Web API call and bringing this price back
    return 100;
  }

}
