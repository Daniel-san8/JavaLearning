import java.util.Scanner;

//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int valor1 =  sc.nextInt();
        int valor2 =  sc.nextInt();
        int valor3 =  sc.nextInt();
        int valor4 =  sc.nextInt();

        int difference = (valor1 * valor2) - (valor3 * valor4);

        System.out.println("Diferença: " + difference);
    }
}