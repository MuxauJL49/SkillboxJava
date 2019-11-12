package Employee;

import Company.Company;

public class SalesManager extends AbstractEmployee {
    private static final String NAME_POSITION = "Sales manager";
    private static final double PREMIUM_PROCENT = 0.05;
    private double earnedMoneyForCompany;

    public SalesManager(double FTE, double salary, Company company) {
        super(FTE, salary, company);
        earnedMoneyForCompany = 0d;
    }

    @Override
    double formulaPremium() {
        return this.earnedMoneyForCompany * PREMIUM_PROCENT;
    }

    @Override
    public String getNamePosition() {
        return NAME_POSITION;
    }

    @Override
    public double getEarnMoneyForCompany() {
        return earnedMoneyForCompany;
    }

    public boolean addEarnedMoneyForCompany(double money) {
        if (money < 0d) {
            return false;
        }
        earnedMoneyForCompany += money;
        return true;
    }
}
