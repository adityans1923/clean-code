package designpatterns.chain_of_responsibility;

public class Currency {

  private int amount;

  public Currency(int amout) {
    this.amount = amout;
  }

  public int getAmount() {
    return amount;
  }
}
