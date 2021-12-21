package solid.lsp;

public class SavingAccount extends Account {
  @Override
  public void deposit(double amount) {

  }

  @Override
  public void withdraw(double amount) {
    System.out.println("Withdrawing " + amount + " from saving account");
  }
}
