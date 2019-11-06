package Employee;

public abstract class HighLevel extends PrimaryData {

    public HighLevel (){
        setSalary(0d);
    }

    abstract void setSalary(double salary);

}
