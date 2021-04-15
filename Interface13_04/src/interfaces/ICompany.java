package interfaces;

import model.Employee;

public interface ICompany {
    boolean addEmployee(Employee employee);
    Employee removeEmployee(int id);
    double totalSalary();
    double avgSalary();
    double totalSales();
    int size();
    void printCompany();
    Employee getEmployeeById(int id);
}
