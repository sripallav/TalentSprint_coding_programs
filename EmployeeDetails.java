import java.util.Scanner;

public class EmployeeDetails {

    public static void displayEmployee(String name, int id, double salary, boolean active) {

        System.out.println("Employee Name   : " + name);
        System.out.println("Employee ID     : " + id);
        System.out.println("Employee Salary : " + salary);
        System.out.println("Active Status   : " + active);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter employee name: ");
        String name = sc.nextLine();

        System.out.print("Enter employee ID: ");
        int id = sc.nextInt();

        System.out.print("Enter salary: ");
        double salary = sc.nextDouble();

        System.out.print("Is employee active? (true/false): ");
        boolean active = sc.nextBoolean();

        displayEmployee(name, id, salary, active);
    }
}