package Employee;

import Company.Company;

public class Clerk extends AbstractEmployee {
    private static final String NAME_POSITION = "Clerk";

    public Clerk(double FTE, double salary, Company company) {
        super(FTE, salary, company);
    }

    //no premium
    @Override
    double formulaPremium() {
        return 0;
    }

    @Override
    public String getNamePosition() {
        return NAME_POSITION;
    }

    @Override
    public double getEarnMoneyForCompany() {
        return 0;
    }
}
