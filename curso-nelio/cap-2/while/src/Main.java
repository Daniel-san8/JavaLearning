import java.util.Scanner;

//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int x = sc.nextInt();
        int total = x;
        while (x != 0) {
            x = sc.nextInt();
            total += x;
        }
        System.out.println(total);
        sc.close();
    }
}