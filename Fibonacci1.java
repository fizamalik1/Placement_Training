import java.util.Scanner;

public class Fibonacci1 
{
    public static void main(String[] args) 
    {
        System.out.println("Enter the number of terms: ");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int n1 = 0, n2 = 1, n3;

        if (n >= 1) System.out.println(n1); // Print first term if at least 1 term is required
        if (n >= 2) System.out.println(n2); // Print second term if at least 2 terms are required

        for (int i = 3; i <= n; i++) 
        {
            n3 = n1 + n2;
            System.out.println(n3);
            n1 = n2;
            n2 = n3;
        }
    }
}
