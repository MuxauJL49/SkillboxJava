package Clients;

import Accounts.MainAccount;

public class Individual extends Client {

    private static String PREFIX_ACC_NUM = "102";
    private static int counterIndividual = 1;

    public Individual() {
        super(PREFIX_ACC_NUM);
        counterIndividual++;
    }

    @Override
    protected MainAccount createAccount() {
        return new MainAccount();
    }

    @Override
    protected int getCounterObject() {
        return counterIndividual;
    }
}
