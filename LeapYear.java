import java.util.Scanner;
public class LeapYear {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int Year = sc.nextInt();

        leap ly = new leap();
        System.out.print(ly.leap(Year));

        
    }
    
}

class leap{
public String leap(int Year){
    if(Year%4==0 && Year%100!=0 || Year%400==0){
        return "Leap Year";
    }
    else{
        return "not a leap year";
    }
}
}
