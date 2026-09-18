import java.util.Scanner;
public class TriangleArea {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a base: ");
        int base = sc.nextInt();
        System.out.print("Enter a Height: ");
        int height = sc.nextInt();

        triangle t = new triangle();
        t.triangle(base, height);





        
    }
    
}

class triangle{
    public void triangle(int base,int height){

        double area = 0.5*base*height;

        System.out.print(area);
    }
    
   
    }


