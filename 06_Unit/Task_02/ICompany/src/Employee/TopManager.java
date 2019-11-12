package Employee;

import Company.Company;

public class TopManager extends AbstractEmployee {
    private static final String NAME_POSITION = "Top manager";
    private static final double PREMIUM_PROCENT = 0.01;

    public TopManager(double FTE, double salary, Company company) {
        super(FTE, salary, company);
    }

    @Override
    double formulaPremium() {
        if (this.getCompany().getMontlyIncome() > 10_000_000d) {
            return getCompany().getMontlyIncome() * PREMIUM_PROCENT;
        }
        return 0;
    }

    @Override
    public String getNamePosition() {
        return NAME_POSITION;
    }

    @Override
    public double getEarnMoneyForCompany() {
        return 0d;
    }


}
