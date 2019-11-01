import Accounts.*;

public class Loader {
    public static void main(String[] args) {
        MainAccount mainAccount = new MainAccount();
        DepositoryAccount depositoryAccount = new DepositoryAccount();
        CreditAccount creditAccount = new CreditAccount();

        mainAccount.inputMoney(500d);
        mainAccount.outputMoney(300d);
        mainAccount.getAmountMoney();
        mainAccount.outputMoney(99999d);
        System.out.println();

        depositoryAccount.inputMoney(70000d);
        depositoryAccount.outputMoney(5333d);
        depositoryAccount.getAmountMoney();
        System.out.println();

        creditAccount.inputMoney(100000d);
        creditAccount.inputMoney(-444d);
        creditAccount.outputMoney(500);
        creditAccount.getAmountMoney();
    }
}
