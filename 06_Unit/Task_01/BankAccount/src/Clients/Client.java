package Clients;

import Accounts.MainAccount;

public abstract class Client {

    private MainAccount account;
    private String ACCOUNT_NUMBER;


    public Client(String prefixAccNum) {
        createAcountNumber(prefixAccNum);
        account = createAccount();
    }


    protected abstract MainAccount createAccount();

    protected abstract int getCounterObject();

    private void createAcountNumber(String prefixAccNum) {
        ACCOUNT_NUMBER = String.format("%s%8s", prefixAccNum, getCounterObject()).replace(' ', '0');
    }

    public MainAccount getAccount() {
        return account;
    }

    public String getACCOUNT_NUMBER() {
        return ACCOUNT_NUMBER;
    }

}
