import java.util.Scanner;

public class Array2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter n : ");
        int n = sc.nextInt();
        int[] A = new int[n];
        int i;

        for(i=0;i<=n-1;i++)
        {
            A[i]=i+1;
        }

        for(i=0;i<=n-1;i++)
        {
            System.out.print(A[i] + "\t");
        }
    }
}
