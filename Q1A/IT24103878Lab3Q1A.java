import java.util.Scanner;

public class IT24103878Lab3Q1A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double quantity = scanner.nextDouble();

        double total = pricePerKg * quantity;

        System.out.println("The amount you have to pay is: " + total);

        scanner.close();
    }
}
