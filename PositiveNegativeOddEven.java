// Checks whether a number is positive, negative, or zero.
// If it is positive, check whether it is odd or even.

import java.util.Scanner;
public class PositiveNegativeOddEven {
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();


        PNOE vn = new PNOE();
        vn.PNOE(num);


    }
    
}

class PNOE{
    public void PNOE(int num){
        if(num>0){
            System.out.println("Positive");
            if(num%2==0){
                System.out.println("Even");

            }
            else{
                System.out.print("odd");
            }
        }

        else if(num<0){
            System.out.print("Negative");
        }

        else{
            System.out.print("Zero");
        }
    }
}
