package Employee;

public class TopManager extends PrimaryData {
    private static final String NAME_POSITION = "Top manager";

    protected TopManager(double FTE, double salary) {
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
