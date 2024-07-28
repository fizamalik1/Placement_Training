
import java.util.Scanner;

public class Reverse {
    public static void main(String[] args) {
        
        int reversed = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num = sc.nextInt();
        System.out.println("Original Number: " + num);

        while(num!=0)
        {
            int digit = num % 10;
            reversed = reversed * 10 + digit;
            num /= 10;
        }
        System.out.println("Reversed number : " + reversed);
    }
}
