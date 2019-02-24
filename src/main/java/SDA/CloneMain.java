package SDA;

public class CloneMain {
    public static void main(String[] args) {
        Employee emp = new Employee("Abhi");
        try {
            Employee emp2 = (Employee) emp.clone();
            // (Employee) bo trzeba rzutować z object ( clone nalezy do object) na obiekt Employee
            //Object object = emp;
            // rzutowanie objekt innego typu  - ale pochodnych powiazanych ze sobą dziedziczących ( ze obiekt ogólny ma sie zachowywać jak obiekt konkretny ) narzucienie konkretnej roli
            // parsoanie tłumaczenie jednego obiektu na drugi  - obiektów nie powiązanych ze soba - tłumacz
            System.out.println(emp2.getName());
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
