package Company;

import Employee.Employee;

import java.util.ArrayList;
import java.util.Collections;

public class Company {
    private String nameCompany;
    private double monthlyProfit;
    private ArrayList<Employee> employees = new ArrayList<Employee>();

    public Company(String nameCompany) {
        this.nameCompany = nameCompany;
        monthlyProfit = 0d;
    }

    public void addMoneyInMonthlyProfit(double money) {
        monthlyProfit += money;
    }

    public void addEmployeeInCompany(Employee employee) {
        employees.add(employee);
    }

    public ArrayList<Employee> getTopSalsryStaff(int count) {
        if (!isSizeArrayCorrecr(count)) {
            return null;
        }
        Collections.sort(employees);
        return new ArrayList<Employee>(employees.subList(0, count));
    }

    public ArrayList<Employee> gerLowerstSalsryStaff(int count) {
        if (!isSizeArrayCorrecr(count)) {
            return null;
        }
        Collections.sort(employees);
        int sizeAL = employees.size() - 1;
        return new ArrayList<Employee>(employees.subList(sizeAL - count, sizeAL));
    }

    private boolean isSizeArrayCorrecr(int count) {
        if (count > employees.size()) {
            return false;
        }
        return true;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }

    public double getMontlyProfit() {
        return monthlyProfit;
    }

    public void setMontlyProfit(double montlyProfit) {
        this.monthlyProfit = montlyProfit;
    }

    public String getNameCompany() {
        return nameCompany;
    }
}
