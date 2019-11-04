package Clients;

import Accounts.MainAccount;

public class IndividualEntrepreneur extends Client {

    private static String PREFIX_ACC_NUM = "101";
    private static int coutnerIE = 0;

    @Override
    protected MainAccount createAccount() {
        MainAccount mainAccount = new MainAccount() {
            @Override
            public boolean deposit(double inMoney) {
                double commission = 0d;
                if (inMoney < 1000) {
                    //commission is 1%
                    commission = inMoney * 0.01;
                } else {
                    //commission is 0.5%
                    commission = inMoney * 0.005;
                }
                return super.deposit(inMoney - commission);
            }
        };
        return mainAccount;
    }

    @Override
    protected String createAcountNumber() {
        coutnerIE++;
        return PREFIX_ACC_NUM + String.format("%8s", coutnerIE).replace(' ', '0');
    }

    @Override
    public MainAccount getAccount() {
        return super.getAccount();
    }
}
