import java.util.Scanner;

public class Pattern3
 {
        public static void main(String[] args) 
    {
        int i, j;
        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter n: ");
        int n = sc.nextInt();

        for (i = 1; i <= n; i++) {
            // Print leading spaces
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            // Print asterisks
            for (j = 1; j <= i; j++) {
                System.out.print(" * ");
            }
            // Move to the next line after each row
            System.out.println();
        }
    }
}
