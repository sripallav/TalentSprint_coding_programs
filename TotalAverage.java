import java.util.*;
public class TotalAverage {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter sub1 marks: " );
        int sub1 = sc.nextInt();
        System.out.print("Enter sub2 marks: " );
        int sub2 = sc.nextInt();
        System.out.print("Enter sub3 marks: " );
        int sub3 = sc.nextInt();

        avgtol avt = new avgtol();
        avt.avgtol(sub1,sub2,sub3);
        


    }
    
}

class avgtol{
    public void avgtol(int sub1,int sub2,int sub3){

        int total = sub1+sub2+sub3;
        double average = (sub1+sub2+sub3)/3.0;

        System.out.println("total Marks: " + total);
        System.out.println("Average Marks " + average);

    }
}
