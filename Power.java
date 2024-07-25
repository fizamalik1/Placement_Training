import java.util.Scanner;

public class Power {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        
        System.out.println("Enter Base ");
        int base = sc.nextInt();
        System.out.println("Enter Power ");
        int power = sc.nextInt();

        int i;
        int result=1;

        for(i=1;i<=power;i++)
        {
            result = result*base;
        }
        System.out.println("Result is \n" +result);
    }
}
