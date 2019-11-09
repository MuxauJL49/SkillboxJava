package Employee;

abstract class PrimaryData implements Comparable<PrimaryData>, Employee {
    private String ID_EMPLOYEE;
    private double salary = 0d;
    private double premium = 0d;
    private double FTE = 1d;
    private static int counterEmployee = 1;

    PrimaryData(double FTE, double salary) {
        this.FTE = FTE;
        this.salary = salary;
        premium = formulaPremium();
        ID_EMPLOYEE = String.format("%s4", counterEmployee).replace(' ', '0');
        counterEmployee++;
    }

    abstract double formulaPremium();

    @Override
    public double getMonthSalary() {
        premium = formulaPremium();
        return (salary * FTE) + premium;
    }

    @Override
    public int compareTo(PrimaryData primaryData) {
        if (getMonthSalary() > primaryData.getMonthSalary()) {
            return 1;
        } else if (getMonthSalary() < primaryData.getMonthSalary()) {
            return -1;
        } else {
            return 0;
        }
    }

    public String getID_EMPLOYEE() {
        return ID_EMPLOYEE;
    }
}
