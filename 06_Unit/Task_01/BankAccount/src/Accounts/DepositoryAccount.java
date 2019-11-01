package Accounts;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class DepositoryAccount extends MainAccount {
    private DateTimeFormatter formatDate = DateTimeFormatter.ofPattern("d.M.yyyy");
    private LocalDate lastInputMoney;

    public DepositoryAccount() {
        super();
        lastInputMoney = LocalDate.now();
    }

    @Override
    public boolean inputMoney(double inMoney) {
        lastInputMoney = LocalDate.now();
        return super.inputMoney(inMoney);
    }

    @Override
    public boolean outputMoney(double outMoney) {
        if (LocalDate.now().compareTo(lastInputMoney.plusDays(30)) > 0) {
            System.out.println("You can't get money. Last date - " + lastInputMoney.format(formatDate));
            return false;
        }
        return super.outputMoney(outMoney);
    }
}
