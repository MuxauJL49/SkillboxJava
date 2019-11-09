package Employee;

public class SalesManager extends PrimaryData {
    private static final String NAME_POSITION = "Sales manager";

    protected SalesManager(double FTE, double salary) {
        super(FTE, salary);
    }

    @Override
    double formulaPremium() {
        return 0;
    }

    public static String getNamePosition() {
        return NAME_POSITION;
    }

}
