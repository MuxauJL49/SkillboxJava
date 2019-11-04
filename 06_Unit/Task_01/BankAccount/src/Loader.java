import Accounts.*;
import Clients.Client;
import Clients.Entity;
import Clients.Individual;
import Clients.IndividualEntrepreneur;

import java.util.ArrayList;
import java.util.Scanner;

public class Loader {
    private static ArrayList<Client> allClients = new ArrayList<>();
    private static Client client;
    private static Scanner scanner = new Scanner(System.in);
    private static String helpCommand = "Create 1 - Individual Entrepreneur\n" +
            "Create 2 - Individual\n" +
            "Create 3 - Entity\n" +
            "Exit - for exit\n" +
            "Choose (num client) -  in development...\n" +
            "Withdraw - withdraw money to active account\n" +
            "Deposit - deposit money to active account\n" +
            "List - print data\n";


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
        consoleOperationResult(creditAccount.withdraw(amountMoney), "Withdraw " + amountMoney + " rub");
        consoleOperationResult(true, "Your balanse is " + creditAccount.getAmountMoney());


        for (; ; ) {
            System.out.println("Create your account type kind Account or write \"help\"");
            String inputString = scanner.nextLine();
            if (inputString.toUpperCase().equals("EXIT")) {
                System.out.println("Bye");
                break;
            } else if (inputString.toUpperCase().equals("HELP")) {
                System.out.println(helpCommand);
            } else if (inputString.toUpperCase().equals("CREATE 1")) {
                client = new IndividualEntrepreneur();
                allClients.add(client);
            } else if (inputString.toUpperCase().equals("CREATE 2")) {
                client = new Individual();
                allClients.add(client);
            } else if (inputString.toUpperCase().equals("CREATE 3")) {
                client = new Entity();
                allClients.add(client);
            } else if (client == null) {
                //check empty active client
                System.out.println("You need create client");
            } else if (inputString.toUpperCase().equals("CHOOSE")) {
                System.out.println("This part in development...");
                //work with array list clients
            } else if (inputString.toUpperCase().equals("WITHDRAW")) {
                System.out.println("Type amount of money (Withdraw):");
                inputString = scanner.nextLine();
                consoleOperationResult(client.getAccount().withdraw(Double.parseDouble(inputString)));
            } else if (inputString.toUpperCase().equals("DEPOSIT")) {
                System.out.println("Type amount of money (Withdraw):");
                inputString = scanner.nextLine();
                consoleOperationResult(client.getAccount().deposit(Double.parseDouble(inputString)));
            } else if (inputString.toUpperCase().equals("LIST")) {
                System.out.println("CLIENT NUMBER - MONEY");
                for (Client cl : allClients) {
                    System.out.println(cl.getACCOUNT_NUMBER() + " - " + cl.getAccount().getAmountMoney());
                }
            } else {
                System.out.println("Incorrect command");
            }
        }
    }


    private static void consoleOperationResult(boolean result, String extraInformation) {
        if (result) {
            System.out.println("Operation completed successfully. " + extraInformation);
        } else {
            System.out.println("Error in operation. " + extraInformation);
        }
    }

    private static void consoleOperationResult(boolean result) {
        //extra operation is nothing
        consoleOperationResult(result, "");
    }

    private static double convertAndCheckInputText(String inputText) {
        //in developing...
        return 0.d;
    }
}
