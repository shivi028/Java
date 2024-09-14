import java.util.Scanner;

public class ElevatorProblem {
    int c_floor = 0;
    int max_floor = 10;

    public int moveUp() {
        if (c_floor >= 10) {
            System.out.println("Alredy on the top floor");
            return 0;
        }
        c_floor += 1;
        return c_floor;
    }

    public int moveDown() {
        if (c_floor <= 0) {
            System.out.println("Can not move down. Already on ground floor");
            return 0;
        }
        c_floor -= 1;
        return c_floor;
    }

    public static void main(String[] args) {
        ElevatorProblem E = new ElevatorProblem();

        Scanner obj = new Scanner(System.in);
        int choice = 0;

        do {
            System.out.println("Enter 1 to move up\nEnter 2 to move down\nEnter 0 to exit");
            choice = obj.nextInt();
            switch (choice) {
                case 1:
                    int up = E.moveUp();
                    System.out.println("Current Floor after moving up " + up);
                    break;
                case 2:
                    int down = E.moveDown();
                    System.out.println("Current Floor after moving down " + down);
                    break;

                default:
                    System.out.println("Invalid option. Try again");
                    break;
            }

        } while (choice != 0);

        obj.close();

    }
}
