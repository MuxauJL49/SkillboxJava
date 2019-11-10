package Employee;

import Company.Company;

public class TopManager extends PrimaryData {
    private static final String NAME_POSITION = "Top manager";
    private static final double PREMIUM_PROCENT = 0.1;

    public TopManager(double FTE, double salary, Company company) {
        super(FTE, salary, company);
    }

    @Override
    double formulaPremium() {
        if (this.getCompany().getMontlyProfit() > 10_000_000d) {
            return getEarnedMoneyForCompany() * PREMIUM_PROCENT;
        }
        return 0;
    }


    @Override
    public String getNamePosition() {
        return NAME_POSITION;
    }
}
