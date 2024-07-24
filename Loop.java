import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number"); 
        int num = sc.nextInt();
        int i;
        int evensum=0;
        int oddsum=0;

        for(i=1;i<=num;i++)
        {
            if(i%2==0)
            {
                evensum=evensum+i;
            }
            else
            {
                oddsum=oddsum+i;
            }
        }

        System.out.println("even sum is : " +evensum);
        System.out.println("odd sum is : " +oddsum);

    }
}

/*here we will add the odd numbers and even numbers seoparately
 * ex- number 5
 * even sum = 2+4=6
 * odd sum = 1+3+5=9
 */
