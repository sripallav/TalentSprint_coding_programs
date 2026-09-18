import java.util.Scanner;

public class Stringchange {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter first number: ");
        String str1 = sc.nextLine();

        System.out.print("Enter second number: ");
        String str2 = sc.nextLine();

        int num1 = Integer.parseInt(str1);
        int num2 = Integer.parseInt(str2);

       

        System.out.println(num1+num2);
    }
}