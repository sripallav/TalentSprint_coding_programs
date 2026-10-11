import java.util.Scanner;
public class adam{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num : ");
        int num = sc.nextInt();

        adamnum ad = new adamnum();
        ad.adamnum(num);


    }
}

class adamnum{
    public void adamnum(int num){

        int num1 = num * num;
        int reverse = 0;

        while(num>0){
            int digit = num%10;
            reverse = reverse*10+digit;
            num = num/10;

        }

        int num2 = reverse * reverse;

        int reverse1 = 0;

        while(num1>0){
            int digit = num1%10;
            reverse1 = reverse1*10+digit;
            num1 = num1/10;

        }

        if(num2 == reverse1){
            System.out.print("it is a adam number");
        }
        else{
            System.out.print("it is not a adam number");

        }

        
    }

}