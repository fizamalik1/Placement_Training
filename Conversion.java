import java.util.Scanner;

public class Conversion {
    public static void main(String[] args) {
        double a = 9.0/5.0;

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of Centigrade : ");
        int C = sc.nextInt();

        double Fahrenheit = a*C+32;
        System.out.println("Fahrenheit is : " +Fahrenheit);
    }
    
}
