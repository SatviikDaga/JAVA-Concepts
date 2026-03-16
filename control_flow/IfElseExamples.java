public class IfElseExamples {

    public static void basicIfElse() {

        int age = 20;

        if(age >= 65){
            System.out.println("You are a senior!");
        }
        else if(age >= 18){
            System.out.println("You are an adult!");
        }
        else{
            System.out.println("You are a child!");
        }
    }

    public static void nestedIf(){

        boolean isStudent = false;
        boolean isSenior = false;
        double price = 9.99;

        if(isStudent){
            if(isSenior){
                price *= 0.7;
                System.out.println("Student + Senior discount applied");
            }
            else{
                price *= 0.9;
                System.out.println("Student discount applied");
            }
        }
        else if(isSenior){
            price *= 0.8;
            System.out.println("Senior discount applied");
        }

        System.out.printf("Ticket price: %.2f\n", price);
    }

    public static void main(String[] args) {
        basicIfElse();
        nestedIf();
    }
}
