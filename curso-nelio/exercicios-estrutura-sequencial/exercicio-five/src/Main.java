import java.util.Locale;
import java.util.Scanner;

//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);

        int pecaOneCode = sc.nextInt();
        int pecaOneQuantity = sc.nextInt();
        double pecaOnePriceUnity = sc.nextDouble();

        int pecaTwoCode = sc.nextInt();
        int pecaTwoQuantity = sc.nextInt();
        double pecaTwoPriceUnity = sc.nextDouble();

        double totalPriceOne = pecaOnePriceUnity * pecaOneQuantity;
        double totalPriceTwo = pecaTwoPriceUnity * pecaTwoQuantity;
        double totalValor = totalPriceOne + totalPriceTwo;

        System.out.printf("Valor a pagar = %.2f", totalValor);
    }
}