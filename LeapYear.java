import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the Year : ");
        double year = sc.nextDouble();
        
        if(year % 400 == 0 || year %4 == 0 && year % 100!=0)
        {
            System.out.println("Entered year is a Leap Year");
        }
        else{
            System.out.println("Not a Leap Year");
        }
    }
}
