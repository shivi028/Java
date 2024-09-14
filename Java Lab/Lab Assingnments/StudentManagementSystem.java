//  import java.util.Scanner;
// import java.util.HashMap;
// import java.util.Map;


// class subject {
//     int sub_id;
//     String subName;
//     HashMap<Integer, String> subjects = new HashMap<>();

//     public void inputSub() {
//         Scanner scanner = new Scanner(System.in);

//         while (true) {
//             System.out.print("Enter Subject ID (or -1 to exit): ");
//             int Id = scanner.nextInt();
//             if (Id == -1) {
//                 break;
//             }
//             scanner.nextLine(); // Consume newline
//             System.out.print("Enter Subject Name: ");
//             String subject = scanner.nextLine();

//             subjects.put(Id, subject);
//         }
//         scanner.close();
//     }

//     public void displaySubjectDetails() {
//         System.out.println("Subject Details:");
//         for (Map.Entry<Integer, String> entry : subjects.entrySet()) {
//             System.out.println("Subject ID: " + entry.getKey() + ", Subject: " + entry.getValue());
//         }
//     }

//      public boolean subjectExists(int subjectId) {
//     return subjects.containsKey(subjectId);
// }
// }


// class teacher{
//     // subject class object created
//     subject S = new subject();
    
//     int T_id;
//     String TeacherName;
//     String IsTeaching;  
//     int Subject_ID;


//     public void inputTeacherDetails(){
//         Scanner T_Name = new Scanner(System.in);
//         Scanner Teacher_id = new Scanner(System.in);
//         Scanner y_n = new Scanner(System.in);
//         Scanner Sid = new Scanner(System.in);
        
//         int T_Id = Teacher_id.nextInt();
//         String name = T_Name.nextLine();
        
//             this.T_id = T_Id;
//             this.TeacherName = name;

//         T_Name.close();
//         Teacher_id.close();      

//         System.out.println("Is Teacher Teaching a Subject? Enter y or n.");
//         IsTeaching = y_n.nextLine();

//         if (IsTeaching.equalsIgnoreCase("y")) {
//             S.displaySubjectDetails();
//             System.out.println("Enter your Subject ID: ");
//             int subjectId = Sid.nextInt();

//             if (S.subjectExists(subjectId)) {
//                 this.Subject_ID = subjectId;
//                 System.out.println("Subject assigned successfully.");
//             } else {
//                 System.out.println("Subject ID does not exist.");
//             }
//         } else {
//             System.out.println("Currently, you are not teaching any subject!");
//         }

//         y_n.close();
//         Sid.close();
//     }

//     public void displayTeacherDetails(){
//         System.out.println("Teacher Id : " + this.T_id  +  " Teacher Name : " + this.TeacherName + " Teacher Subject ID : " + this.Subject_ID );
//     }
// }

// class student extends subject{
//     int student_id;
//     String student_Name;
//     int[] subject_id;

//     public void inputStudentDetails(){
//         Scanner stu_id = new Scanner(System.in);
//         Scanner stu_name = new Scanner(System.in);
//         int Id = stu_id.nextInt();
//         String name = stu_name.nextLine();
        
//             this.student_id = Id;
//             this.student_Name = name;
//         stu_id.close();
//         stu_name.close();      

//         System.out.println(" Subject List ");
//         // loop to show the subjects

//         System.out.println("Enter the subject code one after another to join the cousrses.");
//         // loop to enter the cousres and save in array

//     }
//     public void displaySubjectDetails(){
//         System.out.println("Stident Id : " + this.student_id  +  "Student Name : " + this.student_Name );
//         System.out.println("Subject Id Student enrolled in : ");
//         for(int i : subject_id){
//             System.out.println(i);
//         }
//     }
// }


// public class StudentManagementSystem{
//     public static void main(String[] args){
//         subject sub = new subject();
//         sub.inputSub();
//         sub.displaySubjectDetails();

//         teacher t = new teacher();
//         t.inputTeacherDetails();
//         t.displayTeacherDetails();
//     }
// }


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

class subject {
    int sub_id;
    String subName;
    HashMap<Integer, String> subjects = new HashMap<>();

    public void inputSub() {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter Subject ID (or -1 to exit): ");
            int Id = scanner.nextInt();
            if (Id == -1) {
                break;
            }
            scanner.nextLine(); // Consume newline
            System.out.print("Enter Subject Name: ");
            String subject = scanner.nextLine();

            subjects.put(Id, subject);
        }
        scanner.close(); // Do not close the Scanner here
    }

    public void displaySubjectDetails() {
        System.out.println("Subject Details:");
        for (Map.Entry<Integer, String> entry : subjects.entrySet()) {
            System.out.println("Subject ID: " + entry.getKey() + ", Subject: " + entry.getValue());
        }
    }

    public boolean subjectExists(int subjectId) {
        return subjects.containsKey(subjectId);
    }

}

class teacher {
    subject S = new subject();

    int T_id;
    String TeacherName;
    String IsTeaching;
    int Subject_ID = -1;

    public void inputTeacherDetails(Scanner scanner) {
        System.out.print("Enter Teacher ID: ");
        int T_Id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Teacher Name: ");
        String name = scanner.nextLine();

        this.T_id = T_Id;
        this.TeacherName = name;

        System.out.println("Is Teacher Teaching a Subject? Enter y or n.");
        IsTeaching = scanner.nextLine();

        if (IsTeaching.equalsIgnoreCase("y")) {
            S.displaySubjectDetails();
            System.out.println("Enter your Subject ID: ");
            int subjectId = scanner.nextInt();

            if (S.subjectExists(subjectId)) {
                this.Subject_ID = subjectId;
                System.out.println("Subject assigned successfully.");
            } else {
                System.out.println("Subject ID does not exist.");
            }
        } else {
            System.out.println("Currently, you are not teaching any subject!");
        }
    }

    public void displayTeacherDetails() {
        System.out.println("Teacher ID: " + this.T_id + ", Teacher Name: " + this.TeacherName + ", Subject ID: " + this.Subject_ID);
    }
}

class student extends subject {
    int student_id;
    String student_Name;
    int[] subject_id;

    public void inputStudentDetails(Scanner scanner) {
        System.out.print("Enter Student ID: ");
        int Id = scanner.nextInt();
        scanner.nextLine(); // Consume newline
        System.out.print("Enter Student Name: ");
        String name = scanner.nextLine();

        this.student_id = Id;
        this.student_Name = name;

        System.out.println(" Subject List ");
        // S.displaySubjectDetails();

        System.out.println("Enter the subject code one after another to join the courses.");
        // loop to enter the courses and save in array
    }

    public void displaySubjectDetails() {
        System.out.println("Student ID: " + this.student_id + " Student Name: " + this.student_Name);
        System.out.println("Subject IDs Student enrolled in: ");
        for (int i : subject_id) {
            System.out.println(i);
        }
    }
}

public class StudentManagementSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        subject sub = new subject();
        sub.inputSub();
        sub.displaySubjectDetails();

        teacher t = new teacher();
        t.S = sub; // Assign the subject instance
        t.inputTeacherDetails(scanner);
        t.displayTeacherDetails();

        scanner.close(); // Close the scanner at the end
    }
}
