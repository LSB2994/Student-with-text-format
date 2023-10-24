package WorkingWithTxtFormat;
import javax.security.sasl.SaslClient;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class StudentMG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int option;
        List<Student> studentList = new ArrayList<>(){{
            add(new Student(1001,"james","Male","Js"));
            add(new Student(1002, "Jork","Male","Java"));
            add(new Student(1003,"Pisey","Female","Web design"));
            add(new Student(1004,"Chhorvy","Female","UX_UI"));
        }};
//do case
        do {
            System.out.println("===========================");
            System.out.println("1. Input Student");
            System.out.println("2. Search Student");
            System.out.println("3. Edit Student");
            System.out.println("4. Delete Student");
            System.out.println("5. Show Student");
            System.out.println("6. Exit");
            System.out.println("-----> choose your option: ");
            option = input.nextInt();
            switch (option){
                case 1:
                    System.out.println("========= studnet input ==========");
                    break;
                case 5:
                    System.out.println("=========== show all Student =========");
                    System.out.println(studentList);
                    break;
                default:
                    System.out.println("Invalid choice!! chose again");
                    break;
            }
        }while (option!=6);
        Student student = new Student();
        studentList.add(student.input(input));
        System.out.println("=== All Student in the list ===");
        System.out.println(student);
    }
}
