import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        Rect rect = new Rect();
        System.out.println("insira altura e largura");

        rect.altura = sc.nextDouble();
        rect.largura = sc.nextDouble();

        System.out.println(rect);
        sc.close();

    }
}