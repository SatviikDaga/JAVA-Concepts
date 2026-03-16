import java.util.Scanner;

public class CompoundInterestCalculator {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Principal: ");
        double principal = scanner.nextDouble();

        System.out.print("Interest rate (%): ");
        double rate = scanner.nextDouble() / 100;

        System.out.print("Times compounded per year: ");
        int n = scanner.nextInt();

        System.out.print("Years: ");
        int time = scanner.nextInt();

        double amount = principal * Math.pow((1 + (rate/n)), n * time);

        System.out.printf("Amount after %d years: $%.2f\n", time, amount);

        scanner.close();
    }
}
