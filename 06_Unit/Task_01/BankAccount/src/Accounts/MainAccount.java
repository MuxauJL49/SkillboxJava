package Accounts;

public class MainAccount {
    private double amountMoney;

    public MainAccount() {
        amountMoney = 0d;
    }

    public boolean deposit(double inMoney) {
        if (inMoney < 0d) {
            return false;
        }
        amountMoney += inMoney;
        return true;
    }

    public boolean withdraw(double outMoney) {
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
