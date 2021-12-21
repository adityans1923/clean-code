package solid.lsp;

public class FixedTermDepositAccount extends Account {
  @Override
  void deposit(double amount) {

  }

  @Override
  void withdraw(double amount) {
    throw new UnsupportedOperationException("Withdrawals are not supported by Fixed term deposit account");
  }
}
