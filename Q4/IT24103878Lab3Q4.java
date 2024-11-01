import java.util.Scanner;
public class IT24103878Lab3Q4{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int digit1 = 0, digit2 = 0, digit3 = 0, digit4 = 0, digit5 = 0;
       
        int number;
        System.out.print("Enter the five-digit number: ");
        number = scanner.nextInt();


        digit1 = number / 10000;
        number = number % 10000;
        digit2 = number / 1000;
        number = number % 1000;
        digit3 = number / 100;
        number = number % 100;
        digit4 = number / 10;
        number = number % 10;
        digit5 = number;
       
        System.out.println(digit1 + " " + digit2 + " " + digit3 + " " + digit4 + " " + digit5);
    }
}

