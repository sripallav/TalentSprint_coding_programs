import java.util.Scanner;

public class SeparateDigits {

    public static void separateDigits(int num) {

        int digit1 = num / 1000;
        int digit2 = (num / 100) % 10;
        int digit3 = (num / 10) % 10;
        int digit4 = num % 10;

        System.out.println("First digit  = " + digit1);
        System.out.println("Second digit = " + digit2);
        System.out.println("Third digit  = " + digit3);
        System.out.println("Fourth digit = " + digit4);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a 4-digit number: ");
        int num = sc.nextInt();

        separateDigits(num);
    }
}