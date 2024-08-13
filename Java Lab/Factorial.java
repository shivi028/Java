public class Factorial {
    public static void main(String[] args){
        int num = 7;
        int res = 1;

        // using while loop
        while(num > 0){
            res = res*num;
            num--;
        }

        // using for loop
        for(int i=1; i<=num; i++){
            res = res * i;
        }

        System.out.println(res);
    }
}
