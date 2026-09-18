import java.util.Scanner;
public class LargestOfTwo {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter a num1 : ");
        int num1 = sc.nextInt();
        System.out.print("enter a num2 : ");
        int num2 = sc.nextInt();

        twonumbers tn = new twonumbers();
        tn.twonumbers(num1, num2);

    }
    
}

class twonumbers{
    public void twonumbers(int num1,int num2){
        if(num1>num2){
            System.out.print(num1 + " is greater than " + num2);
        }
        else if(num1==num2){
            System.out.print("Both are Equal");
        }
        else{
            System.out.print(num2 + " is greater than " + num1);

        }
        
    }
}
