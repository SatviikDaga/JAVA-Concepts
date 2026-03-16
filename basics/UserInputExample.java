import java.util.Scanner;

public class UserInputExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("What's your age: ");
        int age = scanner.nextInt();

        System.out.print("What's your GPA: ");
        double gpa = scanner.nextDouble();

        scanner.nextLine();

        System.out.print("Enter your name: ");
        String name = scanner.nextLine();

        System.out.println("Hello my name is " + name);
        System.out.println("My age is " + age);
        System.out.println("My GPA is " + gpa);

        scanner.close();
    }
}
