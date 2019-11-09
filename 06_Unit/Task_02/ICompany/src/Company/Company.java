package Company;

import Employee.Employee;

import java.util.ArrayList;

public class Company {


    private double montlyProfit;


    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public void addEmployeeInCompany(Employee employee){
        employees.add(employee);
    }

    public ArrayList<Employee> getTopSalsryStaff(int count){
        return null;
    }

    public ArrayList<Employee> gerLowerstSalsryStaff(int count) {
        return null;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public double getMontlyProfit() {
        return montlyProfit;
    }

    public void setMontlyProfit(double montlyProfit) {
        this.montlyProfit = montlyProfit;
    }
}
