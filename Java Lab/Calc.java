import java.util.Scanner;
public class Calc {
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter 2 numbers");
        int num1 = s.nextInt();
        int num2 = s.nextInt();
        System.out.println("enter 1) for addition\nenter 2) for substraction\nenter 3) for multiplication\nenter 4) for division\nenter 5) to exit");
        int option = s.nextInt();

       
            switch(option){
                case 1:
                    int addRes = num1 + num2;
                    System.out.println(addRes);
                    break;
                case 2:
                    int subRes = num1 - num2;
                    System.out.println(subRes);
                    break;
                case 3:
                    int mulRes = num1 * num2;
                    System.out.println(mulRes);
                    break;
                case 4:
                    int divRes = num1 / num2;
                    System.out.println(divRes);
                    break;
                case 5:
                    break;
            }
            s.close();
             

    }
}
