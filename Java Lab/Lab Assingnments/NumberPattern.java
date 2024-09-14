public class NumberPattern {
    public static void main(String[] args) {
        int n = 5; 
        for (int i = 1; i <= n; i++) {
            
            //  spaces
            for (int j = i; j < n; j++) {
                System.out.print(" ");
            }

            // numbers
            int num = i;
            for (int j = 1; j <= i; j++) {
                System.out.print(num++);
            }

            //decrese numbers
            num -= 2;
            for (int j = 1; j < i; j++) {
                System.out.print(num--);
            }

            // Move to the next line
            System.out.println();
        }
    }
}
