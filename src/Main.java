import com.onlineSchool.classes.*;
import com.onlineSchool.service.*;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        CourseService courseService = new CourseService();
        Course course;
        LectureService lectureService = new LectureService();
        Lecture lecture;
        TeacherService teacherService = new TeacherService();
        Teacher teacher;
        StudentService studentService = new StudentService();
        Student student;
        HomeworkService homeworkService = new HomeworkService();
        Homework homework;
        AdditionalMaterialsService additionalMaterialsService = new AdditionalMaterialsService();
        AdditionalMaterials additionalMaterials;

        while (true) {
            System.out.println("Do you want to create a new course? yes/no");
            String creatNewCourse = scanner.nextLine();
            if (creatNewCourse.equals("yes")) {
                course = courseService.creatCourse();
                System.out.println("");
                System.out.println("You have created a Course object. Course ID is " + Course.counterCourse);
                System.out.println("");
                break;
            } else if (creatNewCourse.equals("no")) {
                System.out.println("");
                System.out.println("Exite program...");
                System.exit(0);
            } else {
                System.out.println("");
                System.out.println("Invalid value entered. Try typing in lower case.");
                System.out.println("");
            }
        }

        while (true) {
            if (Lecture.counterLecture == 8) {
                System.out.println("The maximum number of lectures (8) was created.");
                System.out.println("Exite program...");
                System.exit(0);
            }
            System.out.println("Choose which object you want to create:");
            System.out.println("lecture");
            System.out.println("teacher");
            System.out.println("student");
            System.out.println("nothin (for exit the menu)");

            String chooseObjectInCourse = scanner.nextLine();

            if (chooseObjectInCourse.equals("nothin")) {
                System.out.println("");
                break;
            }

            switch (chooseObjectInCourse) {
                case "teacher":
                    teacher = teacherService.creatTeacher(Course.counterCourse);
                    System.out.println("");
                    System.out.println("You have created a Teacher object");
                    System.out.println("Teacher of Course ID is " + Course.counterCourse);
                    System.out.println("Teacher ID is " + Teacher.counterTeacher);
                    System.out.println("");
                    break;
                case "student":
                    Student student1 = studentService.creatStudent(Course.counterCourse);
                    System.out.println("");
                    System.out.println("You have created a Student object");
                    System.out.println("Student of Course ID is " + Course.counterCourse);
                    System.out.println("Student ID is " + Student.counterStudent);
                    System.out.println("");
                    break;
                default:
                    System.out.println("");
                    System.out.println("Invalid value entered. Try typing in lower case.");
                    System.out.println("");
                    break;
                case "lecture":
                    lecture = lectureService.creatLecture(Course.counterCourse);
                    System.out.println("");
                    System.out.println("You have created a Lecture object");
                    System.out.println("Lecture of Course ID is " + Course.counterCourse);
                    System.out.println("Lecture ID is " + Lecture.counterLecture);
                    System.out.println("");

                    while (true) {
                        System.out.println("Choose which object you want to create:");
                        System.out.println("homework");
                        System.out.println("additional materials");
                        System.out.println("nothin (for exit the program)");

                        String chooseObjectInLecture = scanner.nextLine();

                        if (chooseObjectInLecture.equals("nothin")) {
                            System.out.println("");
                            break;
                        }

                        switch (chooseObjectInLecture) {
                            case "homework":
                                homework = homeworkService.creatHomework();
                                System.out.println("");
                                System.out.println("You have created a Homework object");
                                System.out.println("Lecture Homework ID is " + Lecture.counterLecture);
                                System.out.println("Homewoek ID is " + Homework.counterHomework);
                                System.out.println("");
                                break;
                            case "additional materials":
                                additionalMaterials = additionalMaterialsService.creatAdditionalMaterials();
                                System.out.println("");
                                System.out.println("You have created a Additional materials object");
                                System.out.println("Lecture Additional materials ID is " + Lecture.counterLecture);
                                System.out.println("Lecture ID is " + AdditionalMaterials.counterAdditionalMaterials);
                                System.out.println("");
                                break;
                            default:
                                System.out.println("");
                                System.out.println("Invalid value entered. Try typing in lower case.");
                                System.out.println("");
                        }
                    }
            }
        }

        scanner.close();

        System.out.println("");
        System.out.println("Exite program...");
        System.exit(0);
    }
}