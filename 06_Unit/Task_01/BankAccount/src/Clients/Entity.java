package Clients;

import Accounts.CreditAccount;
import Accounts.MainAccount;

public class Entity extends Client {

    private static String PREFIX_ACC_NUM = "103";
    private static int counterEntity = 1;

    public Entity() {
        super(PREFIX_ACC_NUM);
        counterEntity++;
    }

    @Override
    protected MainAccount createAccount() {
        return new CreditAccount();
    }

    @Override
    protected int getCounterObject() {
        return counterEntity;
    }
}
