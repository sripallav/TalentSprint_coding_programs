import java.util.Scanner;
class PositiveNegativeZero{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a num: ");
        int num = sc.nextInt();

        NumberNPZ NPZ = new NumberNPZ();
        System.out.print(NPZ.NumberNPZ(num));



    }
}

class NumberNPZ{
    public String NumberNPZ(int num){
        if(num<0){
            return "Negative";
        }
        else if(num==0){
            return "Zero";
        }
        else{
            return "Positive";
        }
    }
}