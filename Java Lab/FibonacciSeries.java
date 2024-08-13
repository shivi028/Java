public class FibonacciSeries {
    public static void main(String[] args){
        int num = 7;
        int a = 0, b = 1, i = 0;
        System.out.print(b + " ");
        while(i < num-1){
            int c = a + b;
            System.out.print(c + " ");
            a = b;
            b = c;
            i++;
        }
    }
}
