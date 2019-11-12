package Company;

import Employee.AbstractEmployee;

import java.util.ArrayList;
import java.util.Collections;


public class Company {

    private String nameCompany;
    private ArrayList<AbstractEmployee> staff = new ArrayList<>();

    public Company(String nameCompany) {
        this.nameCompany = nameCompany;
    }


    /**
     * This works with staff
     */
    public void addEmployeeInCompany(AbstractEmployee employee) {
        staff.add(employee);
    }

    public boolean toFireEmployee(int positionEmployeeInList) {
        if (positionEmployeeInList > staff.size()) {
            return false;
        }
        staff.remove(positionEmployeeInList);
        return true;
    }


    /**
     * This part works with money
     */
    public double getMontlyIncome() {
        double income = 0d;
        for (AbstractEmployee employee : staff) {
            income += employee.getEarnMoneyForCompany();
        }
        return income;
    }


    /**
     * This part return arrayList with staff and contains other function for working it
     */
    private boolean isSizeArrayCorrecr(int count) {
        return count < staff.size();
    }

    public ArrayList<AbstractEmployee> getTopSalsryStaff(int count) {
        if (!isSizeArrayCorrecr(count)) {
            return null;
        }
        Collections.sort(staff);
        return new ArrayList<AbstractEmployee>(staff.subList(0, count));
    }

    public ArrayList<AbstractEmployee> gerLowerstSalsryStaff(int count) {
        if (!isSizeArrayCorrecr(count)) {
            return null;
        }
        Collections.sort(staff);
        int sizeAL = staff.size() - 1;
        return new ArrayList<AbstractEmployee>(staff.subList(sizeAL - count, sizeAL));
    }

    public ArrayList<AbstractEmployee> getStaffOfCompany() {
        return staff;
    }


    /**
     * This part contains extra functions with information about the company
     */
    public String getNameCompany() {
        return nameCompany;
    }
}
