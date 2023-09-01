import java.util.Scanner;

class Student {
    String name;
    int rollNo;
}
//main

public class StudentInfo {
    public static void main(String[] args) {
        Student student1 = new Student();
        Student student2 = new Student();
        Student student3 = new Student();
        Scanner scanner = new Scanner(System.in);

        //insert
        System.out.println("\n");
        insert(student1, scanner);
        insert(student2, scanner);
        insert(student3, scanner);
        
        //display
        System.out.println("\nThe Students present in the database are: ");
        display(student1);
        display(student2);
        display(student3);
        scanner.close();
    }

    static void insert(Student student, Scanner scanner) {
        System.out.print("Enter Student name: ");
        student.name = scanner.nextLine();
        System.out.print("Enter Student roll number: ");
        student.rollNo = scanner.nextInt();
        System.out.print("-------------------------\n");
        scanner.nextLine();
    }
    static void display(Student student) {
        System.out.println(student.rollNo + " " + student.name);
    }
}
