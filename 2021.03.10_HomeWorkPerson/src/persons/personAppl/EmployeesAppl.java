package persons.personAppl;

import persons.data.*;

public class EmployeesAppl {
    public static void main(String[] args) {
        Employee emps1 = new Manager("manager name1", 3455677, 34, "Company name1", 123000.56, 10);
        Employee emps2 = new Manager("manager name2", 346110, 45, "Company name2", 156000.00, 12);
        Employee emps3 = new SalesMan("SalesMan name 1", 56745677, 28, "Company name1", 87900.50, 456.15, 15);
        Employee emps4 = new SalesMan("SalesMan name 2", 56745368, 38, "Company name2", 104500.00, 678.90, 18);
        Employee emps5 = new WageEmployee("WageEmployee name1", 4940023, 40, "Company name1", 25000.45, 35, 15.89);
        Employee emps6 = new WageEmployee("WageEmployee name2", 4670088, 30, "Company name2", 18000.45, 67, 18.12);
        Employee[] emps = {emps1, emps2, emps3, emps4, emps5, emps6};
        printAllEmployees(emps);
    }

    private static void printAllEmployees(Employee[] emps) {
        for (Employee p : emps) {
            System.out.println(p.toString());
        }
    }
}

