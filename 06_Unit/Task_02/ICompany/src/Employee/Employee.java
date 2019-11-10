package Employee;

import Company.Company;

public interface Employee extends Comparable<Employee> {
    double getMonthSalary();

    String getID_EMPLOYEE();

    Company getCompany();

    double getFTE();

    String getNamePosition();

    boolean addEarnedMoneyForCompany(double money);
}
