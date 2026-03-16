import java.util.Random;

public class RandomExamples {

    public static void main(String[] args) {

        Random random = new Random();

        int dice = random.nextInt(1,7);
        System.out.println("Dice roll: " + dice);

        boolean coin = random.nextBoolean();

        if(coin){
            System.out.println("HEADS");
        } else{
            System.out.println("TAILS");
        }
    }
}
