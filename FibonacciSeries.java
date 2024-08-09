import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] arge){
        Scanner myObj = new Scanner(System.in);
        System.out.println("enter the no. of term for febonaci series");
        int fibo = myObj.nextInt();
            try {
                int a = 0;
                int b = 1;
                int i = 1;
                int c = 0;
                int[] res = new int[10];
                res[0] = b;
                while(i < fibo){
                    c = a + b;
                    res[i] = c;
                    a = b;
                    b = c;
                    i++;
                }
        
                for(int j=0; j<res.length; j++){
                    System.out.print(res[j] + " ");
                }
                
            } catch (Exception e) {
                System.err.println("Please Enter the value upto 10 only" + e);
            }      

        myObj.close();
    }
}
