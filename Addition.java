import java.util.Scanner;

public class Addition {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter First Number : ");
        int num1 = sc.nextInt();

        System.out.println("Enter second Number : ");
        int num2 = sc.nextInt();

        int add = num1+num2;
        
        System.out.println("Addition of two numbers : " +add);

    }
}
