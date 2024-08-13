import java.util.Random;
import java.util.Scanner;

public class NumberPredictor {
    public static void main(String[] args) {
        Random rand = new Random();
        int Random_Number = rand.nextInt(10);
        // System.out.println(Random_Number);

        Scanner obj = new Scanner(System.in);
        int guess;

        boolean flag = true;
        int count = 0;
        while (flag) {
            System.out.println("Guess a number which computer will generate between 0-10");
            guess = obj.nextInt();
            if (guess == Random_Number) {
                System.out.println("You Guessed Correct in " + count + " time");
                flag = false;
            } else {
                System.out.println("OOPSIE!!, you guessed " + guess + "\nTry Again, You Can Do It.");
                count++;
                flag = true;
            }
        }

        obj.close();
    }
}
