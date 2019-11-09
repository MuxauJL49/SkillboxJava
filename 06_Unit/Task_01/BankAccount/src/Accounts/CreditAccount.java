package Accounts;

public class CreditAccount extends MainAccount {
    private double percent;

    public CreditAccount() {
        percent = 0.01d;
    }

    @Override
    public boolean withdraw(double outMoney) {
        return super.withdraw(outMoney + (outMoney * percent));
    }
}
