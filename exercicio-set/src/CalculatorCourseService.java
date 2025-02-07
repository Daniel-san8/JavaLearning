import java.util.Scanner;
import java.util.Set;

public class CalculatorCourseService {
    static Scanner sc = new Scanner(System.in);
    public static void CalculatorCourse(int courseQuantity, Set<Integer> listCourse) {
        for (int i = 0; i < courseQuantity; i++) {
            int idStudent = sc.nextInt();
            listCourse.add(idStudent);
        }
    }
}
