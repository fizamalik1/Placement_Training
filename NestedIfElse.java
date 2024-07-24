import java.util.Scanner;

public class NestedIfElse {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Gender");
        String gender = sc.nextLine();

        System.out.println("Enter Body Mass Index");
        int BMI = sc.nextInt();

        if(gender=="male")
        {
            if(BMI > 30)
            {
                System.out.println("overweight");
            }
            else{
                System.out.println("underweight");
            }
        }
        else
        {
            if(BMI > 27)
            {
                System.out.println("overweight");
            }
            else{
                System.out.println("underweight");
            }
        }
    }
}
