package Accounts;

public class CreditAccount extends MainAccount {
    private double percent;

    public CreditAccount() {
        super();
        percent = 0.01d;
    }


    @Override
    public boolean outputMoney(double outMoney) {
        return super.outputMoney(outMoney + (outMoney * percent));
    }
}
