// Write a Java program to classify a student's result based on marks:

// 90–100 → Distinction
// 75–89 → First Class
// 60–74 → Second Class
// 40–59 → Pass
// Below 40 → Fail

import java.util.Scanner;
public class StudentResult {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("enter Student Marks: ");
        int Marks = sc.nextInt();

        Student st = new Student();
        st.Student(Marks);
        
    }
}

class Student{
    public void Student(int Marks){
        if(Marks>=90 && Marks<=100){
            System.out.print("Distinction");
        }
        else if(Marks>=75){
            System.out.print("First class");
        }
        else if(Marks>=60){
            System.out.print("Secound class");
        }
        else if(Marks>=40){
            System.out.print("Pass");
        }
        else{
            System.out.print("Fail");
        }
    }
}
