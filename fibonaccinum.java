import java.util.Scanner;
public class fibonaccinum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num u want series upto: ");
        int num = sc.nextInt();


        fibo fb = new fibo();
        fb.fibo(num);


    }
    
}

class fibo{
    public void fibo(int num){

        int a = 0;
        int b = 1;

        System.out.print(a + " ");

        for(int i=1;i < num;i++){


        int c = a + b;
        a = b;
        b = c;

        System.out.print(a + " ");

        }
    }
}
