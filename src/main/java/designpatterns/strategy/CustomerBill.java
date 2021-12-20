package designpatterns.strategy;

import java.util.ArrayList;
import java.util.List;

public class CustomerBill {
  private final List<Integer> drinks = new ArrayList<>();
  private BillingStrategy strategy;

  public CustomerBill(BillingStrategy strategy) {
    this.strategy = strategy;
  }

  public void add(int price, int quantity) {
    this.drinks.add(this.strategy.getActualPrice(price * quantity));
  }

  // Payment of bill
  public void payBill() {
    int sum = this.drinks.stream().mapToInt(v -> v).sum();
    System.out.println("Total due: " + sum);
    this.drinks.clear();
  }

  // Set Strategy
  public void setStrategy(BillingStrategy strategy) {
    this.strategy = strategy;
  }
}
