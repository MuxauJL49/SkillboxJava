package Accounts;

public class MainAccount {
    private double amountMoney;

    public MainAccount() {
        amountMoney = 0d;
    }

    public MainAccount(double money) {
        super();
        if (!inputMoney(money)) {
            throw new RuntimeException("Not correct amount!");
        }
    }

    public boolean inputMoney(double inMoney) {
        return upAmountMoney(inMoney);
    }

    public boolean outputMoney(double outMoney) {
        return downAmountMoney(outMoney);
    }

    private boolean upAmountMoney(double inMoney) {
        if (inMoney < 0d) {
            System.out.println("Error in input amount");
            return false;
        }
        System.out.println("Credited " + inMoney + " rub");
        amountMoney += inMoney;
        return true;
    }

    private boolean downAmountMoney(double outMoney) {
        if (outMoney < 0d || !checkAmount(outMoney)) {
            System.out.println("Error in output money");
            return false;
        }
        System.out.println("Debited " + outMoney + " rub");
        amountMoney -= outMoney;
        return true;
    }

    private boolean checkAmount(double money) {
        return (amountMoney - money > 0d) ? true : false;
    }

    public double getAmountMoney() {
        System.out.println("You have " + amountMoney + " rub");
        return amountMoney;
    }
}
