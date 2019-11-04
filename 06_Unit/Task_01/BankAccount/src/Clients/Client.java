package Clients;

import Accounts.MainAccount;

public abstract class Client {

    private MainAccount account;
    private String ACCOUNT_NUMBER;
    private String ownerName;
    private String ownerLastName;
    private String ownerMiddleName;
    private String sex;
    private String mainAddress;
    private String extraAdress;

    public Client() {
        ACCOUNT_NUMBER = createAcountNumber();
        account = createAccount();
    }


    protected abstract MainAccount createAccount();

    protected abstract String createAcountNumber();

    public MainAccount getAccount() {
        return account;
    }

    public String getACCOUNT_NUMBER() {
        return ACCOUNT_NUMBER;
    }

    public String getOwnerName() {
        return ownerName;
    }

    public String getOwnerLastName() {
        return ownerLastName;
    }

    public String getOwnerMiddleName() {
        return ownerMiddleName;
    }

    public String getSex() {
        return sex;
    }

    public String getMainAddress() {
        return mainAddress;
    }

    public String getExtraAdress() {
        return extraAdress;
    }
}
