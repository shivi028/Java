import java.util.Scanner;

public class Temp {
    public static void main(String[] args) {
        // F = (9/5)C + 32.
        // C = 5/9(°F – 32)
        double fere;
        float C;
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter celcious value");
        int cel = myObj.nextInt();

        fere = (9 / 5) * cel + 32;
        System.out.println("Fahrenheit Temperature " + fere);

        System.out.println("enter Fahrenheit value");
        int F = myObj.nextInt();

        C =  (F - 32) * (5.0f/9.0f);
        System.out.println("Celcius Temperature " + C);
        myObj.close();

    }
}
