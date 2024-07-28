import java.util.Scanner;

public class Hcf {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in); 
        System.out.println("Enter n1: ");
        int n1 = sc.nextInt();
        System.out.println("Enter n2: ");
        int n2 = sc.nextInt();

        int hcf=0;

        for(int i =1;i<=n1 || i <= n2; i++)
        {
            if(n1 % 1 == 0 && n2 % i == 0)
            {
                hcf = i;
            }
        }
        System.out.println("The HCF : " +hcf);
    }
}
