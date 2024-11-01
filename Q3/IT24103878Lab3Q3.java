import java.util.Scanner;

public class IT24103878Lab3Q3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
  
        int numOf5000 = 0, numOf1000 = 0, numOf500 = 0, numOf200 = 0, numOf100 = 0;
        int numOf50 = 0, numOf20 = 0, numOf10 = 0, numOf05Coins = 0, numOf02Coins = 0, numOf01Coins = 0;
        
        System.out.print("Enter the rupee amount: ");
	int amount = scanner.nextInt();
        

        numOf5000 = amount / 5000;
        amount %= 5000;
        numOf1000 = amount / 1000;
        amount %= 1000;
        numOf500 = amount / 500;
        amount %= 500;
        numOf200 = amount / 200;
        amount %= 200;
        numOf100 = amount / 100;
        amount %= 100;
        numOf50 = amount / 50;
        amount %= 50;
        numOf20 = amount / 20;
        amount %= 20;
        numOf10 = amount / 10;
        amount %= 10;
        numOf05Coins = amount / 5;
        amount %= 5;
        numOf02Coins = amount / 2;
        amount %= 2;
        numOf01Coins = amount;

        System.out.println("5000 notes: " + numOf5000);
        System.out.println("1000 notes: " + numOf1000);
        System.out.println("500 notes: " + numOf500);
        System.out.println("200 notes: " + numOf200);
        System.out.println("100 notes: " + numOf100);
        System.out.println("50 notes: " + numOf50);
        System.out.println("20 notes: " + numOf20);
        System.out.println("10 notes: " + numOf10);
        System.out.println("05 coins: " + numOf05Coins);
        System.out.println("02 coins: " + numOf02Coins);
        System.out.println("01 coins: " + numOf01Coins);
    }
}
