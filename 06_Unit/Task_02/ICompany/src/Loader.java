import Company.Company;
import Employee.*;

import java.text.DecimalFormat;
import java.util.Random;

public class Loader {
    private static Random rnd = new Random();
    private static DecimalFormat dfMoney = new DecimalFormat("#.##");

    public static void main(String[] args) {

        Company firstCompany = createNewCompanyByTemplate("Apple", 270);

        Company secondCompany = createNewCompanyByTemplate("Microsoft", 3000);

        System.out.println("Amount employee in " + firstCompany.getNameCompany() + "- " + firstCompany.getStaffOfCompany().size());
        System.out.println("Earned money for a month in company " + firstCompany.getNameCompany() + " - " + dfMoney.format(firstCompany.getMontlyIncome()) + " rub");
        System.out.println("Earned money for a month in company " + secondCompany.getNameCompany() + " - " + dfMoney.format(secondCompany.getMontlyIncome()) + " rub");

        System.out.println();
        System.out.println("Top Salary in company:");
        for (AbstractEmployee employee : firstCompany.getTopSalsryStaff(10)) {
            printDataAboutEmployee(employee);
        }

        System.out.println();
        System.out.println("To cut staff - " + (int) (firstCompany.getStaffOfCompany().size() * 0.1));
        terminatorStaff(firstCompany, (int) (firstCompany.getStaffOfCompany().size() * 0.1));

        System.out.println();
        System.out.println("Amount employee in " + firstCompany.getNameCompany() + "- " + firstCompany.getStaffOfCompany().size());
        System.out.println("Earned money for a month in company" + firstCompany.getNameCompany() + " - " + dfMoney.format(firstCompany.getMontlyIncome()) + " rub");
        System.out.println("Earned money for a month in company" + secondCompany.getNameCompany() + " - " + dfMoney.format(secondCompany.getMontlyIncome()) + " rub");

        System.out.println("Top Salary in company:");
        for (AbstractEmployee employee : firstCompany.getTopSalsryStaff(10)) {
            printDataAboutEmployee(employee);
        }
    }

    private static Company createNewCompanyByTemplate(String nameCompany, int amountStaff) {

        Company company = new Company(nameCompany);

        for (int i = 0; i < amountStaff; i++) {
            double salary, earnedMoney;
            double fte = rnd.nextDouble() < 0.5d ? 0.5d : 1d;
            switch (randomDigit(1, 3)) {
                case 1:
                    //new clerk
                    salary = randomAmountMoney(20_000d, 50_000);
                    new Clerk(fte, salary, company);
                    break;
                case 2:
                    //new sales manager
                    salary = randomAmountMoney(40_000, 100_000);
                    SalesManager salesManager = new SalesManager(fte, salary, company);
                    earnedMoney = randomAmountMoney(50_000, 300_000);
                    salesManager.addEarnedMoneyForCompany(earnedMoney);
                    break;
                case 3:
                    //new top manager
                    salary = randomAmountMoney(100_000, 200_000);
                    new TopManager(fte, salary, company);
                    break;
            }
        }
        return company;
    }

    private static void terminatorStaff(Company company, int amountUnluckyStaff) {
        int amountStaffInCompany = company.getStaffOfCompany().size() - 1;
        for (int i = 0; i < amountUnluckyStaff; i++) {
            company.toFireEmployee(randomDigit(0, amountStaffInCompany));
            amountStaffInCompany--;
        }

    }

    private static void printDataAboutEmployee(AbstractEmployee employee) {
        System.out.println("ID - " + employee.getId() + " " +
                "Name position - \"" + employee.getNamePosition() + "\" " +
                "FTE - " + employee.getFTE() + " " +
                "Month salary - " + dfMoney.format(employee.getMonthSalary()) + " rub " +
                "Work for \"" + employee.getCompany().getNameCompany() + "\"");
    }

    private static double randomAmountMoney(double minMoney, double maxMoney) {
        return minMoney + (maxMoney - minMoney) * rnd.nextDouble();
    }

    private static int randomDigit(int min, int max) {
        return rnd.nextInt((max - min) + 1) + min;
    }
}
