import java.util.Scanner;

public class Factorial {
    public static void main(String[] args)
     {
        System.out.println("Enter the value of a ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        
        int result = 1;
        for(int fact = a; fact >=1 ; fact--)
        {
            result = fact*result;
        }

        System.out.println("Factorial is " +result);
    }
}

    /*factorial program using while loop
    public static void main(String[] args) {

        System.out.println("Enter the value of a ");
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();

        int result = 1;
        int fact=a;
        while(fact>=1)
        {
            result = fact*result;
            fact--;
        }
            System.out.println("Factorial is " +result);
    }
}*/
 