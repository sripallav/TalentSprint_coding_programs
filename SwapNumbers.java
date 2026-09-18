import java.util.Scanner;
public class SwapNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num a: ");
        int a = sc.nextInt();
        System.out.print("Enter a num b: ");
        int b = sc.nextInt();

        swap s = new swap();
        s.swap(a, b);


    }
    
}

class swap{
    public void swap(int a,int b){

        System.out.println("Before Swapping:");
        System.out.println("a is " + a + " b is " + b);

        int temp = a;
        a = b;
        b = temp;

        System.out.println("After Swapping: ");
        System.out.println("a is " + a + " b is " + b);
    }
}
