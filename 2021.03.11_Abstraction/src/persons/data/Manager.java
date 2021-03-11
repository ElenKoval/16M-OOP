package persons.data;

public class Manager extends Employee {
    int grade;

    public Manager(String name, long id, int age, String company, double baseSalary, int grade) {
        super(name, id, age, company, baseSalary);
        if (grade >= 1 && grade <= 4) {
            this.grade = grade;
        }
    }

    public Manager() {
    }

    public int getGrade() {
        return grade;
    }

    public void setGrade(int grade) {
        if (grade >= 1 && grade <= 4) {
            this.grade = grade;
        }
    }

    @Override
    public String toString() {
        return "Manager{" +
                "grade=" + grade +
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
        if (!(o instanceof Manager)) return false;
        if (!super.equals(o)) return false;

        Manager manager = (Manager) o;

        return getGrade() == manager.getGrade();
    }


    @Override
    public double callSalary() {
        return baseSalary * grade;
    }
}
