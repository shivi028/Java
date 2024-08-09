import java.util.Scanner;
public class Factorial {

    public static void main(String[] args){
        int fact = 1;

        // taking input process
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the number for factorial");
        int factNum = myObj.nextInt();

        // factorial
        for(int i = 1; i <= factNum; i++){
             fact *= i;
        }
        System.out.println("Result is : " + fact);
        myObj.close();
    }
}