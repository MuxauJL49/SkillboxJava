package Employee;

import Company.Company;

public class SalesManager extends PrimaryData {
    private static final String NAME_POSITION = "Sales manager";
    private static final double PREMIUM_PROCENT = 0.05;

    public SalesManager(double FTE, double salary, Company company) {
        super(FTE, salary, company);
    }

    @Override
    double formulaPremium() {
        return this.getEarnedMoneyForCompany() * PREMIUM_PROCENT;
    }

    @Override
    public String getNamePosition() {
        return NAME_POSITION;
    }
}
