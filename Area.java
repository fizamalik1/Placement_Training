import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter length : ");
        double l = sc.nextDouble();

        System.out.println("Enter breadth : ");
        float b = sc.nextFloat();

        double area = l*b;
        System.out.println("Area of Rectangle : " +area);
    }
    
}
