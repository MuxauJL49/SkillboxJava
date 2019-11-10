package Employee;

import Company.Company;

abstract class PrimaryData implements Employee {
    private String ID_EMPLOYEE;
    private double earnedMoneyForCompany;
    private double salary = 0d;
    private double FTE = 1d; //Full-Time Employee
    private static int counterEmployee = 1;
    private Company company;

    PrimaryData(double FTE, double salary, Company company) {
        this.FTE = FTE;
        this.salary = salary;
        ID_EMPLOYEE = String.format("%4s", counterEmployee).replace(' ', '0');
        earnedMoneyForCompany = 0d;
        counterEmployee++;
        this.company = company;
        this.company.addEmployeeInCompany(this);
    }

    abstract double formulaPremium();

    public double getEarnedMoneyForCompany() {
        return earnedMoneyForCompany;
    }

    public boolean addEarnedMoneyForCompany(double money) {
        if (money < 0d) {
            return false;
        }
        company.addMoneyInMonthlyProfit(money);
        earnedMoneyForCompany += money;
        return true;
    }

    @Override
    public double getMonthSalary() {
        double premium = formulaPremium();
        return (salary * FTE) + premium;
    }

    @Override
    public int compareTo(Employee employee) {
        if (getMonthSalary() > employee.getMonthSalary()) {
            return 1;
        } else if (getMonthSalary() < employee.getMonthSalary()) {
            return -1;
        } else {
            return 0;
        }
    }

    public String getID_EMPLOYEE() {
        return ID_EMPLOYEE;
    }

    public Company getCompany() {
        return company;
    }

    public double getFTE() {
        return FTE;
    }

}
