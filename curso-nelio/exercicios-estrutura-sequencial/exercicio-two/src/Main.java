import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        double pi = 3.14159;

        Scanner sc = new Scanner(System.in);

        double raio = sc.nextDouble();
        double area = pi * Math.pow(raio, 2);

        System.out.printf("Área é igual a: %.4f", area);
    }
}