package dao;

import interfaces.ICompany;
import model.Employee;

public class Company implements ICompany {
    private Employee[] employees;
    private int size;

    public Company(int capacity) {
        if (capacity <= 0) {
            employees = new Employee[20];
        } else {
            employees = new Employee[capacity];
        }
        size = 0;
    }

    @Override
    public boolean addEmployee(Employee employee) {
        if (size == employees.length) {
            return false;
        }
        for (int i = 0; i < size; i++) {
            if (employee.equals(employees[i])) {
                return false;
            }
        }
        employees[size++] = employee;
        //size++;
        return true;
    }

    @Override
    public Employee removeEmployee(int id) {
        //TODO
        return null;
    }

    @Override
    public double totalSalary() {
        //TODO
        return 0;
    }

    @Override
    public double avgSalary() {
        //TODO
        return 0;
    }

    @Override
    public double totalSales() {
        //TODO
        return 0;
    }

    @Override
    public int size() {
        //TODO
        return 0;
    }

    @Override
    public void printCompany() {
        //TODO
    }

    @Override
    public Employee getEmployeeById(int id) {
        for (int i = 0;i<size;i++){
            if (id == employees[i].getId()){
                return employees[i];
            }
        }
        return null;
    }
}
