import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("How many students for course A?");
        Set<Integer> courseQuantity = new HashSet<>();
        int courseA = sc.nextInt();
        for (int i = 0; i < courseA; i++) {
            int quantity = sc.nextInt();
           courseQuantity.add(quantity);
        }
        System.out.print("How many students for course B?");
        int courseB = sc.nextInt();
        for (int i = 0; i < courseB; i++) {
            int quantity = sc.nextInt();
            courseQuantity.add(quantity);
        }
        System.out.print("How many students for course C?");
        int courseC = sc.nextInt();
        for (int i = 0; i < courseC; i++) {
            int quantity = sc.nextInt();
            courseQuantity.add(quantity);
        }
        System.out.println("Total Students: " + courseQuantity.size());

    }
}