package persons.personAppl;

import persons.data.*;

public class EmployeesAppl {
    public static void main(String[] args) {
        Employee emps1 = new Manager("manager name1", 3455677, 34, "Company name1", 43000.56, 1);
        Employee emps2 = new Manager("manager name2", 3461103, 45, "Company name2", 48000.00, 4);
        Employee emps3 = new Manager("manager name3", 3444155, 35, "Company name2", 45000.00, 1);
        Employee emps4 = new SalesMan("personsAb.data.SalesMan name 1", 5674567, 28, "Company name1", 23900.50, 456000.15, 10);
        Employee emps5 = new SalesMan("personsAb.data.SalesMan name 2", 5674538, 38, "Company name2", 24500.00, 678000.90, 15);
        Employee emps6 = new SalesMan("personsAb.data.SalesMan name 3", 6745468, 37, "Company name3", 21500.00, 51800.90, 10);
        Employee emps7 = new WageEmployee("personsAb.data.WageEmployee name1", 4940023, 40, "Company name1", 25000.45, 3500, 15.00);
        Employee emps8 = new WageEmployee("personsAb.data.WageEmployee name2", 4670088, 30, "Company name2", 18000.45, 6700, 15.00);
        Employee emps9 = new WageEmployee("personsAb.data.WageEmployee name3", 4670088, 45, "Company name3", 18000.45, 1790, 18.00);
        Employee[] emps = {emps1, emps2, emps3, emps4, emps5, emps6, emps7, emps8, emps9};


        printAllEmployees(emps);
        System.out.println("====================================================");
        System.out.println("Cумма всех зарплат всех сотрудников: " + getSumSalaryAllEmployees(emps));
        System.out.println("====================================================");
        double salary = 100000.0;
        System.out.println("Cотрудники, у которых заработная плата равна или выше " + salary);
        printEmpsWithSalaryMoreThan(emps, salary);
        System.out.println("====================================================");
        System.out.println("доход компании(сумма продаж всех менеджеров по продажам) " + getСompanyRevenue(emps) + " euro");
    }

    private static double getСompanyRevenue(Employee[] emps) {
        int revenue = 0;
        for (Employee p : emps) {
            if (p instanceof SalesMan) {
                revenue += ((SalesMan) p).getTotalSales();
            }
        }
        return revenue;
    }


    private static void printEmpsWithSalaryMoreThan(Employee[] emps, double salary) {
        for (Employee p : emps) {
            if (p.callSalary() >= salary)
                System.out.println(p.toString() + " salary = " + p.callSalary());
        }
    }


    private static double getSumSalaryAllEmployees(Employee[] emps) {
        double sum = 0.0;
        for (Employee p : emps) {
            sum += p.callSalary();
        }
        return sum;
    }

    private static void printAllEmployees(Employee[] emps) {
        for (Employee p : emps) {
            System.out.println(p.toString());
        }
    }
}

