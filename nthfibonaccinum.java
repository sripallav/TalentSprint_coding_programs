import java.util.Scanner;
public class nthfibonaccinum {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num: ");
        int num = sc.nextInt();


        nthfibo nf = new nthfibo();
        nf.nthfibo(num);

    }  
}

class nthfibo{
    public void nthfibo(int num){

        int a = 0;
        int b = 1;

        for(int i=0;i<num;i++){


            int c = a + b;
            a = b;
            b = c;

            

        }

         System.out.print(a);
    }
}
