package Clients;

import Accounts.CreditAccount;
import Accounts.MainAccount;

public class Entity extends Client {

    private static String PREFIX_ACC_NUM = "103";
    private static int counterEntity = 0;


    @Override
    protected MainAccount createAccount() {
        return new CreditAccount();
    }

    @Override
    protected String createAcountNumber() {
        counterEntity++;
        return PREFIX_ACC_NUM + String.format("%8s", counterEntity).replace(' ', '0');
    }
}
