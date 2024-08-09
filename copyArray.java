import java.util.Scanner;

public class copyArray {
    public static void main(String[] args){
        int[] arr1 = new int[5];
        for(int i=0; i<5; i++){
            Scanner myObj = new Scanner(System.in);
            System.out.println("enter value");
            int num = myObj.nextInt();
            arr1[i] = num;
        }
        // System.out.println("The Enter Value in array is : ");
        // for(int i=0; i<5; i++){
        //     System.out.print(arr1[i] + " ");
        // }

        int[] arr2 = arr1;
        System.out.println("The Copy Value in array2 is : ");
        for(int i=0; i<5; i++){
            System.out.print(arr2[i] + " ");
        }
    }
}
