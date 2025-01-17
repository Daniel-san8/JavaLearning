import java.util.Scanner;

//TIP Para <b>executar</b> o código, pressione <shortcut actionId="Run"/> ou
// clique no ícone <icon src="AllIcons.Actions.Execute"/> no gutter.
public class Main {
    public static void main(String[] args) {
        int password = 2002;

        Scanner sc = new Scanner(System.in);

        int tentativa = sc.nextInt();

        while (tentativa != password) {
            System.out.println("Senha Invalida");
            tentativa = sc.nextInt();
        }
        System.out.println("Acesso permitido");
    }
}