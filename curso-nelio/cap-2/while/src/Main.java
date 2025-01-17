import java.util.Scanner;

//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();

        while (x != 0) {
            x = sc.nextInt();
        }

        sc.close();
    }
}