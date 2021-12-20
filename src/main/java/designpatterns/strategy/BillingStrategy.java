package designpatterns.strategy;

public interface BillingStrategy {
  int getActualPrice(int rawPrice);
}
