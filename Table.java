import java.util.Scanner;

public class Table {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = 3;
        int i;
        int result;

        for(i = 1; i <= 10; i++) {
            result = n * i;
            System.out.println("3 * " + i + " = " + result);
        }
    }
}
