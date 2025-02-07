import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students for course A?");
        Set<Integer> courseQuantity = new HashSet<>();
        int courseA = sc.nextInt();
        CalculatorCourseService.CalculatorCourse(courseA, courseQuantity);

        System.out.print("How many students for course B?");
        int courseB = sc.nextInt();
        CalculatorCourseService.CalculatorCourse(courseB, courseQuantity);

        System.out.print("How many students for course C?");
        int courseC = sc.nextInt();
        CalculatorCourseService.CalculatorCourse(courseC, courseQuantity);

        System.out.println("Total Students: " + courseQuantity.size());

    }
}