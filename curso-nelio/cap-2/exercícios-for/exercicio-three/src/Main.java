import java.util.Locale;
import java.util.Scanner;

//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        double pesoOne = sc.nextDouble();
        double pesoTwo = sc.nextDouble();
        double pesoThree = sc.nextDouble();
        double media = ((pesoOne * 2) + (pesoTwo * 3) + (pesoThree * 5)) / 10;
        System.out.printf("%.1f\n", media);

        for (int i = 1; i < n; i++) {

            pesoOne = sc.nextDouble();
            pesoTwo = sc.nextDouble();
            pesoThree = sc.nextDouble();
            media = ((pesoOne * 2) + (pesoTwo * 3) + (pesoThree * 5)) / 10;
            System.out.printf("%.1f\n", media);

        }
    }
}