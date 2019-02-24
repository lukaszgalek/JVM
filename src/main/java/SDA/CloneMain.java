package SDA;

public class CloneMain {
    public static void main(String[] args) {
        Employee emp = new Employee("Abhi");
        try {
            Employee emp2 = (Employee) emp.clone();
            System.out.println(emp2.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
