import java.util.Scanner;
public class pattern{
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter the nnumber upto which pattern get prints");
        int num = myObj.nextInt();

        for(int i=0; i<num; i++){
            for(int j=0; j<i; j++){
                System.out.print("*");
            }
            System.out.println('\n');
        }

        myObj.close();
    }
}