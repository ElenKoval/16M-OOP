package persons.data;

public abstract class Employee extends Person {
    String company;
    double baseSalary;

    public Employee(String name, long id, int age, String company, double baseSalary) {
        super(name, id, age);
        this.company = company;
        this.baseSalary = baseSalary;
    }

    public Employee() {
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        this.baseSalary = baseSalary;
    }


    @Override
    public String toString() {
        return "Employee{" +
                "company='" + company + '\'' +
                ", baseSalary=" + baseSalary +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Employee)) return false;

        Employee employee = (Employee) o;

        if (Double.compare(employee.getBaseSalary(), getBaseSalary()) != 0) return false;
        return getCompany() != null ? getCompany().equals(employee.getCompany()) : employee.getCompany() == null;
    }

    public abstract double callSalary();

}
