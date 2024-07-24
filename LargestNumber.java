import java.util.Scanner;

public class LargestNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        System.out.println("enter second number");
        System.out.println("enter third number");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        if(x>y&&x>z)
        System.out.println("x is the largest");
        else if(y>x&&y>z)
        System.out.println("y is the largest");
        else
        System.out.println("z is the largest");
    }
}
