import java.util.Scanner;

public class ShoppingCart {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Item: ");
        String item = scanner.nextLine();

        System.out.print("Price: ");
        double price = scanner.nextDouble();

        System.out.print("Quantity: ");
        int quantity = scanner.nextInt();

        double total = price * quantity;

        System.out.printf("Total cost: $%.2f\n", total);

        scanner.close();
    }
}
