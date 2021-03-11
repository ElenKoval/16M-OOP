package persons.data;

public class SalesMan extends Employee {
    double totalSales;
    int bonus;

    public SalesMan(String name, long id, int age, String company, double baseSalary, double totalSales, int bonus) {
        super(name, id, age, company, baseSalary);
        this.totalSales = totalSales;
        if (bonus > 0 && bonus <= 100) {
            this.bonus = bonus;
        }
    }

    public SalesMan() {
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public int getBonus() {
        return bonus;
    }

    public void setBonus(int bonus) {
        if (bonus > 0 && bonus <= 100) {
            this.bonus = bonus;
        }
    }

    @Override
    public String toString() {
        return "SalesMan{" +
                "totalSales=" + totalSales +
                ", bonus=" + bonus + "%" +
                ", company='" + company + '\'' +
                ", baseSalary=" + baseSalary +
                ", name='" + name + '\'' +
                ", id=" + id +
                ", age=" + age +
                '}';
    }

    @Override
    public double callSalary() {
        return baseSalary + totalSales * (bonus / 100);
    }
}
