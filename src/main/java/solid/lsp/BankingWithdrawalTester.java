package solid.lsp;

public class BankingWithdrawalTester {

  public static void main(String[] args) {
    Account saving = new SavingAccount();

    BankingAppWithdrawalService service = new BankingAppWithdrawalService(saving);
    service.withdraw(2000.0);

    Account fixed = new FixedTermDepositAccount();
    service = new BankingAppWithdrawalService(fixed);
    service.withdraw(2000.0);
  }
}
