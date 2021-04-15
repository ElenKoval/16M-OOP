import interfaces.ICompany;
import model.Employee;
import org.junit.Test;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;

public class CompanyTest {
    ICompany company;
    Employee john;
    Employee ann;
    Employee emily;
    Employee ivan;
    final int capacity =5;
    @BeforeAll
    void beforeAll(){
        System.out.println("Before All");
    }
    @BeforeEach
    void beforeEach(){
        System.out.println("Before Each");

    }

    @Test
    public void addEmployee() {
        System.out.println("add Employee");
    }

    @Test
    public void removeEmployee() {
        System.out.println("remove Employee");
    }

    @Test
    public void totalSalary() {
        System.out.println("total Salaty ");

    }

    @Test
    public void avgSalary() {
    }

    @Test
    public void totalSales() {
    }

    @Test
    public void size() {
    }

    @Test
    public void printCompany() {
    }

    @Test
    public void getEmployeeById() {
    }
}