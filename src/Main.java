import com.onlineSchool.classes.*;
import com.onlineSchool.service.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        creatingCourse(scanner);

        while (true) {

            if (Lecture.counterLecture == 8) {
                System.out.println("The maximum number of lectures (8) was created.");
                System.out.println("Exite program...");
                System.exit(0);
            }

            System.out.println("\nChoose which object you want to create:");
            System.out.println("lecture");
            System.out.println("teacher");
            System.out.println("student");
            System.out.println("nothin (for exit the menu)");

            String input = scanner.nextLine();

            if (exitProgram(input)) {
                break;
            }
            creatingLectureObjects(scanner, input);
        }

        scanner.close();

        System.out.println("\nExite program...");
        System.exit(0);
    }

    private static void creatingCourse(Scanner scanner) {
        CourseService courseService = new CourseService();

        while (true) {
            System.out.println("Do you want to create a new course? yes/no");
            String creatNewCourse = scanner.nextLine();

            if (creatNewCourse.equals("yes")) {
                courseService.creatCourse();
                System.out.print("\nYou have created a Course object. Course ID is " + Course.counterCourse + "\n");
                break;
            } else if (creatNewCourse.equals("no")) {
                System.out.println("\nExite program...");
                System.exit(0);
            } else {
                System.out.println(" \nInvalid value entered. Try typing in lower case. \n");
            }
        }
    }

    private static void createLectureObjects(String scannerCode) {
        HomeworkService homeworkService = new HomeworkService();
        AdditionalMaterialsService additionalMaterialsService = new AdditionalMaterialsService();

        switch (scannerCode) {
            case "homework":
                homeworkService.creatHomework();
                System.out.println("\nYou have created a Homework object");
                System.out.println("Lecture Homework ID is " + Lecture.counterLecture);
                System.out.println("Homewoek ID is " + Homework.counterHomework + "\n");
                break;
            case "additional materials":
                additionalMaterialsService.creatAdditionalMaterials();
                System.out.println("\nYou have created a Additional materials object");
                System.out.println("Lecture Additional materials ID is " + Lecture.counterLecture);
                System.out.println("Lecture ID is " + AdditionalMaterials.counterAdditionalMaterials + "\n");
                break;
            default:
                System.out.println("\nInvalid value entered. Try typing in lower case. \n");
        }
    }

    private static void creatingLectureObjects(Scanner scanner, String input) {
        LectureService lectureService = new LectureService();
        TeacherService teacherService = new TeacherService();
        StudentService studentService = new StudentService();

        switch (input) {
            case "teacher":
                teacherService.creatTeacher(Course.counterCourse);
                System.out.println("\nYou have created a Teacher object");
                System.out.println("Teacher of Course ID is " + Course.counterCourse);
                System.out.println("Teacher ID is " + Teacher.counterTeacher + "\n");
                break;
            case "student":
                studentService.creatStudent(Course.counterCourse);
                System.out.println("\nYou have created a Student object");
                System.out.println("Student of Course ID is " + Course.counterCourse);
                System.out.println("Student ID is " + Student.counterStudent + "\n");
            default:
                System.out.println("Invalid value entered. Try typing in lower case. \n");
                break;
            case "lecture":
                lectureService.creatLecture(Course.counterCourse);
                System.out.println("\nYou have created a Lecture object");
                System.out.println("Lecture of Course ID is " + Course.counterCourse);
                System.out.println("Lecture ID is " + Lecture.counterLecture + "\n");

                while (true) {
                    System.out.println("Choose which object you want to create:");
                    System.out.println("homework");
                    System.out.println("additional materials");
                    System.out.println("nothin (for exit the program)");

                    input = scanner.nextLine();

                    if (exitProgram(input)) {
                        break;
                    }
                    createLectureObjects(input);
                }
        }
    }

    private static boolean exitProgram(String input) {
        return input.equals("nothin");
    }
}