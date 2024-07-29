import java.util.Scanner;

public class Array3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of cities: ");
        int n = sc.nextInt();
        sc.nextLine(); // Consume the newline left by nextInt()
        String[] cities = new String[n];

        System.out.println("Enter the names of the cities:");
        for(int i = 0; i < cities.length; i++) {
            cities[i] = sc.nextLine();
        }

        System.out.println("You entered the following cities:");
        for(int i = 0; i < cities.length; i++) {
            System.out.print(cities[i] + "\t");
        }
    }
}
