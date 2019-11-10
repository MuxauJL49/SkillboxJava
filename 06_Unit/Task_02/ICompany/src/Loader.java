import Company.Company;
import Employee.*;

import java.text.DecimalFormat;
import java.util.Random;

public class Loader {
    private static Random rnd = new Random();
    private static DecimalFormat dfMoney = new DecimalFormat("#.##");

    public static void main(String[] args) {

        Company company = new Company("Dilidon");

        for (int i = 0; i < 270; i++) {
            Employee employee;
            double salary, earnedMoney;
            double fte = rnd.nextDouble() < 0.5d ? 0.5d : 1d;
            switch (rnd.nextInt((3 - 1) + 1) + 1) {
                case 1:
                    //new clerk
                    salary = randomAmountMoney(20_000d, 50_000);
                    employee = new Clerk(fte, salary, company);
                    break;
                case 2:
                    //new sales manager
                    salary = randomAmountMoney(40_000, 100_000);
                    employee = new SalesManager(fte, salary, company);
                    earnedMoney = randomAmountMoney(50_000, 300_000);
                    employee.addEarnedMoneyForCompany(earnedMoney);
                    break;
                case 3:
                    //new top manager
                    salary = randomAmountMoney(100_000, 200_000);
                    employee = new TopManager(fte, salary, company);
                    earnedMoney = randomAmountMoney(100_000, 1_000_000);
                    employee.addEarnedMoneyForCompany(earnedMoney);
                    break;
            }
        }

        System.out.println("Amount employee - " + company.getEmployees().size());
        System.out.println("Earned money for a month in company - " + dfMoney.format(company.getMontlyProfit()) + " rub");

        System.out.println();
        System.out.println("Lowers Salary in company:");
        for (Employee employee : company.gerLowerstSalsryStaff(5)) {
            printDataAboutEmployee(employee);
        }

        System.out.println();
        System.out.println("Top Salary in company:");
        for (Employee employee : company.getTopSalsryStaff(5)) {
            printDataAboutEmployee(employee);
        }
    }

    private static void printDataAboutEmployee(Employee employee) {
        System.out.println("ID - " + employee.getID_EMPLOYEE() + " " +
                "Name position - \"" + employee.getNamePosition() + "\" " +
                "FTE - " + employee.getFTE() + " " +
                "Month salary - " + dfMoney.format(employee.getMonthSalary()) + " rub " +
                "Work for \"" + employee.getCompany().getNameCompany() + "\"");
    }

    private static double randomAmountMoney(double minMoney, double maxMoney) {
        return minMoney + (maxMoney - minMoney) * rnd.nextDouble();
    }
}
