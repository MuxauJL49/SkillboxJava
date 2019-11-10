package Employee;

import Company.Company;

public class Clerk extends PrimaryData {
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
}
