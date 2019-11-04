import Accounts.*;

public class Loader {
    public static void main(String[] args) {
        MainAccount mainAccount = new MainAccount();
        DepositoryAccount depositoryAccount = new DepositoryAccount();
        CreditAccount creditAccount = new CreditAccount();
        double amountMoney = 0d;


        amountMoney = 500d;
        consoleOperationResult(mainAccount.deposit(amountMoney), "Deposit " + amountMoney + " rub");
        amountMoney = 300d;
        consoleOperationResult(mainAccount.withdraw(amountMoney), "Withdraw " + amountMoney + " rub");
        consoleOperationResult(true, "Your balance is " + mainAccount.getAmountMoney());
        amountMoney = 99999d;
        consoleOperationResult(mainAccount.withdraw(amountMoney), "Withdraw " + amountMoney + " rub");
        System.out.println();

        amountMoney = 70000d;
        consoleOperationResult(depositoryAccount.deposit(amountMoney), "Deposit  " + amountMoney + " rub");
        amountMoney = 5333d;
        consoleOperationResult(depositoryAccount.withdraw(amountMoney), "Withdraw " + amountMoney + " rub");
        consoleOperationResult(true, "Your balance is " + depositoryAccount.getAmountMoney());
        System.out.println();

        amountMoney = 100000d;
        consoleOperationResult(creditAccount.deposit(amountMoney), "Deposit " + amountMoney + " rub");
        amountMoney = -444d;
        consoleOperationResult(creditAccount.deposit(amountMoney), "Deposit " + amountMoney + " rub");
        amountMoney = 500d;
        consoleOperationResult(creditAccount.withdraw(500), "Withdraw " + amountMoney + " rub");
        consoleOperationResult(true, "Your balanse is " + creditAccount.getAmountMoney());
    }


    public static void consoleOperationResult(boolean result, String extraInformation){
        if (result){
            System.out.println("Operation completed successfully. " + extraInformation);
        }
        else {
            System.out.println("Error in operation. " + extraInformation);
        }
    }

    public static void consoleOperationResult(boolean result){
        //extra operation is nothing
        consoleOperationResult(result, "");
    }
}
