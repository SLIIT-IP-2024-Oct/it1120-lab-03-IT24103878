import java.util.Scanner;

public class IT24103878Lab3Q1B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the price of 1kg of rice: ");
        double pricePerKg = scanner.nextDouble();

        System.out.print("Enter the number of kilograms you want to buy: ");
        double numberOfKg = scanner.nextDouble();

        double total = pricePerKg * numberOfKg;
        double discount = 0.10 * total;
        double finalAmount = total - discount;

        System.out.println("The amount you have to pay after a 10% discount is: " + finalAmount);

        scanner.close();
    }
}
