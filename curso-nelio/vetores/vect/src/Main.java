import java.util.Locale;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        double[] vect = new double[n];
        double vectSum = 0.0;

        for (int i = 0; i < n; i++) {
            vect[i] = sc.nextDouble();
            vectSum += vect[i];
        }
        System.out.printf("%.2f\n", vectSum / n);
    }
}