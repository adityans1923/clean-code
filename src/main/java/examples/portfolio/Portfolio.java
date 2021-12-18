package examples.portfolio;

import java.util.List;

public class Portfolio {
  //is this right?
  private RealStockService stockService = new RealStockService();
  private List<Stock> stocks;

  public List<Stock> getStocks() {
    return stocks;
  }

  public void setStocks(List<Stock> stocks) {
    this.stocks = stocks;
  }

  public double getMarketValue(){
    double marketValue = 0.0;
    for(Stock stock:stocks){
      marketValue += stockService.getPrice(stock) * stock.getQuantity();
    }
    return marketValue;
  }

}
