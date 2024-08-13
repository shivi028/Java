import java.util.Scanner;

public class project_01 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        // System.out.println("Enter 2 numbers");
        // int num1 = s.nextInt();
        // int num2 = s.nextInt();
        System.out.println(
                "enter 1) for addition\nenter 2) for substraction\nenter 3) for multiplication\nenter 4) for division\nenter 5) to get rectangle area\nenter 6) to get circle area\nenter 7) to get cube volume\nenter 8) to exit");
        int option = s.nextInt();

        switch (option) {
            case 1:
                System.out.println("Enter 2 numbers");
                int num1 = s.nextInt();
                int num2 = s.nextInt();
                System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));
                break;
            case 2:
                System.out.println("Enter 2 numbers");
                int num11 = s.nextInt();
                int num22 = s.nextInt();
                System.out.println(num11 + "-" + num22 + "=" + (num11 - num22));
                break;
            case 3:
                System.out.println("Enter 2 numbers");
                int num111 = s.nextInt();
                int num222 = s.nextInt();
                System.out.println(num111 + "*" + num222 + "=" + (num111 * num222));
                break;
            case 4:
                System.out.println("Enter 2 numbers");
                int num1111 = s.nextInt();
                int num2222 = s.nextInt();
                System.out.println(num1111 + "/" + num2222 + "=" + (num1111 / num2222));
                break;
            case 5:
                System.out.println("Enter the value of length and breadth");
                int len = s.nextInt();
                int bre = s.nextInt();
                System.out.println(
                        "Area of Rectangle with Length : " + len + " and Breradth : " + bre + " is " + (len * bre));
                break;
            case 6:
                System.out.println("Enter the value of radius");
                int rad = s.nextInt();
                System.out.println("Area of Circle with Radius : " + rad + " is " + (3.14f * rad * rad));
                break;
            case 7:
                System.out.println("Enter the value of edge");
                double edge = s.nextDouble();
                System.out.println("The volume of the cube with edge : " + edge + " is " + (edge * edge * edge));
            case 8:
                break;

        }
        s.close();

    }
}
