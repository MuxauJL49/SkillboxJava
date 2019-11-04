package Accounts;

public class MainAccount {
    private double amountMoney;

    public MainAccount() {
        amountMoney = 0d;
    }

    public MainAccount(double money) {
        super();
        if (!deposit(money)) {
        }
    }

    public boolean deposit(double inMoney) {
        return upAmountMoney(inMoney);
    }

    public boolean withdraw(double outMoney) {
        return downAmountMoney(outMoney);
    }

    private boolean upAmountMoney(double inMoney) {
        if (inMoney < 0d) {
            return false;
        }
        amountMoney += inMoney;
        return true;
    }

    private boolean downAmountMoney(double outMoney) {
        if (outMoney < 0d || !isBalanceGreaterThen(outMoney)) {
            return false;
        }
        amountMoney -= outMoney;
        return true;
    }

    private boolean isBalanceGreaterThen(double money) {
        return amountMoney >= money;
    }

    public double getAmountMoney() {
        return amountMoney;
    }
}
