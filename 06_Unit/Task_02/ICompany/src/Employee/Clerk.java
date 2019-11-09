package Employee;

public class Clerk extends PrimaryData{
    private static final String NAME_POSITION = "Clerk";

    protected Clerk(double FTE, double salary) {
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
