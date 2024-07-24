import java.util.Scanner;

public class SimpleIf {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the age of the person: ");
        double age = sc.nextDouble();
        if(age>18)
        {
            System.out.println("He/She can Vote");
        }
        else
        {
            System.out.println("Not ELigible");
        }
    }
    
}
