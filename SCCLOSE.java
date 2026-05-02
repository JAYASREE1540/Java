import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        double g = sc.nextDouble();
        System.out.println("Your number is " + g);

        System.out.print("Enter another number: ");
        double h = sc.nextDouble();
        System.out.println("Your number is " + h);

        sc.close(); 
    }
}
