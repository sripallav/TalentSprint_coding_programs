import java.util.Scanner;

public class CubeVolume {

    public static int calculateVolume(int side) {
        return side * side * side;
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter side of cube: ");
        int side = sc.nextInt();

        int volume = calculateVolume(side);

        System.out.println("Volume of cube = " + volume);
    }
}