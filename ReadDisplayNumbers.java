import java.util.Scanner;

public class ReadDisplayNumbers {

    public static void displayNumbers(int a, int b) {

        System.out.println("First number = " + a);
        System.out.println("Second number = " + b);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int a = sc.nextInt();

        System.out.print("Enter second number: ");
        int b = sc.nextInt();

        displayNumbers(a, b);
    }
}