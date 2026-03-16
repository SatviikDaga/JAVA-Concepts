import java.util.Scanner;

public class RectangleArea {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter width: ");
        double width = scanner.nextDouble();

        System.out.print("Enter height: ");
        double height = scanner.nextDouble();

        double area = width * height;

        System.out.printf("Area: %.2f cm^2\n", area);

        scanner.close();
    }
}
