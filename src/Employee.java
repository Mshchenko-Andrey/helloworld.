import java.util.Objects;

public class Employee {
    private static int counter = 1;

    private final int id;
    private String fullName;
    private int department;
    private double salary;


    public Employee(String fullName, int department, double salary) {
        this.id = counter++;
        this.fullName = fullName;
        this.department = department;
        this.salary = salary;
    }


    public int getId() {
        return id;
    }

    public String getFullName() {
        return fullName;
    }

    public int getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }


    public void setDepartment(int department) {
        if (department >= 1 && department <= 5) {
            this.department = department;
        } else {
            System.out.println("Ошибка: номер отдела должен быть от 1 до 5.");
        }
    }

    public void setSalary(double salary) {
        if (salary >= 0) {
            this.salary = salary;
        } else {
            System.out.println("Ошибка: зарплата не может быть отрицательной.");
        }
    }


    @Override
    public String toString() {
        return String.format(
                "ID: %d | ФИО: %-20s | Отдел: %d | Зарплата: %.2f руб.",
                id, fullName, department, salary
        );
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return id == employee.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}