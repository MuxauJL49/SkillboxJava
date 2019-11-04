package Accounts;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DepositoryAccount extends MainAccount {
    private DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("d.M.yyyy");
    private LocalDate lastInputMoney;

    public DepositoryAccount() {
        lastInputMoney = LocalDate.now();
    }

    @Override
    public boolean deposit(double inMoney) {
        lastInputMoney = LocalDate.now();
        return super.deposit(inMoney);
    }

    @Override
    public boolean withdraw(double outMoney) {
        if (LocalDate.now().compareTo(lastInputMoney.plusDays(30)) > 0) {
            return false;
        }
        return super.withdraw(outMoney);
    }

    public String getLastInputMoney() {
        return lastInputMoney.format(formatDate);
    }
}
