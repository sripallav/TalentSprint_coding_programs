import java.util.Scanner;

public class TriangleAreaPerimeter {

    public static double calculateArea(double base, double height) {
        return 0.5 * base * height;
    }

    public static double calculatePerimeter(double a, double b, double c) {
        return a + b + c;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter base: ");
        double base = sc.nextDouble();

        System.out.print("Enter height: ");
        double height = sc.nextDouble();

        System.out.print("Enter side 1: ");
        double a = sc.nextDouble();

        System.out.print("Enter side 2: ");
        double b = sc.nextDouble();

        System.out.print("Enter side 3: ");
        double c = sc.nextDouble();

        double area = calculateArea(base, height);
        double perimeter = calculatePerimeter(a, b, c);

        System.out.println("Area = " + area);
        System.out.println("Perimeter = " + perimeter);
    }
}