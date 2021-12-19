package designpatterns.chain_of_responsibility;

public class Rupee2000Dispenser implements Dispenser {

  public static final int RUPEE_VALUE = 2000;
  private Dispenser next;

  @Override
  public void setNextDispenser(Dispenser nextChain) {
    this.next = nextChain;
  }

  @Override
  public void dispense(Currency currency) {
    if(currency.getAmount() >= RUPEE_VALUE) {
      int num = currency.getAmount() / RUPEE_VALUE;
      int remainder = currency.getAmount() % RUPEE_VALUE;
      System.out.println("Dispensing " + num + " notes of Rs " + RUPEE_VALUE);
      if (remainder != 0) {
        this.next.dispense(new Currency(remainder));
      }
    } else {
      this.next.dispense(currency);
    }
  }
}
