package persons.data;

public class WageEmployee extends Employee {
    int hours;
    double wage;

    public WageEmployee(String name, long id, int age, String company, double baseSalary, int hours, double wage) {
        super(name, id, age, company, baseSalary);
        this.hours = hours;
        this.wage = wage;
    }

    public WageEmployee() {
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public double getWage() {
        return wage;
    }

    public void setWage(double wage) {
        this.wage = wage;
    }

    @Override
    public String toString() {
        return "WageEmployee{" +
                "hours=" + hours +
                ", wage=" + wage +
                ", company='" + company + '\'' +
                ", baseSalary=" + baseSalary +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof WageEmployee)) return false;
        if (!super.equals(o)) return false;

        WageEmployee that = (WageEmployee) o;

        if (getHours() != that.getHours()) return false;
        return Double.compare(that.getWage(), getWage()) == 0;
    }


    @Override
    public double callSalary() {
        return hours * wage;
    }
}