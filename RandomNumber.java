import java.util.Random;
import java.util.Scanner;
// import java.util.*;
public class RandomNumber {
    public static void main(String[] args){
        // int num;
        Scanner myObj = new Scanner(System.in);
        System.out.println("1) Enter 0 for 2 digit random integer number \n2) Enter 1 for 4 digit random integer number\n3) Enter 2 for random double value from 0 to 1\n4) Enter 3 to exit");

        // make interfaces for methods using
        int option = myObj.nextInt();
        Random rand = new Random();

        // while(){
            switch (option) {
                case 0:
                    int rand_1 = rand.nextInt(10, 100);
                    System.out.println(rand_1);               
                    break;
                case 1:
                    int rand_2 = rand.nextInt(1000, 10000);
                    System.out.println(rand_2); 
                    break;
                case 2:
                    // NOTE: Math.random() only return double
                    double rand_3 = Math.random();
                    System.out.println(rand_3);
                    break;
                case 3:
                    break;
            
                default:
                    break;
            }
            myObj.close();
        // }
    

      
        
    }
}
