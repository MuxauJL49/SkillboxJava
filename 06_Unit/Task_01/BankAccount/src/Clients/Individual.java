package Clients;

import Accounts.MainAccount;

public class Individual extends Client {

    @Override
    protected MainAccount createAccount() {
        return new MainAccount();
    }
}
