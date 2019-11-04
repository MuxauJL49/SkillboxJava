package Clients;

import Accounts.CreditAccount;
import Accounts.MainAccount;

public class Entity extends Client {
    @Override
    protected MainAccount createAccount() {
        return new CreditAccount();
    }
}
