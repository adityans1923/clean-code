package designpatterns.chain_of_responsibility;

public interface Dispenser {
  void setNextDispenser(Dispenser nextChain);
  void dispense(Currency currency);
}
