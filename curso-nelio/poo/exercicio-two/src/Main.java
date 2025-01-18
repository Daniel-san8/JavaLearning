//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {
        double valor = CurrencyConverter.convert(3.10, 200.00);

        System.out.printf("%.2f%n", valor);
    }
}