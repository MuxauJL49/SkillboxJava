package Clients;

import Accounts.MainAccount;

public class Individual extends Client {

    private static String PREFIX_ACC_NUM = "102";
    private static int counterIndividual = 0;


    @Override
    protected MainAccount createAccount() {
        return new MainAccount();
    }

    @Override
    protected String createAcountNumber() {
        counterIndividual++;
        return PREFIX_ACC_NUM + String.format("%8s", counterIndividual).replace(' ', '0');
    }
}
