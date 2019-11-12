package Employee;

import Company.Company;

public abstract class AbstractEmployee implements Comparable<AbstractEmployee> {
    private String ID_EMPLOYEE;
    private double salary = 0d;
    private double FTE = 1d; //Full-Time Employee
    private static int counterEmployee = 1;
    private Company company;

    AbstractEmployee(double FTE, double salary, Company company) {
        this.FTE = FTE;
        this.salary = salary;
        ID_EMPLOYEE = String.format("%04d", counterEmployee);
        counterEmployee++;
        this.company = company;
        this.company.addEmployeeInCompany(this);
    }


    public double getMonthSalary() {
        double premium = formulaPremium();
        return (salary * FTE) + premium;
    }

    @Override
    public int compareTo(AbstractEmployee employee) {
        if (getMonthSalary() < employee.getMonthSalary()) {
            return 1;
        } else if (getMonthSalary() > employee.getMonthSalary()) {
            return -1;
        } else {
            return 0;
        }
    }

    /**
     * Abstract functions
     */
    abstract double formulaPremium();
    abstract public String getNamePosition();
    abstract public double getEarnMoneyForCompany();

    /**
     * getters/setters
     * @return
     */
    public String getId() {
        return ID_EMPLOYEE;
    }

    public Company getCompany() {
        return company;
    }

    public double getFTE() {
        return FTE;
    }


}
