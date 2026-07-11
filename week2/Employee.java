package week2;
public class Employee {

    int empId;
    String empName;
    double salary;

    Employee(int id, String name, double sal) {
        empId = id;
        empName = name;
        salary = sal;
    }

    void display() {
        System.out.println(empId);
        System.out.println(empName);
        System.out.println(salary);
    }

    public static void main(String[] args) {

        Employee e = new Employee(101, "Ganesh", 45000);

        e.display();
    }
}