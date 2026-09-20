import java.util.Scanner;

public class StringToInteger {

    public static int addNumbers(String a, String b) {

        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);

        return num1 + num2;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number as String: ");
        String a = sc.nextLine();

        System.out.print("Enter second number as String: ");
        String b = sc.nextLine();

        int result = addNumbers(a, b);

        System.out.println("Addition = " + result);
    }
}