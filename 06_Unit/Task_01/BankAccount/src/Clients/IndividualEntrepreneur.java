package Clients;

import Accounts.MainAccount;

public class IndividualEntrepreneur extends Client {
    private static final String PREFIX_ACC_NUM = "101";
    private static int coutnerIE = 1;
    private static final double SMALL_COMMISSION = 0.005;
    private static final double HIGH_COMMISSION = 0.01;


    public IndividualEntrepreneur() {
        super(PREFIX_ACC_NUM);
        coutnerIE++;
    }


    @Override
    protected MainAccount createAccount() {
        MainAccount mainAccount = new MainAccount() {
            @Override
            public boolean deposit(double inMoney) {
                double commission = 0d;
                if (inMoney < 1000) {
                    commission = inMoney * HIGH_COMMISSION;
                } else {
                    commission = inMoney * SMALL_COMMISSION;
                }
                return super.deposit(inMoney - commission);
            }
        };
        return mainAccount;
    }

    @Override
    protected int getCounterObject() {
        return coutnerIE;
    }

    @Override
    public MainAccount getAccount() {
        return super.getAccount();
    }
}
